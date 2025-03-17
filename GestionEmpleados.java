
package com.mycompany.poo;

public class GestionEmpleados { //Se llaman las anteriores clases y se realiza la igualacion de los mismos para darle valores y mostrarlos en consola
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Laura Díaz", 201, 70000.0, "Ventas");
        Desarrollador desarrollador = new Desarrollador("Carlos Ruiz", 301, 60000.0, "Java");

        System.out.println(gerente);
        System.out.println(desarrollador);
//Se llaman a los metodos y se muestran en pantalla
        gerente.aumentarSalario(15);
        desarrollador.aumentaSalario(20);
        System.out.println("Nuevo salario del gerente: " + gerente.getSalario());
        System.out.prinln("Nuevo salario del desarrollador: " + desarrollador.getSalario());
    }
}
