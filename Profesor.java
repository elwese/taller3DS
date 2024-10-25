import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String nombre;
    private String email;

    public Profesor(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public void cargarMaterialEducativo(Curso curso, String titulo, String descripcion, List<String> archivos) {
        MaterialEducativo material = new MaterialEducativo(titulo, descripcion, archivos);
        curso.agregarMaterial(material);
        System.out.println("Material educativo cargado exitosamente en el curso: " + curso.getNombre());
    }

    
    public void crearTarea(Curso curso, String titulo, String descripcion, String fechaEntrega, String criteriosEvaluacion, List<MaterialEducativo> materiales) {
        Tarea tarea = new Tarea(titulo, descripcion, fechaEntrega, criteriosEvaluacion);
        for (MaterialEducativo material : materiales) {
            tarea.agregarMaterial(material);
        }
        curso.agregarTarea(tarea);
        System.out.println("Tarea creada exitosamente en el curso: " + curso.getNombre());
    }

    
    public void crearEvaluacion(Curso curso, String titulo, String descripcion, String fechaEntrega, int puntajeMaximo, List<MaterialEducativo> materiales) {
        Evaluacion evaluacion = new Evaluacion(titulo, descripcion, fechaEntrega, puntajeMaximo);
        for (MaterialEducativo material : materiales) {
            evaluacion.agregarMaterial(material);
        }
        curso.agregarEvaluacion(evaluacion);
        System.out.println("Evaluación creada exitosamente en el curso: " + curso.getNombre());
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }
}



