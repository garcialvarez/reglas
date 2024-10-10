package com.udea.reglas.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Participant {

    private String name;
    private int age;
    private int stratum; // Entre 1 y 6
    //private String employmentType; //Indefinite, Fixed-term, Independent, Services, Unemployed,..."
    private String loanPurpose; //Education, Home Purchase, Car Purchase, Business, ..."
    private boolean hasChildren;
    private boolean hasPreviousLoans;
    private int creditScore;
    private long annualSalary;
    private long existingDebt;
    private long loanAmount;
    /*
    Añadir 10 reglas más de acuerdo a los parámetros de Participant, por ejemplo
    Si age es < 18, se rechaza por menor de edad
    18 - 25, tasa preferencial

    Considerar estrato, si tiene hijos, si es empleado independiente, o termino fijo / indefinido,
    si es por prestación de servicio, etc.

    No solo tasa de interés, sino ofrecer tarjeta de crédito, crédito rotativo, ese tipo de cosas.
     */

}
