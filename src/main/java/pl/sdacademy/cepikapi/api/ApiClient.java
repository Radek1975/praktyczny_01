package pl.sdacademy.cepikapi.api;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import javax.net.ssl.*;

public class ApiClient {

    private OkHttpClient getUnsafeOkHttpClient() {
        try {
            final TrustManager[] trustAllCerts = new TrustManager[]{
                    new X509TrustManager() {

                        public void checkClientTrusted(java.security.cert.X509Certificate[] chain, String authType) {
                        }


                        public void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType) {
                        }


                        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                            return new java.security.cert.X509Certificate[]{};
                        }
                    }
            };

            final SSLContext sslContext = SSLContext.getInstance("SSL");
            sslContext.init(null, trustAllCerts, new java.security.SecureRandom());
            final SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();

            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.sslSocketFactory(sslSocketFactory, (X509TrustManager) trustAllCerts[0]);
            builder.hostnameVerifier(new HostnameVerifier() {
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            });

            OkHttpClient okHttpClient = builder.build();
            return okHttpClient;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CepikService getCepikService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.cepik.gov.pl/")
                .addConverterFactory(JacksonConverterFactory.create())
                .client(getUnsafeOkHttpClient()) //do wyryfikacji ssl-i
                .build();

        CepikService service = retrofit.create(CepikService.class);
        return service;
    }

}
