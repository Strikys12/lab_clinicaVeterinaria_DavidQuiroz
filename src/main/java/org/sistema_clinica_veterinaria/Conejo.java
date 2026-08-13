package org.sistema_clinica_veterinaria;

public class Conejo extends Animal{

    public Conejo(String nombre, String nombrePropietario, int edad) {
        super(nombre, nombrePropietario, edad);
    }

    @Override
    public double costoConsulta() {
        return 35000;
    }
}
