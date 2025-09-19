package model;

public abstract class Animal {

    private String nombre;
    private String sonido;
    private tipoAnimal tipo;

    public Animal(String nombre, tipoAnimal tipo, String sonido){
        this.nombre = nombre;
        this.tipo = tipo;
        this.sonido = sonido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public tipoAnimal getTipo() {
        return tipo;
    }

    public void setTipo(tipoAnimal tipo) {
        this.tipo = tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", sonido=" + sonido + '}';
    }

    public abstract void hacerSonido();
}
