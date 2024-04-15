package co.edu.uniquindio.clinicadental.clinicadentalapp.Controller;

import co.edu.uniquindio.clinicadental.clinicadentalapp.factory.ModelFactory;
import co.edu.uniquindio.clinicadental.clinicadentalapp.model.Paciente;

import java.util.List;

public class ClinicaDentalController {

    ModelFactory modelFactory;

    public ClinicaDentalController(){
        modelFactory = ModelFactory.getInstance();
    }

    public boolean crearPaciente(Paciente paciente){
        return modelFactory.CrearPaciente(paciente);
    }

    public boolean eliminarPaciente(Paciente paciente){
        return modelFactory.eliminarPaciente(paciente);
    }
    public boolean actualizarPaciente(Paciente pacienteAntiguo, Paciente pacienteNuevo){
        return modelFactory.actualizarPaciente(pacienteAntiguo, pacienteNuevo);
    }
    public List<Paciente> obtenerPaciente() {
        return modelFactory.obtenerPaciente();
    }




}
