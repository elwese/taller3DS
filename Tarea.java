public class Tarea extends ActividadAcademica {
    private String criteriosEvaluacion;

    public Tarea(String titulo, String descripcion, String fechaEntrega, String criteriosEvaluacion) {
        super(titulo, descripcion, fechaEntrega);
        this.criteriosEvaluacion = criteriosEvaluacion;
    }

    public String getCriteriosEvaluacion() {
        return criteriosEvaluacion;
    }
}
