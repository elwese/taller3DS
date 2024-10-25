public class Incidente {
    private Usuario usuario;
    private String descripcion;
    private String estado;

    public Incidente(Usuario usuario, String descripcion) {
        this.usuario = usuario;
        this.descripcion = descripcion;
        this.estado = "Pendiente"; // Estado inicial
    }

    public void resolver() {
        estado = "Resuelto";
        System.out.println("Incidente resuelto: " + descripcion);
    }

    public String getEstado() {
        return estado;
    }
}