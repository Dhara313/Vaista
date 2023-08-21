package com.vaistra;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class CountryWrapper {


     int NO;
    private String COUNTRY;
    private String STATUS;


    public CountryWrapper(int NO , String COUNTRY,String STATUS) {
        this.NO = NO;
        this.COUNTRY = COUNTRY;
        this.STATUS =  STATUS;
    }



}
