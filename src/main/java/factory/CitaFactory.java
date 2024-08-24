package factory;

import model.Cita;
import model.Cliente;

import java.time.LocalDate;


public class CitaFactory {
    public static Cita crearCita(Cliente cliente, String fecha, String hora) {
        return new Cita(cliente, fecha, hora);
    }
}