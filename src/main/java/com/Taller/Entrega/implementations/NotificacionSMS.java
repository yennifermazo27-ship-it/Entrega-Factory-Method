package com.Taller.Entrega.implementations;

import com.Taller.Entrega.interfaces.Notificacion;

public class NotificacionSMS implements Notificacion {

    @Override
    public String enviar() {
        return "Notificación enviada por SMS";
    }
}