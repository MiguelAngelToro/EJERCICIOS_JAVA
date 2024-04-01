import controller.EspecialidadController;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String option = "";
        String option1 = "";

        do {
            option = JOptionPane.showInputDialog("""
                    MENÚ PRINCIPAL
                    1.Especialidades
                    6.Salir
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
            }

        }while (option.equals("6"));

    }
}