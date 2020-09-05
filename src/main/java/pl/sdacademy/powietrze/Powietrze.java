package pl.sdacademy.powietrze;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class Powietrze {
    public static void main(String[] args) throws IOException {
        ObjectMapper om = new ObjectMapper();
        Station station = om.readValue(new URL("http://api.gios.gov.pl/pjp-api/rest/aqindex/getIndex/114"), Station.class);

        System.out.println(station.getId() + " " + station.getStCalcDate());
    }
}
