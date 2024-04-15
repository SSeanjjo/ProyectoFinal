package co.edu.uniquindio.clinicadental.clinicadentalapp.model;

import co.edu.uniquindio.clinicadental.clinicadentalapp.model.constructor.DentistaBuilder;
import co.edu.uniquindio.clinicadental.clinicadentalapp.model.constructor.EmpleadoBuilder;

public class Dentista extends Empleado{

    private String especialidad;

    public Dentista(){

    }

    public Dentista(String especialidad) {
        this.especialidad = especialidad;
    }

    public Dentista(String nombre,
                    String apellido,
                    String cedula,
                    String numeroCelular,
                    String email,
                    String especialidad) {
        super(nombre, apellido, cedula, numeroCelular, email);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }
}
