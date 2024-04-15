package co.edu.uniquindio.clinicadental.clinicadentalapp.model;

import co.edu.uniquindio.clinicadental.clinicadentalapp.model.constructor.EmpleadoBuilder;

public class Empleado {

    private String nombre;
    private String apellido;
    private String Cedula;
    private String numeroCelular;
    private String email;

    public Empleado() {
    }

    public Empleado(String nombre,
                    String apellido,
                    String cedula,
                    String numeroCelular,
                    String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        Cedula = cedula;
        this.numeroCelular = numeroCelular;
        this.email = email;
    }

    public static EmpleadoBuilder builder(){
        return new EmpleadoBuilder();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCedula() {
        return Cedula;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public String getEmail() {
        return email;
    }
}
