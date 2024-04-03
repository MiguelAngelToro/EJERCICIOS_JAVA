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

    public static void create(){

        String nombre = JOptionPane.showInputDialog("Ingrese nombre de especialidad");
        String descripcion = JOptionPane.showInputDialog("Ingrese descripcion");

        instanceModel().insert(new Especialidad(nombre,descripcion));

    }

    public static EspecialidadModel instanceModel(){
        return new EspecialidadModel();
    }
}
