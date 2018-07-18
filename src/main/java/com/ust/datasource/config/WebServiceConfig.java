package com.ust.datasource.config;

import com.ust.datasource.api.DataOperation;
import lombok.RequiredArgsConstructor;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration
@RequiredArgsConstructor
public class WebServiceConfig {

    public static final String ENDPOINT = "/data";

    private final Bus bus;

    @Bean
    public Endpoint endpoint(final DataOperation dataOperation) {
        final EndpointImpl endpoint = new EndpointImpl(bus, dataOperation);
        endpoint.publish(ENDPOINT);
        return endpoint;
    }
}
