import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear un administrador
        Administrador admin = new Administrador("Dario Laborde", "dario@example.com");

        // Crear un profesor
        Profesor profesor = new Profesor("Juan Pérez", "juan@example.com");

        // Crear un curso
        Curso curso = new Curso("Matemáticas");

        // Administrador crea un usuario (profesor)
        admin.crearUsuario(profesor.getNombre(), profesor.getEmail(), "Profesor");

        // Asignar el profesor al curso
        admin.asignarProfesorACurso(profesor, curso);

        // Crear una lista de archivos para el material educativo
        List<String> archivos = new ArrayList<>(Arrays.asList("archivo1.pdf", "archivo2.mp4", "archivo3.pptx"));

        // Agregar una tarea
        Tarea tarea = new Tarea("Tarea 1", "Descripción de la tarea", "2024-10-31", "Criterios de evaluación");
        curso.agregarTarea(tarea);

        // Agregar material educativo
        MaterialEducativo material = new MaterialEducativo("Guía de Estudio", "Descripción del material", archivos);
        curso.agregarMaterial(material);

        // Mostrar información del curso
        System.out.println("Curso: " + curso.getNombre());
        System.out.println("Profesor asignado: " + curso.getProfesor().getNombre());
    }
}



