package co.edu.uniquindio.clinicadental.clinicadentalapp.model;

import co.edu.uniquindio.clinicadental.clinicadentalapp.model.constructor.PacienteBuilder;

public class Paciente {

    private String idPaciente;
    private String nombre;
    private String apellido;
    private String cedula;
    private String direccion;
    private String numeroCelular;

    public Paciente(String idPaciente,
                    String nombre,
                    String apellido,
                    String cedula,
                    String direccion,
                    String numeroCelular){
        this.idPaciente = idPaciente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.numeroCelular = numeroCelular;
    }

    public static PacienteBuilder builder(){
        return  new PacienteBuilder();
    }

    public String getIdPaciente() {
        return idPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

}
