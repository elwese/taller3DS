public class Administrador extends Usuario {

    public Administrador(String nombre, String email) {
        super(nombre, email);
    }

    public void crearUsuario(String nombre, String email, String rol) {
        System.out.println("Usuario " + nombre + " creado con el rol " + rol);
    }

    public void asignarProfesorACurso(Profesor profesor, Curso curso) {
        curso.asignarProfesor(profesor);
        System.out.println("El profesor " + profesor.getNombre() + " ha sido asignado al curso " + curso.getNombre());
    }

    public void actualizarPlataforma() {
        System.out.println("Actualizando la plataforma...");
    }
}
