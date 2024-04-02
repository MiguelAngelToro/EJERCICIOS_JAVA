import controller.EspecialidadController;
import controller.PacienteController;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String option = "";
        String option1 = "";
        String option3 = "";

        do {
            option = JOptionPane.showInputDialog("""
                    MENÚ PRINCIPAL
                    1. Especialidades
                    2.
                    3. Pacientes
                    6. Salir
                    """);

            switch (option){
                case "1":

                    do {
                        option1 = JOptionPane.showInputDialog("""
                            MENÚ ESPECIALIDADES
                            1.Crear
                            2.Actualizar
                            3.Listar
                            4.Eliminar
                            5.Salir
                            """);

                        switch (option1){
                            case "3":
                                EspecialidadController.findAll();

                                break;
                        }
                    }while (option1.equals("5"));

                    break;

                case "2":
                    break;

                case "3":

                    do {
                        option3 = JOptionPane.showInputDialog("""
                                MENÚ PACIENTES
                                
                                1. Crear
                                2. Actualizar
                                3. Listar
                                4. Eliminar
                                5. Salir
                                """);

                        switch (option3){
                            case "3":
                                PacienteController.findAll();
                                break;
                        }
                    }while (option3.equals("5"));
                    break;
            }

        }while (option.equals("6"));

    }
}