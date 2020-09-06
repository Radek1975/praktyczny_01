package pl.sdacademy.cepikapi.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/*
{
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
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class CepikAttributes {
    private String marka;
    @JsonProperty("rodzaj-pojazdu")
    private String rodzajPojazdu;
    @JsonProperty("pochodzenie-pojazdu")
    private String pochodzeniePojazdu;
    @JsonProperty("rodzaj-paliwa")
    String rodzajPaliwa;
    @JsonProperty("kierownica-po-prawej-stronie-pierwotnie")
    private Boolean kierownicaPoPrawejStroniePierwotnie;
}
