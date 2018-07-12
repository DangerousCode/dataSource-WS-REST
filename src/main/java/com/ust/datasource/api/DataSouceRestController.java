package com.ust.datasource.api;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@Slf4j
@RestController
@RequiredArgsConstructor
public class DataSouceRestController implements DataSouceAPI {

    private final Random random;

    @Override
    @PostMapping(path = "/go")
    public ResponseEntity<Data> create(final @RequestBody Data data) {
        log.info("data:{}", data);
        return ResponseEntity.ok(Data.builder()
            .id(String.valueOf(Math.abs(random.nextInt())))
            .name(data.getName())
            .email(data.getEmail())
            .salary(data.getSalary())
            .dni(data.getDni())
            .fecnac(data.getFecnac())
            .direccion(data.getDireccion())
            .ctacte(data.getCtacte())
            .estadocivil(data.getEstadocivil())
            .sexo(data.getSexo())
            .fecalta(data.getFecalta())
            .categoria(data.getCategoria())
            .tipocontrato(data.getTipocontrato())
            .nsegsoc(data.getNsegsoc())
            .numtel(data.getNumtel())
            .fecbaja(data.getFecbaja())
            .build());
    }

}
