package com.udea.reglas.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data

public class Offer {

    private String product; //Credit Card, Revolving Credit, ..."
    private long limit;

}