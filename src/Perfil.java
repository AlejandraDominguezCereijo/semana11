public class Perfil {
    String nombre = "";
    String apellido = "";
    int telefono = 0;

    public Perfil(String nombre, String apellido, int telefono) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }


    public String toString() {
        return "Perfil: " +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono=" + telefono
                ;
    }


}
