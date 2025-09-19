package model;

public class Hipopotamo extends Animal {

    public Hipopotamo(int id, String nombre) {
        super(id, nombre, TipoAnimal.HIPOPOTAMO);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " (" + getTipo() + ") hace: Gruñido");
    }
}
