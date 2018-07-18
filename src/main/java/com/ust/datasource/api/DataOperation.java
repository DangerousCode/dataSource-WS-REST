package com.ust.datasource.api;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import java.util.List;


@WebService
public interface DataOperation {

    @WebResult
    @RequestWrapper
    @WebMethod
    @ResponseWrapper
    Data createData(@WebParam Data data);

    @WebResult
    @RequestWrapper
    @WebMethod
    @ResponseWrapper
    Data readData(@WebParam(name = "id") String id);

    @WebResult
    @RequestWrapper
    @WebMethod
    @ResponseWrapper
    List<Data> findByName(@WebParam(name = "name") String name);

    @WebResult
    @RequestWrapper
    @WebMethod
    @ResponseWrapper
    Data findByDni(@WebParam(name = "dni") String dni);

    @WebResult
    @RequestWrapper
    @WebMethod
    @ResponseWrapper
    Data update( Data data);

    @WebResult
    @RequestWrapper
    @WebMethod
    @ResponseWrapper
    void delete(@WebParam(name = "id") String id);

    @WebResult
    @RequestWrapper
    @WebMethod
    @ResponseWrapper
    List<Data> findAll();

}
