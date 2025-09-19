package app;

import model.*;

public class App {
    public static void main(String[] args) {
        Zoologico zoo = new Zoologico();

        Animal leon = new Leon("Simba", TipoAnimal.MAMIFERO);
        Animal elefante = new Elefante("Dumbo", TipoAnimal.MAMIFERO);
        Animal jirafa = new Jirafa("Melman", TipoAnimal.MAMIFERO);
        Animal hipopotamo = new Hipopotamo("Gloria", TipoAnimal.MAMIFERO);
        Animal mandril = new Mandril("Rafiki", TipoAnimal.MAMIFERO);

        zoo.agregarAnimal(leon);
        zoo.agregarAnimal(elefante);
        zoo.agregarAnimal(jirafa);
        zoo.agregarAnimal(hipopotamo);
        zoo.agregarAnimal(mandril);

        System.out.println("\n Lista de Animales ");
        zoo.listarAnimales();

        System.out.println("\nSonidos de los Animales ");
        zoo.hacerSonarTodos();

        System.out.println("\n Eliminando a Gloria");
        zoo.eliminarAnimal(hipopotamo);

        System.out.println("\n Lista Actualizada ");
        zoo.listarAnimales();
    }
}
}
