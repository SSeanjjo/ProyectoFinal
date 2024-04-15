package co.edu.uniquindio.clinicadental.clinicadentalapp.model.constructor;

import co.edu.uniquindio.clinicadental.clinicadentalapp.model.Cita;
import co.edu.uniquindio.clinicadental.clinicadentalapp.model.Empleado;

public class EmpleadoBuilder {
    protected String nombre;
    protected String apellido;
    protected String Cedula;
    protected String numeroCelular;
    protected String email;

    public EmpleadoBuilder nombre(String nombre){
        this.nombre = nombre;
        return this;
    }
    public EmpleadoBuilder apellido(String apellido){
        this.apellido = apellido;
        return this;
    }
    public EmpleadoBuilder cedula(String cedula){
        this.Cedula = cedula;
        return  this;
    }

    public EmpleadoBuilder numeroCelular(String numeroCelular){
        this.numeroCelular = numeroCelular;
        return this;
    }
    public EmpleadoBuilder email(String email){
        this.email = email;
        return this;
    }

    public Empleado build() {

        return new Empleado(nombre, apellido, Cedula, numeroCelular,email);

    }

}
