import java.util.ArrayList;
import java.util.List;

public class ActividadAcademica {
    private String titulo;
    private String descripcion;
    private String fechaEntrega;
    private List<MaterialEducativo> materiales;

    public ActividadAcademica(String titulo, String descripcion, String fechaEntrega) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaEntrega = fechaEntrega;
        this.materiales = new ArrayList<>();
    }

    public void agregarMaterial(MaterialEducativo material) {
        materiales.add(material);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public List<MaterialEducativo> getMateriales() {
        return materiales;
    }
}
