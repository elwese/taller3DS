import java.util.ArrayList;
import java.util.List;


public class SoporteTecnico {
    private List<Incidente> incidentes; 

    public SoporteTecnico() {
        this.incidentes = new ArrayList<>();
    }

    public void recibirIncidente(Incidente incidente) {
        incidentes.add(incidente);
        analizarIncidente(incidente);
    }

    public void analizarIncidente(Incidente incidente) {
        resolverProblema(incidente); 
    }

    private void resolverProblema(Incidente incidente) {
        
        incidente.resolver();
    }
}
