package pl.sdacademy.powietrze;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Station {
    private Integer id;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date stCalcDate; //":"2020-09-05 12:20:17",
    private IndexLevel no2IndexLevel;
    private IndexLevel stIndexLevel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getStCalcDate() {
        return stCalcDate;
    }

    public void setStCalcDate(Date stCalcDate) {
        this.stCalcDate = stCalcDate;
    }

    public IndexLevel getNo2IndexLevel() {
        return no2IndexLevel;
    }

    public void setNo2IndexLevel(IndexLevel no2IndexLevel) {
        this.no2IndexLevel = no2IndexLevel;
    }

    public IndexLevel getStIndexLevel() {
        return stIndexLevel;
    }

    public void setStIndexLevel(IndexLevel stIndexLevel) {
        this.stIndexLevel = stIndexLevel;
    }
}
