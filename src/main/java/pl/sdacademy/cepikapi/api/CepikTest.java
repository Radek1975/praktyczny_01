package pl.sdacademy.cepikapi.api;

import pl.sdacademy.cepikapi.entity.CepikCar;
import pl.sdacademy.cepikapi.entity.CepikDetailsResponse;
import pl.sdacademy.cepikapi.entity.CepikResponse;
import retrofit2.Response;

import java.io.IOException;

public class CepikTest {
    public static void main(String[] args) throws IOException {

        ApiClient client = new ApiClient();
        CepikService service = client.getCepikService();


        Response<CepikResponse> response = service
                .getPojazdy("18", "20200104", 1)
                .execute();
        CepikResponse cepikResponse = response.body();

        System.out.println(cepikResponse.getData().size());

        CepikCar car = cepikResponse.getData().get(0);

        Response<CepikDetailsResponse> detailsResponse = service
                .getPojazdDetails(car.getId())
                .execute();

        CepikDetailsResponse details = detailsResponse.body();
        System.out.println(details.getData().getAttributes().getMarka());
        System.out.println(details.getData().getAttributes().getKierownicaPoPrawejStroniePierwotnie());

    }
}

