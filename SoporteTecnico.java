import java.util.List;

public class SoporteTecnico {
    private List<ReporteProblema> reportes; 

    public SoporteTecnico(List<ReporteProblema> reportes) {
        this.reportes = reportes;
    }

    public void recibirReporte(ReporteProblema reporte) {
        reportes.add(reporte);
        analizarProblema(reporte);
    }

    public void analizarProblema(ReporteProblema reporte) {
        // Lógica para analizar el problema
        if (esProblemaDeGestion(reporte)) {
            derivarAAdministrador(reporte);
        } else {
            resolverProblema(reporte);
        }
    }

    public void notificarUsuario(Usuario usuario) {
        
    }

    private boolean esProblemaDeGestion(ReporteProblema reporte) {
        
        return false; 
    }

    private void resolverProblema(ReporteProblema reporte) {
        
    }

    private void derivarAAdministrador(ReporteProblema reporte) {
        
    }
}
