package org.sistema_clinica_veterinaria;

public class Gato extends Animal implements Asegurable, Vacunable{
    private boolean esEsterilizado;
    private int vacunasAplicadas = 0;

    public Gato(String nombre, String nombrePropietario, int edad, boolean esEsterilizado) {
        super(nombre, nombrePropietario, edad);
        this.esEsterilizado = esEsterilizado;
    }

    public boolean isEsEsterilizado() {
        return esEsterilizado;
    }


    @Override
    public String fichaAnimal(){
        if(esEsterilizado){
            return super.fichaAnimal() + " | Es esterilizado: Sí ";
        }
        else {
            return super.fichaAnimal() + "| Es esterilizado: No ";
        }
    }

    @Override
    public double costoConsulta() {
        return 38000;
    }

    @Override
    public double calcularPrimaSeguro() {
       if(esEsterilizado){
           return 120000;
       }else {
           return 200000;

       }
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-GATO-" + this.nombre;
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
