package co.edu.uniquindio.clinicadental.clinicadentalapp.model;

import java.util.ArrayList;
import java.util.List;

public class PrestamoObjeto {

    List<Paciente> listaPacientes= new ArrayList<>();

    List<Dentista> listaDentistas = new ArrayList<>();
    List<HistorialClinico> listaHistoriasClinicas = new ArrayList<>();

    List<Cita> listaCitas = new ArrayList<>();

    private String  nombre;

    public PrestamoObjeto() {

    }

    public boolean CrearPaciente (Paciente nuevoPaciente){
        Paciente propietarioEncontrado = obtenerPaciente(nuevoPaciente.getCedula());
        if (propietarioEncontrado == null) {
            getListaPacientes().add(nuevoPaciente);
            return true;

        }else {
            return false;

        }



    }

    private Paciente obtenerPaciente(String cedula) {
        Paciente paciente = null;
        for (Paciente paciente1: getListaPacientes()){
            if (paciente1.getCedula().equalsIgnoreCase(cedula)){
                paciente = paciente1;
                break;
            }


        }
        return paciente;

    }public boolean eliminarPaciente(Paciente paciente){
        Paciente pacienteEliminado = obtenerPaciente(paciente.getCedula());
        if (pacienteEliminado != null){
           getListaPacientes().remove(pacienteEliminado);
            return true ;
        }else {
            return false;
        }

    }
    public boolean actualizarPaciente(Paciente pacienteAntiguo, Paciente pacienteNuevo){
        Paciente propietarioEncontrado = obtenerPaciente(pacienteAntiguo.getCedula());
        if (propietarioEncontrado != null) {
            int indice = listaPacientes.indexOf(pacienteAntiguo);
            listaPacientes.set(indice,pacienteNuevo);


            return true;

        }else {
            return false;

        }



    }


    public List<Paciente> obtenerPaciente(){
        return  this.listaPacientes;
    }

    public List<Paciente> getListaPacientes() {
        return listaPacientes;
    }

    public void setListaPacientes(List<Paciente> listaPacientes) {
        this.listaPacientes = listaPacientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
