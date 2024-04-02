package controller;

import Model.PacienteModel;
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
}
