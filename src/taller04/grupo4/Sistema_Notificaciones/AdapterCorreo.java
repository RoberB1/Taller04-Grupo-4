package taller04.grupo4.Sistema_Notificaciones;

public class AdapterCorreo implements Notificacion{
    public Notificacion ajustarCorreo(Notificacion notificacion){
        //Ajusta la notificacion para que se envie  por telegram
        return new AdapterCorreo();

    }
    @Override
    public Notificacion generarNotificacion(Notificacion  notificacion) {
        AdapterCorreo  adapterCorreo = (AdapterCorreo) ajustarCorreo(notificacion);

        return adapterCorreo;
        
    }

}
