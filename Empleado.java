
package com.mycompany.poo;

public class Empleado {//Se define la clase
    private String nombre;//EL nombre de la clase
    private int id;
    private double salario;

    public Empleado(String nombre, int id, double salario) { 
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }

    public String getNombre() {//Se le cean los atributos
        return nombre;
    }

    public int getId() {
        return id;
    }

    public double getSalario() {
        return salario;
    }
//Se crea un metodo para aumentar el atributo que e aumentara en un futuro
    public void aumentarSalario(double porcentaje) {//
        this.salario += this.salario * (porcentaje / 100);
    }
//Con override podremos llamar y modificar el objeto llamado Empleado para su futura modificacion
    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", id=" + id + ", salario=" + salario + "]";
    }
}
