import java.util.List;

public class Establecimiento {
    private String nombre;
    private Ubicacion ubicacion;
    private List<Monitoreable> servicios;
    private Localizacion localizacion;
    public void agregar(Localizacion localizacionArgumento){};

    public void setLocalizacion(Localizacion localizacion) {
        this.localizacion = localizacion;
    }
}
