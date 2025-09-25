package model;

public class Veterinario {
        private String nombre;
        private String identificacion;
        private String tarjetaProfesional;
        private int aniosExperiencia;
        private Especialidad especialidad;
        private String telefono;
        private String correo;

        public Veterinario(String nombre, String identificacion, String tarjetaProfesional,
                           int aniosExperiencia, Especialidad especialidad,
                           String telefono, String correo) {
            this.nombre = nombre;
            this.identificacion = identificacion;
            this.tarjetaProfesional = tarjetaProfesional;
            this.aniosExperiencia = aniosExperiencia;
            this.especialidad = especialidad;
            this.telefono = telefono;
            this.correo = correo;
        }

        // Enum para Especialidad
        public enum Especialidad {
            MEDICINA_INTEGRAL(0),
            CIRUGIA_INTEGRAL(1),
            DERMATOLOGIA_INTEGRAL(2);

            private int codigo;

            Especialidad(int codigo) {
                this.codigo = codigo;
            }

            public int getCodigo() { return codigo; }
        }

        // Getters y Setters
        public String getNombre() { return nombre; }
        public void setNombre(String nombre) { this.nombre = nombre; }

        public String getIdentificacion() { return identificacion; }
        public void setIdentificacion(String identificacion) { this.identificacion = identificacion; }

        public String getTarjetaProfesional() { return tarjetaProfesional; }
        public void setTarjetaProfesional(String tarjetaProfesional) { this.tarjetaProfesional = tarjetaProfesional; }

        public int getAniosExperiencia() { return aniosExperiencia; }
        public void setAniosExperiencia(int aniosExperiencia) { this.aniosExperiencia = aniosExperiencia; }

        public Especialidad getEspecialidad() { return especialidad; }
        public void setEspecialidad(Especialidad especialidad) { this.especialidad = especialidad; }

        public String getTelefono() { return telefono; }
        public void setTelefono(String telefono) { this.telefono = telefono; }

        public String getCorreo() { return correo; }
        public void setCorreo(String correo) { this.correo = correo; }

        @Override
        public String toString() {
            return "Veterinario: " + nombre + ", ID: " + identificacion +
                    ", TP: " + tarjetaProfesional + ", Experiencia: " + aniosExperiencia + " años" +
                    ", Especialidad: " + especialidad +
                    ", Tel: " + telefono + ", Correo: " + correo;
        }
    }

