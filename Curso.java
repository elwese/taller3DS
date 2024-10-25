import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private Profesor profesor;
    private List<Estudiante> estudiantesInscritos = new ArrayList<>();
    private List<Evaluacion> evaluaciones = new ArrayList<>();
    private List<Foro> foros = new ArrayList<>();
    private List<MaterialEducativo> materiales = new ArrayList<>(); // Lista para almacenar materiales educativos

    public Curso(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

 
    public void asignarProfesor(Profesor profesor) {
        this.profesor = profesor;
        System.out.println("Profesor " + profesor.getNombre() + " asignado al curso " + nombre);
    }

    public void solicitarInscripcion(Estudiante estudiante) {
        System.out.println(estudiante.getNombre() + " ha solicitado la inscripción en " + getNombre());
    }

    public void inscribirEstudiante(Estudiante estudiante) {
        estudiantesInscritos.add(estudiante);
    }

    public void agregarEvaluacion(Evaluacion evaluacion) {
        evaluaciones.add(evaluacion);
    }

    public void agregarForo(Foro foro) {
        foros.add(foro);
    }

    
    public void agregarMaterial(MaterialEducativo material) {
        materiales.add(material);
        System.out.println("Material educativo " + material.getTitulo() + " agregado al curso " + nombre);
    }
}



