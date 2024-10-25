import java.util.ArrayList;
import java.util.List;

public class Profesor extends Usuario {
    private List<Curso> cursosImpartidos;

    public Profesor(String nombre, String email) {
        super(nombre, email);
        this.cursosImpartidos = new ArrayList<>();
    }

    public void planificarCurso() {
        
    }

    public void cargarMaterialEducativo(Curso curso, String titulo, String descripcion, List<String> archivos) {
        if (cursosImpartidos.contains(curso)) {
            if (archivos.isEmpty()) {
                mostrarMensajeError("Error: No se han seleccionado archivos válidos.");
                return;
            }

            for (String archivo : archivos) {
                if (!esArchivoValido(archivo)) {
                    mostrarMensajeError("Error: El archivo " + archivo + " no es válido.");
                    return;
                }
            }

            MaterialEducativo material = new MaterialEducativo(titulo, descripcion, archivos);
            curso.agregarMaterial(material);
            mostrarVentanaCargaExitosa();
        } else {
            mostrarMensajeError("Error: El profesor no está autorizado para cargar material en este curso.");
        }
    }

    public void gestionarCargaMaterial(Curso curso) {
        System.out.println("Seleccionando curso: " + curso.getNombre());

        
        String titulo = "Título del material"; 
        String descripcion = "Descripción del material"; 
        List<String> archivos = new ArrayList<>();
        archivos.add("material1.pdf"); 
        archivos.add("material_invalido.docx"); 
        cargarMaterialEducativo(curso, titulo, descripcion, archivos);
    }

    private void mostrarVentanaCargaExitosa() {
        System.out.println("Material educativo cargado exitosamente.");
    }

    private void mostrarMensajeError(String mensaje) {
        System.out.println(mensaje);
    }

    private boolean esArchivoValido(String archivo) {
        return archivo.endsWith(".pdf") || archivo.endsWith(".pptx") || archivo.endsWith(".mp4");
    }

    public List<Curso> getCursosImpartidos() {
        return cursosImpartidos;
    }
}
