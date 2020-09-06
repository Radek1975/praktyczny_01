package pl.sdacademy.cepikapi.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/*
{
        "id": "7042107533078778",
        "type": "pojazdy",
        "attributes": {
            "marka": "RENAULT",
            "kategoria-pojazdu": "11111111",
            "typ": "---",
            "model": "CLIO",
            "wariant": "---",
            "rodzaj-pojazdu": "SAMOCHÓD OSOBOWY",
            "pochodzenie-pojazdu": "UŻYW. IMPORT INDYW",
            "rok-produkcji": "FABRYCZNY",
            "data-pierwszej-rejestracji-w-kraju": "2020-08-01",
            "pojemnosc-skokowa-silnika": 1998,
            "masa-wlasna": 1335,
            "rodzaj-paliwa": "BENZYNA",
            "wojewodztwo-kod": "18"
            }
        }
   */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class CepikCar {
    private Long id;
    private String type;
    private CepikAttributes attributes;
}
