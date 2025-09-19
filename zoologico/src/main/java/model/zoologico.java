package model;

import java.util.ArrayList;

public class Zoologico {
    private ArrayList<Animal> animales = new ArrayList<>();

    public void agregarAnimal(Animal animal) {
        animales.add(animal);
        System.out.println("Animal agregado: " + animal.getNombre());
    }

    public void listarAnimales() {
        if (animales.isEmpty()) {
            System.out.println("No hay animales registrados.");
        } else {
            for (Animal a : animales) {
                System.out.println(a);
            }
        }
    }

    public void actualizarAnimal(String nombreActual, String nuevoNombre) {
        for (Animal a : animales) {
            if (a.getNombre().equalsIgnoreCase(nombreActual)) {
                a.setNombre(nuevoNombre);
                System.out.println("Animal actualizado: " + nuevoNombre);
                return;
            }
        }
        System.out.println("Animal con nombre " + nombreActual + " no encontrado.");
    }

    public void eliminarAnimal(String nombre) {
        boolean eliminado = animales.removeIf(a -> a.getNombre().equalsIgnoreCase(nombre));
        if (eliminado) {
            System.out.println("Animal eliminado: " + nombre);
        } else {
            System.out.println("Animal con nombre " + nombre + " no encontrado.");
        }
    }

    public void hacerSonarTodos() {
        if (animales.isEmpty()) {
            System.out.println("No hay animales para hacer sonido.");
        } else {
            for (Animal a : animales) {
                a.hacerSonido();
            }
        }
    }
}