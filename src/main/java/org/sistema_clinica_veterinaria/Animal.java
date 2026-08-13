package org.sistema_clinica_veterinaria;

public abstract class Animal {



    protected String nombre;
    protected  String nombrePropietario;
    protected int edad;

    public Animal(String nombre, String nombrePropietario, int edad) {
        this.nombre = nombre;
        this.nombrePropietario = nombrePropietario;
        this.edad = edad;
    }

    public abstract double costoConsulta();

    public String fichaAnimal(){
        return "Nombre: " + nombre + " | Nombre Propietario: " + nombrePropietario + " | Edad:" + edad + " Años";
    }
}
