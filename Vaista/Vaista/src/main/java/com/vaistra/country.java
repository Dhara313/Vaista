package com.vaistra;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

@Data
@Entity
public class country {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int NO;
    @NotNull(message="enter")
    private String COUNTRY;
    private String STATUS;


}
