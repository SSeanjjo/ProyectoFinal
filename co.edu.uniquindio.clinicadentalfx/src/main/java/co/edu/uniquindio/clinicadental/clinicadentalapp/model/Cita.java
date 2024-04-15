package co.edu.uniquindio.clinicadental.clinicadentalapp.model;

import co.edu.uniquindio.clinicadental.clinicadentalapp.model.constructor.CitaBuilder;
import co.edu.uniquindio.clinicadental.clinicadentalapp.model.constructor.EmpleadoBuilder;

import java.util.Date;

public class Cita {

    private Date fecha;
    private Date hora;
    private Paciente paciente;
    private Dentista dentista;
    private TipoEstado estadoCita;

    public Cita() {

    }

    public Cita(Date fecha,
                Date hora,
                Paciente paciente,
                Dentista dentista,
                TipoEstado estadoCita) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.dentista = dentista;
        this.estadoCita = estadoCita;
    }

    public static CitaBuilder builder(){
        return new CitaBuilder();
    }

    public Date getFecha() {
        return fecha;
    }

    public Date getHora() {
        return hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Dentista getDentista() {
        return dentista;
    }

    public TipoEstado getEstadoCita() {
        return estadoCita;
    }
}
