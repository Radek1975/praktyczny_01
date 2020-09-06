package pl.sdacademy.cepikapi.api;

import pl.sdacademy.cepikapi.entity.CepikDetailsResponse;
import pl.sdacademy.cepikapi.entity.CepikResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface CepikService {

    @GET("pojazdy")
    Call<CepikResponse> getPojazdy(
            @Query("wojewodztwo") String wojewodztwo,
            @Query("data-od") String dataOd,
            @Query("page") Integer page);

    @GET("pojazdy/{id}")
    Call<CepikDetailsResponse> getPojazdDetails(@Path("id") Long id);
}
