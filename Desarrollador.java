
package com.mycompany.poo;

public class Desarrollador extends Empleado {
    private String lenguaje;

    public Desarrollador(String nombre, int id, double salario, String lenguaje) {
        super(nombre, id, salario);
        this.lenguaje = lenguaje;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    @Override
    public String toString() {
        return super.toString() + ", Lenguaje=" + lenguaje;
    }
}