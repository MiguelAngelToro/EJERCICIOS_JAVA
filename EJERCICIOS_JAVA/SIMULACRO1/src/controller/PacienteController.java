package controller;

import Model.EspecialidadModel;
import Model.PacienteModel;
import entity.Especialidad;
import entity.Paciente;

import javax.swing.*;

public class PacienteController {

    public static void findAll(){
        PacienteModel objModel = new PacienteModel();

        String listaPacientes = "LISTA DE PACIENTES \n";

        for (Object iterador: objModel.findAll()){

            Paciente objPaciente = (Paciente) iterador;
            listaPacientes += objPaciente.toString() + "\n";
        }

        JOptionPane.showMessageDialog(null,listaPacientes);
    }

    public static void create(){
        PacienteModel objPacienteModel = new PacienteModel();

        String nombre = JOptionPane.showInputDialog("Ingrese nombre");
        String apellidos = JOptionPane.showInputDialog("Ingrese apellidos");
        String fechaNacimiento = JOptionPane.showInputDialog("Ingrese fecha de nacimiento AÑO-MES-DIA");
        String documentoIdentidad = JOptionPane.showInputDialog("Ingrese docuemnto de identidad");

        Paciente objPaciente = new Paciente();

        objPaciente.setNombre(nombre);
        objPaciente.setApellidos(apellidos);
        objPaciente.setFechaNacimiento(fechaNacimiento);
        objPaciente.setDocumentoIdentidad(documentoIdentidad);

        objPaciente = (Paciente) objPacienteModel.insert(objPaciente);

        JOptionPane.showMessageDialog(null,objPaciente.toString());

    }
}
