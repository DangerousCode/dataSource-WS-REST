package com.ust.datasource.api;

import lombok.*;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Data {

    private String id;
    private String name;
    private String email;
    private String salary;
    private String dni;
    private String fecnac;
    private String direccion;
    private String ctacte;
    private String estadocivil;
    private String sexo;
    private String fecalta;
    private String categoria;
    private String tipocontrato;
    private String nsegsoc;
    private String numtel;
    private String fecbaja;

}
