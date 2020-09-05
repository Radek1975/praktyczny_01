package pl.sdacademy.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Document document = Jsoup
                .connect("https://www.olx.pl/motoryzacja/samochody/toyota/avensis/opolskie/?search%5Bfilter_float_year%3Afrom%5D=2010&search%5Bfilter_enum_car_body%5D%5B0%5D=estate-car")
                .followRedirects(true)
                .get();
        Elements elements = document.select("#offers_table a strong");


        for(Element title : elements) {
            System.out.println(title.text());
        }
    }
}
