package model;

public class leon extends Animal{

    public leon( String nombre) {
        super ( nombre, tipoAnimal)
    }
    @Override
    public void hacerSonido (){
        System.out.println(getNombre() + "  (" + getTipo() + ") hace: rugido");
    }
}
