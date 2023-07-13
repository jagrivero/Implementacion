import java.util.List;

public class UsuarioPersonal extends UsuarioGeneral{
    private List<Membresia> membresias;
    private Localizacion localizacionAsociada;
    private List<Monitoreable> serviciosDeInteres;
    private List<HoraNotificacion> horariosNotificacion;
    private String correoElectronico;
    private List<EmpresaPrestadora> empresasDeInteres;
    public UsuarioPersonal(String nombreUsuario, String apellidoUsuario, Cuenta cuentaUsuario, String correoElectronicoUsuario, TipoDeNotificacion tipoNotif) {
        super(nombreUsuario, apellidoUsuario, cuentaUsuario, correoElectronicoUsuario,tipoNotif);
    }
    public void modificar(Monitoreable monitoreable){
    }
    public void eliminar(Monitoreable monitoreable){}
    public void setLocalizacion(Localizacion localizacion){}
    public void agregarServicioDeInteres(Monitoreable monitoreable){}
    public void registrarIncidente(Monitoreable monitoreable){}
}
