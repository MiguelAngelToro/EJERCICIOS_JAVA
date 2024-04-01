package Model;

import database.CRUD;
import database.ConfigDb;
import entity.Especialidad;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EspecialidadModel implements CRUD {
    @Override
    public Object insert(Object obj) {
        return null;
    }

    @Override
    public List<Object> findAll() {

        //Abrir conexión
        Connection objConnection  = ConfigDb.openConnection();

        //Crear lista para guardar lo que nos devuelve la base de datos
        List<Object> listaEspecialidades = new ArrayList<>();

        try{

            //Escribimos el query codigo sql
            String sql = "select * from especialidad;";

            //Usar el prepare Statement para subrallar codigo a ejecutar
            PreparedStatement objPrepared = objConnection.prepareStatement(sql);

            //Ejecutar y obtener resultado
            ResultSet objResult = objPrepared.executeQuery();

            //Generar objetos de la tabla uno a uno
            while(objResult.next()){

                //Llamamos constructor vacio para generarlo aun sin info
                Especialidad objEspecialidad = new Especialidad();

                objEspecialidad.setNombre(objResult.getString("nombre"));
                objEspecialidad.setDescripcion(objResult.getString("descripcion"));
                objEspecialidad.setIdEspecialidad(objResult.getInt("id_especialidad"));

                //Agregar esa especialidad a la lista
                listaEspecialidades.add(objEspecialidad);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }

        ConfigDb.closeConnection();

        return listaEspecialidades;
    }

    @Override
    public boolean update(Object obj) {
        return false;
    }

    @Override
    public boolean delete(Object obj) {
        return false;
    }
}
