package com.Taller.Entrega.implementations;

import com.Taller.Entrega.interfaces.Notificacion;

public class NotificacionEmail implements Notificacion {

    @Override
    public String enviar() {
        return "Notificación enviada por correo electrónico";
    }
}