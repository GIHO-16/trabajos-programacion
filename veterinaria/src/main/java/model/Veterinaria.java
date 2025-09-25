package model;

public class Veterinaria {
        private String nombre;
        private String telefono;
        private String direccion;
        private String nit;

        public Veterinaria(String nombre, String telefono, String direccion, String nit) {
            this.nombre = nombre;
            this.telefono = telefono;
            this.direccion = direccion;
            this.nit = nit;
        }

        // Getters y Setters
        public String getNombre() { return nombre; }
        public void setNombre(String nombre) { this.nombre = nombre; }

        public String getTelefono() { return telefono; }
        public void setTelefono(String telefono) { this.telefono = telefono; }

        public String getDireccion() { return direccion; }
        public void setDireccion(String direccion) { this.direccion = direccion; }

        public String getNit() { return nit; }
        public void setNit(String nit) { this.nit = nit; }

        @Override
        public String toString() {
            return "Veterinaria: " + nombre + ", Tel: " + telefono +
                    ", Dirección: " + direccion + ", NIT: " + nit;
        }
    }

