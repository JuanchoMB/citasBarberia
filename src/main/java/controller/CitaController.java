package controller;

import factory.CitaFactory;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import model.Cita;
import model.Cliente;
import java.util.ArrayList;
import java.util.List;

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
    private ListView<String> citasListView;

    // Lista para almacenar las citas
    private List<Cita> citas = new ArrayList<>();


    @FXML
    protected void agendarCita() {
        // Validar que los campos no estén vacíos
        if (nombreField.getText().isEmpty() ||
                telefonoField.getText().isEmpty() ||
                fechaField.getValue() == null ||
                horaField.getText().isEmpty()) {

            // Imprimir mensaje de error en la consola
            System.out.println("Por favor, complete todos los campos antes de agendar la cita.");
            return;
        }
        // Crear el cliente y la cita
        Cliente cliente = new Cliente(nombreField.getText(), telefonoField.getText());
        Cita cita = CitaFactory.crearCita(cliente, fechaField.getValue(), horaField.getText());

        // Guardar la cita en la lista
        citas.add(cita);

        // Imprimir mensaje de confirmación en la consola
        System.out.println("Cita agendada para: " + cliente.getNombre() + " el " + cita.getFecha() + " a las " + cita.getHora());

        // Limpiar las casillas después de agendar la cita
        nombreField.clear();
        telefonoField.clear();
        fechaField.setValue(null);
        horaField.clear();
    }


    @FXML
    protected void mostrarCitas() {
        // Limpiar el ListView antes de añadir nuevas citas
        citasListView.getItems().clear();

        // Recorrer la lista de citas y añadir cada cita al ListView
        for (Cita cita : citas) {
            String detalleCita = "Cita: " + cita.getCliente().getNombre() + " el " + cita.getFecha() + " a las " + cita.getHora() + " Telefono: " +cita.getCliente().getTelefono();
            citasListView.getItems().add(detalleCita);
        }
    }
}

