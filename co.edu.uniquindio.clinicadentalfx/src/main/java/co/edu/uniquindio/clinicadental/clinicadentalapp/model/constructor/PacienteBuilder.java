package co.edu.uniquindio.clinicadental.clinicadentalapp.model.constructor;

import co.edu.uniquindio.clinicadental.clinicadentalapp.model.Paciente;

public class PacienteBuilder {

    protected String idPaciente;
    protected  String nombre;
    protected  String apellido;
    protected  String cedula;
    protected  String direccion;
    protected  String numeroCelular;

    public PacienteBuilder idPaciente(String idPaciente){
        this.idPaciente = idPaciente;
        return this;
    }
    public PacienteBuilder nombre(String nombre){
        this.nombre = nombre;
        return this;
    }
    public PacienteBuilder apellido(String apellido){
        this.apellido = apellido;
        return this;
    }
    public PacienteBuilder cedula(String cedula){
        this.cedula = cedula;
        return this;
    }

    public PacienteBuilder direccion(String dirrecion){
        this.direccion = dirrecion;
        return this;
    }
    public PacienteBuilder numeroCelular(String numeroCelular){
        this.numeroCelular = numeroCelular;
        return this;
    }

    public Paciente build() {

        return new Paciente(idPaciente, nombre, apellido, cedula, direccion, numeroCelular);

    }




}
