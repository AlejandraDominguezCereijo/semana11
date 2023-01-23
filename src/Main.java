import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner rellenar=new Scanner(System.in);
        System.out.println("¿Cuantos perfiles quieres añadir a la agenda?");
        int nPerfiles=rellenar.nextInt();

        String nombre = "";
        String apellido = "";
        int telefono = 0;


        for (int i=0; i<nPerfiles; i++) {
            Scanner cubrir = new Scanner(System.in);
            System.out.println("Añadir nombre: ");
            try {
                nombre = cubrir.nextLine();
            } catch (InputMismatchException excepcionNombre) {
                System.out.println("Error al añadir el nombre");
                System.out.println(excepcionNombre.getMessage());
            }
            System.out.println("Añadir apellido: ");
            try {
                apellido = cubrir.nextLine();

            } catch (InputMismatchException excepcionApellido) {
                System.out.println("Error al añadir el apellido");
                System.out.println(excepcionApellido.getMessage());
            }
            System.out.println("Añadir telefono: ");

            try {
                telefono = cubrir.nextInt();
            } catch (InputMismatchException excepcionTelefono) {
                System.out.println("Error al añadir el telefono");
                System.out.println(excepcionTelefono.getMessage());

            } finally {
                System.out.println("Prueba terminada");
            }


        Perfil datos = new Perfil(nombre,apellido,telefono);
        System.out.println(datos.toString());//al añadirlo asi con el sout hacemos que nos lea el toString

        }

        Agenda perfiles = new Agenda();
        perfiles.añadirPerfil();
    }
}
