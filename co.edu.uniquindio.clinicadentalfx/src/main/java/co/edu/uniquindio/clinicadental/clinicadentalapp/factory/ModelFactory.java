package co.edu.uniquindio.clinicadental.clinicadentalapp.factory;

import co.edu.uniquindio.clinicadental.clinicadentalapp.model.Paciente;
import co.edu.uniquindio.clinicadental.clinicadentalapp.model.PrestamoObjeto;

import java.util.List;

public class ModelFactory {



    public static  ModelFactory modelFactory;
    private PrestamoObjeto prestamoObjeto;

    public ModelFactory(){
        prestamoObjeto = new PrestamoObjeto();
    }

    public static ModelFactory getInstance(){
        if (modelFactory == null){
            modelFactory = new ModelFactory();

        }return modelFactory;
    }

    public  boolean CrearPaciente(Paciente paciente){
        return prestamoObjeto.CrearPaciente( paciente );

    }
    public boolean eliminarPaciente(Paciente paciente){
        return prestamoObjeto.eliminarPaciente(paciente);
    }
    public boolean actualizarPaciente(Paciente pacienteAntiguo, Paciente pacienteNuevo){
        return prestamoObjeto.actualizarPaciente(pacienteAntiguo, pacienteNuevo);
    }
    public List<Paciente> obtenerPaciente(){
        return  prestamoObjeto.obtenerPaciente();
    }





}
