public class UsuarioGeneral {
    private String nombre;
    private String apellido;
    private Cuenta cuenta;
    private String correoElectronico;
    private TipoDeNotificacion tipoDeNotificacion;

    public UsuarioGeneral(String nombreUsuario, String apellidoUsuario, Cuenta cuentaUsuario, String correoElectronicoUsuario, TipoDeNotificacion tipoDeNotificacionUsuario) {
        this.nombre = nombreUsuario;
        this.apellido = apellidoUsuario;
        this.cuenta = cuentaUsuario;
        this.correoElectronico = correoElectronicoUsuario;
        this.tipoDeNotificacion = tipoDeNotificacionUsuario;
    }
}
