package model;

public class Cita {
        private String codigo;
        private String fecha;
        private double costo;
        private String hora;
        private String motivo;
        private String observaciones;

        public Cita(String codigo, String fecha, double costo, String hora, String motivo, String observaciones) {
            this.codigo = codigo;
            this.fecha = fecha;
            this.costo = costo;
            this.hora = hora;
            this.motivo = motivo;
            this.observaciones = observaciones;
        }

        // Getters y Setters
        public String getCodigo() { return codigo; }
        public void setCodigo(String codigo) { this.codigo = codigo; }

        public String getFecha() { return fecha; }
        public void setFecha(String fecha) { this.fecha = fecha; }

        public double getCosto() { return costo; }
        public void setCosto(double costo) { this.costo = costo; }

        public String getHora() { return hora; }
        public void setHora(String hora) { this.hora = hora; }

        public String getMotivo() { return motivo; }
        public void setMotivo(String motivo) { this.motivo = motivo; }

        public String getObservaciones() { return observaciones; }
        public void setObservaciones(String observaciones) { this.observaciones = observaciones; }

        @Override
        public String toString() {
            return "Cita [Código=" + codigo +
                    ", Fecha=" + fecha +
                    ", Hora=" + hora +
                    ", Costo=" + costo +
                    ", Motivo=" + motivo +
                    ", Observaciones=" + observaciones + "]";
        }
    }

