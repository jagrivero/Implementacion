import javax.management.monitor.Monitor;
import java.util.List;

public class Estacion extends Establecimiento {
    private List<Linea> lineas;
    public void alta(Servicio servicio){};
    public void baja(Servicio servicio){};
    public void serviciosDisponibles(){ //no es void
    }
    public void modificacionDisponibilidad(){}
}
