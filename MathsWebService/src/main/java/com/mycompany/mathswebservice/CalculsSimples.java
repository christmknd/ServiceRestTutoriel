/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.mycompany.mathswebservice;

import java.util.ArrayList;
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
    
    
      /**
     * Web service operation
     */
    @WebMethod(operationName = "decomposer")
    public List decomposer(@WebParam(name = "entier") int entier) {
        //TODO write your implementation code here:
        List l = new ArrayList();
        int i=2;
        while(i<entier){
            if(entier %i ==0){
                l.add(i);
                entier=entier/i;
            } else 
                i++;
        }
        return l;
    }
    

 
    @WebMethod(operationName = "premier")
    public boolean premier(@WebParam(name = "entier") int entier) {
        return decomposer(entier).size()==1;
    }
    
    
    public static void main(String[] args){

    CalculsSimples m = new CalculsSimples();

    System.out.println("premier 8 ? " + m.premier(8));
    System.out.println("premier 5 ? " + m.premier(5));

    System.out.println("decomposer 8 : " + m.decomposer(8));
    System.out.println("decomposer 362880 :" + m.decomposer(362880));

}

  
    
    
}
