package Model;

import database.CRUD;
import database.ConfigDb;
import entity.Paciente;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PacienteModel implements CRUD {
    @Override
    public Object insert(Object obj) {
        return null;
    }

    @Override
    public List<Object> findAll() {

        Connection objConnection = ConfigDb.openConnection();

        List<Object> listaPacientes = new ArrayList<>();

        try{
            String sql = "select * from paciente";
            PreparedStatement objPrepare = objConnection.prepareStatement(sql);
            ResultSet objResult = objPrepare.executeQuery();

            while (objResult.next()){

                Paciente objPaciente = new Paciente();

                objPaciente.setIdPaciente(objResult.getInt("id_paciente"));
                objPaciente.setNombre(objResult.getString("nombre"));
                objPaciente.setApellidos(objResult.getString("apellidos"));
                objPaciente.setFechaNacimiento(objResult.getString("fecha_nacimiento"));
                objPaciente.setDocumentoIdentidad(objResult.getString("documento_identidad"));

                listaPacientes.add(objPaciente);

            }

        }catch (SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }

        ConfigDb.closeConnection();

        return listaPacientes;
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
