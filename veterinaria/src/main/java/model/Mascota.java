package model;

public class Mascota {
    private int id;
    private String nombre;
    private String especie;
    private String raza;
    private byte edad;
    private String color;
    private double peso;
    private String[] enfermedades;

    public Mascota(int id, String nombre, String especie, String raza, byte edad, String color, double peso, String[] enfermedades) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.color = color;
        this.peso = peso;
        this.enfermedades = enfermedades;

    }
//get y set


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String[] getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(String[] enfermedades) {
        this.enfermedades = enfermedades;
    }

    public void mostrarInfo() {
        System.out.println("ID: " + id + " | Nombre: " + nombre + " | Especie: " + especie +
                " | Raza: " + raza + " | Edad: " + edad + " años | Color: " + color +
                " | Peso: " + peso + " kg");
        System.out.print("   Enfermedades: ");
        if (enfermedades != null && enfermedades.length > 0) {
            for (String enf : enfermedades) {
                System.out.print(enf + " ");
            }
        } else {
            System.out.print("Ninguna");
        }
        System.out.println();
    }
}

