package entity;

public class Medico {

    private int idMedico;
    private String nombre;
    private String apellidos;

    private int fkIdEspecialidad;
    private Especialidad especialidad;


    public Medico (){

    }
    public Medico(int idMedico, String nombre, String apellidos, int fkIdEspecialidad, Especialidad especialidad) {
        this.idMedico = idMedico;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fkIdEspecialidad = fkIdEspecialidad;
        this.especialidad = especialidad;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getFkIdEspecialidad() {
        return fkIdEspecialidad;
    }

    public void setFkIdEspecialidad(int fkIdEspecialidad) {
        this.fkIdEspecialidad = fkIdEspecialidad;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
}
