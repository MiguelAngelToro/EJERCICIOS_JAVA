package controller;

import Model.EspecialidadModel;
import entity.Especialidad;

import javax.swing.*;

public class EspecialidadController {

    public static void findAll(){
        EspecialidadModel objModel = new EspecialidadModel();

        String listaEspecialidades = "LISTA DE ESPECIALIDADES \n";

        for (Object iterador: objModel.findAll()){

            //Convertimos objeto a especiliadad
            Especialidad objEspecialidad = (Especialidad) iterador;
            listaEspecialidades += objEspecialidad.toString() + "\n";

        }

        JOptionPane.showMessageDialog(null,listaEspecialidades);
    }
}
