import java.util.ArrayList;
import java.util.Scanner;

public class GestionCurso {

    private ArrayList<Curso> listaCursos;

    public GestionCurso(){
        this.listaCursos = new ArrayList<>();
    }

    public void agregarCurso(Scanner objScan){
        objScan.nextLine();

        System.out.println("Ingresa el id del nuevo curso: ");
        String codigo = objScan.nextLine();


        System.out.println("Ingresa el nombre del nuevo curso: ");
        String nombre = objScan.nextLine();


        //Validamos que el codigo del curso no este creado anteriormente
        this.buscarCursoPorCodigo(codigo);

        if (this.buscarCursoPorCodigo(codigo) != null){
            System.out.println("Ya existe un curso con este codigo");
        }else {
            Curso objCurso = new Curso(codigo,nombre);

            if (this.listaCursos.add(objCurso)){
                System.out.println("Curso agregado correctamente");
            }else {
                System.out.println("No se pudo agregar el curso");
            }
        }

    }

    public void listarTodosLosCursos(){
        //Validar si la lista esta vacia
        if (this.listaCursos.isEmpty()){
            System.out.println("No hay cursos registrados");
        }else{
            for (Curso temporal:this.listaCursos){
                System.out.println(temporal.toString());
            }
        }
    }

    public Curso buscarCursoPorCodigo(String codigoBuscar){
        for(Curso temporal:this.listaCursos){
            if (temporal.getCodigo().equalsIgnoreCase(codigoBuscar)){
                return temporal;
            }
        }
        return null;
    }



}
