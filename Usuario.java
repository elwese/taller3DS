public class Usuario {
    private String nombre;
    private String email;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public void reportarProblema(SoporteTecnico soporte, String descripcion) {
        ReporteProblema reporte = new ReporteProblema(this, descripcion);
        soporte.recibirReporte(reporte);
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }
}

