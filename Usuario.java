public class Usuario {
    private String nombre;
    private String email;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public void reportarProblema(SoporteTecnico soporte, String descripcion) {
        Incidente incidente = new Incidente(this, descripcion);
        soporte.recibirIncidente(incidente); 
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }
}


