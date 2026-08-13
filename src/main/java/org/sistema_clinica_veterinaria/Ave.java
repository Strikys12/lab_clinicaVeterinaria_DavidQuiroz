package org.sistema_clinica_veterinaria;

public class Ave extends  Animal implements Asegurable{
    private double pesoGramos;

    public Ave(String nombre, String nombrePropietario, int edad, double pesoGramos) {
        super(nombre, nombrePropietario, edad);
        this.pesoGramos = pesoGramos;
    }

    public double getPesoGramos() {
        return pesoGramos;
    }

    @Override
    public String fichaAnimal(){
       return super.fichaAnimal() + " | Peso gramos: " + pesoGramos;
    }

    @Override
    public double costoConsulta() {
        return 28000 + (pesoGramos * 100);
    }

    @Override
    public double calcularPrimaSeguro() {
        return 5000000;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-AVE-" + this.nombre;
    }
}
