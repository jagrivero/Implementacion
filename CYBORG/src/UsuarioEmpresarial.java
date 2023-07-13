public class UsuarioEmpresarial extends UsuarioGeneral{
    private FrecuenciaDeNotificacion frecuenciaDeNotificacion;
    public UsuarioEmpresarial(String nombre, String apellido, Cuenta cuenta, String correoElectronico,TipoDeNotificacion tipoNotif, FrecuenciaDeNotificacion frecNotif) {
        super(nombre, apellido, cuenta, correoElectronico,tipoNotif);
        this.setFrecuenciaDeNotificacion(frecNotif);
    }

    public void setFrecuenciaDeNotificacion(FrecuenciaDeNotificacion frecuenciaDeNotificacion) {
        this.frecuenciaDeNotificacion = frecuenciaDeNotificacion;
    }

}
