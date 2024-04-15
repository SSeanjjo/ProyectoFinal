package co.edu.uniquindio.clinicadental.clinicadentalapp.Viewcontroller;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.clinicadental.clinicadentalapp.Controller.ClinicaDentalController;
import co.edu.uniquindio.clinicadental.clinicadentalapp.factory.ModelFactory;
import co.edu.uniquindio.clinicadental.clinicadentalapp.model.Paciente;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ClinicaDentalViewController {

    ClinicaDentalController clinicaDentalController;

    ObservableList<Paciente> listaPacientes = FXCollections.observableArrayList();

    Paciente pacienteSeleccionado;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtapellidoPaciente;

    @FXML
    private TextField txtcedulaPaciente;

    @FXML
    private TextField txtdirecciónPaciente;

    @FXML
    private TextField txtidPaciente;

    @FXML
    private TextField txtnombrePaciente;

    @FXML
    private TextField txtnumCelularPaciente;

    @FXML
    private Button btnActualizarPaciente;

    @FXML
    private Button btnAgregarPaciente;

    @FXML
    private Button btnEliminarPáciente;
    @FXML
    private TableView<Paciente> tablePacienteR;

    @FXML
    private TableColumn<Paciente, String> tpApellidoPacienteR;

    @FXML
    private TableColumn<Paciente, String> tpCedulaPacienteR;

    @FXML
    private TableColumn<Paciente, String> tpDireccionPacienteR;

    @FXML
    private TableColumn<Paciente, String> tpIdPacienteR;

    @FXML
    private TableColumn<Paciente, String> tpNombrePacienteR;

    @FXML
    private TableColumn<Paciente, String> tpNumeroCelularR;

    @FXML
    void onActualizarPaciente(ActionEvent event) {

        actualizarPaciente();

    }

    @FXML
    void onAgregarPaciente(ActionEvent event) {

        agregarPaciente();

    }
    @FXML
    void onEliminarPaciente(ActionEvent event) {
        eliminarPaciente();

    }

    @FXML
    void initialize() {

        clinicaDentalController = new ClinicaDentalController();
        initview();

    }

    private void initview() {
        initDataBinding();
        ObternerPacientes();
        tablePacienteR.getItems().clear();
        tablePacienteR.setItems(listaPacientes);
        listenerSelection();
    }

    private void listenerSelection() {

        tablePacienteR.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            pacienteSeleccionado= newSelection;
            mostrarInformacionPaciente(pacienteSeleccionado);
        });

    }

    private void mostrarInformacionPaciente(Paciente pacienteSeleccionado) {

        if (pacienteSeleccionado != null){

            txtidPaciente.setText(pacienteSeleccionado.getIdPaciente());
            txtnombrePaciente.setText(pacienteSeleccionado.getNombre());
            txtapellidoPaciente.setText(pacienteSeleccionado.getApellido());
            txtcedulaPaciente.setText(pacienteSeleccionado.getCedula());
            txtdirecciónPaciente.setText(pacienteSeleccionado.getDireccion());
            txtnumCelularPaciente.setText(pacienteSeleccionado.getNumeroCelular());


        }
    }


    private void ObternerPacientes() {
        listaPacientes.addAll(clinicaDentalController.obtenerPaciente());
    }

    private void initDataBinding() {

        tpIdPacienteR.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getIdPaciente()));
        tpNombrePacienteR.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        tpApellidoPacienteR.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getApellido()));
        tpCedulaPacienteR.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCedula()));
        tpDireccionPacienteR.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDireccion()));
        tpNumeroCelularR.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNumeroCelular()));

    }

    private void agregarPaciente() {

        if(validarFormulario()){
            Paciente paciente = construirPaciente();

            if (clinicaDentalController.crearPaciente(paciente)) {
                listaPacientes.add(paciente);

                mostrarMensaje("Notificación Paciente", "Paciente creado", "El Paciente se ha creado con éxito", Alert.AlertType.CONFIRMATION);
                limpiarCamposEmpleado();
            } else {

                mostrarMensaje("Notificación Paciente", "Paciente no creado", "El Paciente no se ha creado con éxito", Alert.AlertType.ERROR);

            }

        } else {
            mostrarMensaje("Notificación Paciente", "Paciente no creado", "Los datos ingresados son invalidos", Alert.AlertType.ERROR);

        }
    }

    public void eliminarPaciente(){

        if(pacienteSeleccionado != null){

           if (clinicaDentalController.eliminarPaciente(pacienteSeleccionado)) {
                listaPacientes.remove(pacienteSeleccionado);
                limpiarCamposEmpleado();

                mostrarMensaje("Notificación Paciente", "Paciente eliminado", "El Paciente se ha eliminado con éxito", Alert.AlertType.INFORMATION);
            } else {
                mostrarMensaje("Notificación Paciente", "Error al eliminar Paciente", "No se pudo eliminar el Paciente", Alert.AlertType.ERROR);
            }
        }else {
            mostrarMensaje("Notificación Paciente", " Paciente no seleccionado ", "No se pudo eliminar el Paciente", Alert.AlertType.ERROR);
        }


    }
    private void actualizarPaciente() {

        if(validarFormulario()){
            Paciente paciente = construirPaciente();

            if (clinicaDentalController.actualizarPaciente(pacienteSeleccionado, paciente)) {
                int indice =  listaPacientes.indexOf(pacienteSeleccionado);
                listaPacientes.set(indice,paciente);

                mostrarMensaje("Notificación Paciente", "Paciente actualizado", "El Paciente se ha actualizado con éxito", Alert.AlertType.CONFIRMATION);
                limpiarCamposEmpleado();
            } else {

                mostrarMensaje("Notificación Paciente", "Paciente no actualizado", "El Paciente no se ha actualizado con éxito", Alert.AlertType.ERROR);

            }

        } else {
            mostrarMensaje("Notificación Paciente", "Paciente no actualizado", "Los datos ingresados NO son validos", Alert.AlertType.ERROR);

        }
    }

    private Paciente construirPaciente() {
        return Paciente.builder()
                .idPaciente(txtidPaciente.getText())
                .nombre(txtnombrePaciente.getText())
                .apellido(txtapellidoPaciente.getText())
                .cedula(txtcedulaPaciente.getText())
                .direccion(txtdirecciónPaciente.getText())
                .numeroCelular(txtnumCelularPaciente.getText())
                .build();


    }

    private void limpiarCamposEmpleado() {

        txtidPaciente.setText("");
        txtnombrePaciente.setText("");
        txtapellidoPaciente.setText("");
        txtcedulaPaciente.setText("");
        txtdirecciónPaciente.setText("");
        txtnumCelularPaciente.setText("");
    }

    private void mostrarMensaje(String titulo, String header, String contenido, Alert.AlertType alertType) {
        Alert aler = new Alert(alertType);
        aler.setTitle(titulo);
        aler.setHeaderText(header);
        aler.setContentText(contenido);
        aler.showAndWait();
    }

    private boolean validarFormulario() {
        if (txtcedulaPaciente.getText().isEmpty()){
            return false;

        }
        return  true;
    }


}

