package co.edu.uniquindio.clinicadental.clinicadentalapp.model;

public class HistorialClinico {

    private Paciente paciente;
    private Dentista dentista;

    public HistorialClinico() {
    }

    public HistorialClinico(Paciente paciente, Dentista dentista) {
        this.paciente = paciente;
        this.dentista = dentista;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Dentista getDentista() {
        return dentista;
    }
}
