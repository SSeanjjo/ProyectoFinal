package co.edu.uniquindio.clinicadental.clinicadentalapp.model.constructor;

import co.edu.uniquindio.clinicadental.clinicadentalapp.model.Cita;
import co.edu.uniquindio.clinicadental.clinicadentalapp.model.Dentista;
import co.edu.uniquindio.clinicadental.clinicadentalapp.model.Paciente;
import co.edu.uniquindio.clinicadental.clinicadentalapp.model.TipoEstado;

import java.util.Date;

public class CitaBuilder {

    protected Date fecha;
    protected Date hora;
    protected Paciente paciente;
    protected Dentista dentista;
    protected TipoEstado estadoCita;

    public CitaBuilder fecha(Date fecha){
        this.fecha = fecha;
        return this;
    }

    public CitaBuilder hora(Date hora){
        this.hora = hora;
        return this;
    }
    public CitaBuilder paciente(Paciente paciente){
        this.paciente = paciente;
        return this;
    }
    public CitaBuilder dentista(Dentista dentista){
        this.dentista = dentista;
        return this;
    }
    public CitaBuilder estadoCita(TipoEstado estadoCita){
        this.estadoCita = estadoCita;
        return this;
    }
    public Cita build() {

        return new Cita(fecha, hora, paciente,dentista ,estadoCita);

    }



}
