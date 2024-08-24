package model;

import java.time.LocalDate;

public class Cita {
    private Cliente cliente;
    private String fecha;
    private String hora;

    // Constructor
    public Cita(Cliente cliente, String fecha, String hora) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.hora = hora;
    }

    // Getters
    public Cliente getCliente() {
        return cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    // Setters
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}

