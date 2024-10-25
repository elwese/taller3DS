public class Evaluacion extends ActividadAcademica {
    private int puntajeMaximo;

    public Evaluacion(String titulo, String descripcion, String fechaEntrega, int puntajeMaximo) {
        super(titulo, descripcion, fechaEntrega);
        this.puntajeMaximo = puntajeMaximo;
    }

    public int getPuntajeMaximo() {
        return puntajeMaximo;
    }
}

