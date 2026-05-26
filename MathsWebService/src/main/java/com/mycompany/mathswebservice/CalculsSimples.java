/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.mycompany.mathswebservice;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author user
 */
@WebService(serviceName = "CalculsSimples")
public class CalculsSimples {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

  
    @WebMethod(operationName = "additionner")
    public Double additionner(@WebParam(name = "nombreA") double nombreA, @WebParam(name = "nombreB") double nombreB) {
        //TODO write your implementation code here:
        return nombreA + nombreB;
    }
    
    

 
    @WebMethod(operationName = "premier")
    public int premier(@WebParam(name = "entier") int entier) {
        //TODO write your implementation code here:
        return 0;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "decomposer")
    public List decomposer(@WebParam(name = "entier") int entier) {
        //TODO write your implementation code here:
        return null;
    }
    
    
    
}
