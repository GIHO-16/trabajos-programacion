package model;

public class Jirafa extends Animal {

    public Jirafa(int id, String nombre) {
        super(id, nombre, TipoAnimal.JIRAFA);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " (" + getTipo() + ") hace: Bufido");
    }
}

