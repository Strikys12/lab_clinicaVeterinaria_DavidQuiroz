package org.sistema_clinica_veterinaria;


public class Main {
    public static void main(String[] args) {

        System.out.println("---PARTE 1----");
        Animal[] animales = new Animal[4];


        animales[0] = new Perro("Aria", "David Quiroz", 8, "Bulldozer");
        animales[1] = new Gato("Michi", "Ana", 2, true);
        animales[2] = new Ave("Lucas", "Sofía", 1, 350.0);
        animales[3] = new Conejo("Nieves", "María Victoria", 2);



    for(Animal animal : animales ){
        System.out.println(animal.fichaAnimal()+"\n");
    }

        System.out.println("---PARTE2---");
        Perro perro = (Perro) animales[0];
        Gato gato = (Gato) animales[1];

        perro.registrarVacuna("Vacuna Antirrábica");
        perro.registrarVacuna("Vacuna polivalente");
        gato.registrarVacuna("Vacuna triple felina");

        System.out.println();
        System.out.println("---PARTE 3---");


        Clinica clinica = new Clinica("Fidel Suarez", "Calle 88 # 88 - 88");
        Asegurable[] asegurables = new Asegurable[]{perro,gato,clinica};

        for (Asegurable asegurable: asegurables){
            System.out.println("Número de poliza: "+ asegurable.obtenerNumeroPoliza() + " | " + "Prima Anual: " +asegurable.calcularPrimaSeguro());
        }
    }



}