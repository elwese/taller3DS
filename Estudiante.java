import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Usuario {
    private List<Curso> cursosInscritos = new ArrayList<>();

    public Estudiante(String nombre, String email) {
        super(nombre, email);
    }

    public void inscribirseCurso(Curso curso) {
        cursosInscritos.add(curso);
        System.out.println("Estudiante " + getNombre() + " se ha inscrito en el curso " + curso.getNombre());
    }
}

