public class ReporteProblema {
    private Usuario usuario; 
    private String descripcion;
    private String tipoProblema;

    public ReporteProblema(Usuario usuario, String descripcion) {
        this.usuario = usuario;
        this.descripcion = descripcion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getTipoProblema() {
        return tipoProblema;
    }

    public void setTipoProblema(String tipoProblema) {
        this.tipoProblema = tipoProblema;
    }
}
