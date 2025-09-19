package model;

public class Elefante extends Animal {

    public Elefante(int id, String nombre) {
        super(id, nombre, TipoAnimal.ELEFANTE);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " (" + getTipo() + ") hace: Barrito");
    }
}
