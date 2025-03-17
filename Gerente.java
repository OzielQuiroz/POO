
package com.mycompany.poo;

public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, int id, double salario, String departamento) {
        super(nombre, id, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public String toString() {
        return super.toString() + ", Departamento=" + departamento;
    }
}