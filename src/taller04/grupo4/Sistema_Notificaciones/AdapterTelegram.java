package taller04.grupo4.Sistema_Notificaciones;

public class AdapterTelegram implements Notificacion{
    public Notificacion ajustarTelegram(Notificacion notificacion){
        //Ajusta la notificacion para que se envie  por telegram
        return new AdapterTelegram();

    }
    @Override
    public Notificacion generarNotificacion(Notificacion  notificacion) {
        AdapterTelegram  adapterTelegram = (AdapterTelegram) ajustarTelegram(notificacion);

        return adapterTelegram;
        
    }
}
