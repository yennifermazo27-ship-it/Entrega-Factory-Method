package com.Taller.Entrega.factory;

import com.Taller.Entrega.implementations.NotificacionEmail;
import com.Taller.Entrega.implementations.NotificacionSMS;
import com.Taller.Entrega.implementations.NotificacionWhatsApp;
import com.Taller.Entrega.interfaces.Notificacion;

public class NotificacionFactory {

    public static Notificacion crearNotificacion(String tipo) {
        if (tipo.equalsIgnoreCase("email")) {
            return new NotificacionEmail();
        }
        if (tipo.equalsIgnoreCase("sms")) {
            return new NotificacionSMS();
        }
        if (tipo.equalsIgnoreCase("whatsapp")) {
            return new NotificacionWhatsApp();
        }
        throw new IllegalArgumentException("Tipo de notificación no válido: ");
    }
}