package controller;

import factory.CitaFactory;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import model.Cliente;
import model.Cita;

import java.time.LocalDate;

public class CitaController {

    @FXML
    private TextField nombreField;

    @FXML
    private TextField telefonoField;

    @FXML
    private DatePicker fechaField;

    @FXML
    private TextField horaField;

    @FXML
    protected void agendarCita() {
        String nombre = nombreField.getText();
        String telefono = telefonoField.getText();
        LocalDate fecha = fechaField.getValue();
        String hora = horaField.getText();

        if (nombre.isEmpty() || telefono.isEmpty() || fecha == null || hora.isEmpty()) {
            System.out.println("Por favor, complete todos los campos.");
            return;
        }

        Cliente cliente = new Cliente(nombre, telefono);
        Cita cita = CitaFactory.crearCita(cliente, fecha, hora);


        System.out.println("Cita agendada para: " + cliente.getNombre() + " el " + cita.getFecha() + " a las " + cita.getHora());
    }
}