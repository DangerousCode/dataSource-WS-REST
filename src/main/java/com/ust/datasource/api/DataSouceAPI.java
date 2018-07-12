package com.ust.datasource.api;

import org.springframework.http.ResponseEntity;

public interface DataSouceAPI {

    ResponseEntity<Data> create(Data data);
}
