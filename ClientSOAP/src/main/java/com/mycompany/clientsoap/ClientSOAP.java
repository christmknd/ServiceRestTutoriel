/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clientsoap;

/**
 *
 * @author user
 */

public class ClientSOAP {

    public static void main(String[] args) {

        System.out.println("Addition : " + additionner(5, 3));

        System.out.println("7 est premier ? " + premier(7));

        System.out.println("Décomposition de 12 : " + decomposer(12));

    }

    private static Double additionner(double nombreA, double nombreB) {
        com.mycompany.mathswebservice.CalculsSimples_Service service =
                new com.mycompany.mathswebservice.CalculsSimples_Service();

        com.mycompany.mathswebservice.CalculsSimples port =
                service.getCalculsSimplesPort();

        return port.additionner(nombreA, nombreB);
    }

    private static boolean premier(int entier) {
        com.mycompany.mathswebservice.CalculsSimples_Service service =
                new com.mycompany.mathswebservice.CalculsSimples_Service();

        com.mycompany.mathswebservice.CalculsSimples port =
                service.getCalculsSimplesPort();

        return port.premier(entier);
    }

    private static java.util.List<java.lang.Object> decomposer(int entier) {
        com.mycompany.mathswebservice.CalculsSimples_Service service =
                new com.mycompany.mathswebservice.CalculsSimples_Service();

        com.mycompany.mathswebservice.CalculsSimples port =
                service.getCalculsSimplesPort();

        return port.decomposer(entier);
    }
}