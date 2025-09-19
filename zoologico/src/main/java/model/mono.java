package model;

public class Mandril extends Animal {

    public Mandril(int id, String nombre) {
        super(id, nombre, TipoAnimal.MANDRIL);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " (" + getTipo() + ") hace: Gritos");
    }
}

