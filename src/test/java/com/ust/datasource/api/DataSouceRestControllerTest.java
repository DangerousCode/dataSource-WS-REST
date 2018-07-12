package com.ust.datasource.api;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class DataSouceRestControllerTest {

    private DataSouceAPI dataSouceRestController;

    private @Mock
    Random random;

    private @Mock
    Data data;

    @Before
    public void setUp() {
        dataSouceRestController = new DataSouceRestController(random);
    }

    @Test
    public void create() {
        final ResponseEntity<Data> entity = dataSouceRestController.create(data);
        assertThat(entity).isNotNull();
    }

}