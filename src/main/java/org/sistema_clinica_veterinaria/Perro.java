package org.sistema_clinica_veterinaria;

public class Perro extends Animal implements Asegurable, Vacunable{
    private int vacunasAplicadas = 0;
    private String raza;

    public Perro(String nombre, String nombrePropietario, int edad, String raza) {
        super(nombre, nombrePropietario, edad);
        this.raza  = raza;
    }


    @Override
    public double costoConsulta() {
        return 45000 + (edad * 3000);
    }

    @Override
    public String fichaAnimal(){
        return super.fichaAnimal() + " |Raza: " + this.raza;
    }

    public String getRaza() {
        return raza;
    }

    @Override
    public double calcularPrimaSeguro() {
        return 80000 * edad;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-PERRO" + this.nombre;
    }

    @Override
    public void registrarVacuna(String nombreVacuna) {
        vacunasAplicadas++;
        System.out.println(nombreVacuna + " Registrada con éxito: " + " | Número de vacunas aplicadas: " + getVacunasAplicadas());

    }

    @Override
    public int getVacunasAplicadas() {
        return this.vacunasAplicadas;
    }
}
