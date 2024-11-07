package taller04.grupo4.Sistema_Notificaciones;

public class AdapterWhatsapp implements Notificacion{
    public Notificacion ajustarWhatsapp(Notificacion notificacion){
        //Ajusta la notificacion para que se envie  por telegram
        return new AdapterWhatsapp();

    }
    @Override
    public Notificacion generarNotificacion(Notificacion  notificacion) {
        AdapterWhatsapp  adapterWhatsapp = (AdapterWhatsapp) ajustarWhatsapp(notificacion);

        return adapterWhatsapp;
        
    }

}
