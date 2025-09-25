package app;

import model.Mascota;

import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacion {
        private static ArrayList<Mascota> mascotas = new ArrayList<>();
        private static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
            int opcion;
            do {
                System.out.println(" SISTEMA VETERINARIA AMIGOS PELUDOS ");
                System.out.println("1. Registrar mascota");
                System.out.println("2. Listar mascotas");
                System.out.println("3. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = sc.nextInt();
                sc.nextLine();

                private void registrarMascota;
                (); {
                    System.out.print("ID (único): ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    for (Mascota m : mascotas) {
                        if (m.getId() == id) {
                            System.out.println(" Ya existe una mascota con ese ID.");
                            return;
                        }
                    }

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Especie: ");
                    String especie = sc.nextLine();

                    System.out.print("Raza: ");
                    String raza = sc.nextLine();

                    System.out.print("Edad: ");
                    int edad = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Color: ");
                    String color = sc.nextLine();

                    System.out.print("Peso (kg): ");
                    double peso = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Cantidad de enfermedades: ");
                    int cantEnf = sc.nextInt();
                    sc.nextLine();

                    String[] enfermedades = new String[cantEnf];
                    for (int i = 0; i < cantEnf; i++) {
                        System.out.print("Enfermedad " + (i + 1) + ": ");
                        enfermedades[i] = sc.nextLine();
                    }

                    Mascota nueva = new Mascota(id, nombre, especie, raza, edad, color, peso, enfermedades);
                    mascotas.add(nueva);
                    System.out.println("Mascota registrada con éxito.");
                }

                private static void listarMascotas () {
                    if (mascotas.isEmpty()) {
                        System.out.println(" No hay mascotas registradas.");
                    } else {
                        System.out.println("\n--- LISTA DE MASCOTAS ---");
                        for (Mascota m : mascotas) {
                            m.mostrarInfo();
                        }
                    }
                }
            }