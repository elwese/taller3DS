import java.util.List;

public class MaterialEducativo {
    private String titulo;
    private String descripcion;
    private List<String> archivos;

    public MaterialEducativo(String titulo, String descripcion, List<String> archivos) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.archivos = archivos;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public List<String> getArchivos() {
        return archivos;
    }
}
