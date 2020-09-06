package pl.sdacademy.cepikapi.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class CepikResponse {
    private List<CepikCar> data;
}
