package entity;

import java.util.Date;

public class Cita {

    private int idCita;
    private int fkIdPaciente;

    private Paciente paciente;

    private int fkIdMedico;

    private Medico medico;

    private String fechaCita;

    private String horaCita;

    private String motivo;

    public Cita (){

    }

    public Cita(int idCita, int fkIdPaciente, Paciente paciente, int fkIdMedico, Medico medico, String fechaCita, String horaCita, String motivo) {
        this.idCita = idCita;
        this.fkIdPaciente = fkIdPaciente;
        this.paciente = paciente;
        this.fkIdMedico = fkIdMedico;
        this.medico = medico;
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
        this.motivo = motivo;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public int getFkIdPaciente() {
        return fkIdPaciente;
    }

    public void setFkIdPaciente(int fkIdPaciente) {
        this.fkIdPaciente = fkIdPaciente;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public int getFkIdMedico() {
        return fkIdMedico;
    }

    public void setFkIdMedico(int fkIdMedico) {
        this.fkIdMedico = fkIdMedico;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(String horaCita) {
        this.horaCita = horaCita;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}
