import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private Profesor profesor;
    private List<Tarea> tareas;
    private List<Evaluacion> evaluaciones;
    private List<MaterialEducativo> materiales;

    public Curso(String nombre) {
        this.nombre = nombre;
        this.tareas = new ArrayList<>();
        this.evaluaciones = new ArrayList<>();
        this.materiales = new ArrayList<>();
    }

    
    public void asignarProfesor(Profesor profesor) {
        this.profesor = profesor;
        System.out.println("Profesor asignado: " + profesor.getNombre());
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
        System.out.println("Tarea agregada al curso: " + nombre);
    }

    public void agregarEvaluacion(Evaluacion evaluacion) {
        evaluaciones.add(evaluacion);
        System.out.println("Evaluación agregada al curso: " + nombre);
    }

    public void agregarMaterial(MaterialEducativo material) {
        materiales.add(material);
        System.out.println("Material educativo agregado al curso: " + nombre);
    }

    public Profesor getProfesor() {
        return profesor;
    }
}






