
package com.mycompany.poo;

public class GestionEmpleados {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Laura Díaz", 201, 70000.0, "Ventas");
        Desarrollador desarrollador = new Desarrollador("Carlos Ruiz", 301, 60000.0, "Java");

        System.out.println(gerente);
        System.out.println(desarrollador);

        gerente.aumentarSalario(15);
        System.out.println("Nuevo salario del gerente: " + gerente.getSalario());
    }
}