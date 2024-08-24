package controller;

import factory.CitaFactory;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import model.Cliente;
import model.Cita;



public class CitaController {

    @FXML
    private TextField nombreField;

    @FXML
    private TextField telefonoField;

    @FXML
    private TextField fechaField;

    @FXML
    private TextField horaField;

    @FXML
    protected void agendarCita() {
        Cliente cliente = new Cliente(nombreField.getText(), telefonoField.getText());
        Cita cita = CitaFactory.crearCita(cliente, fechaField.getText(), horaField.getText());

        // Lógica para manejar la cita, por ejemplo, guardarla en una lista
        System.out.println("Cita agendada para: " + cliente.getNombre() + " el " + cita.getFecha() + " a las " + cita.getHora());
    }
}