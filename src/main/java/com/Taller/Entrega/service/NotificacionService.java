package com.Taller.Entrega.service;

import com.Taller.Entrega.factory.NotificacionFactory;
import com.Taller.Entrega.interfaces.Notificacion;
import org.springframework.stereotype.Service;

@Service
public class NotificacionService {

    public String enviarNotificacion(String tipo) {
        Notificacion notificacion = NotificacionFactory.crearNotificacion(tipo);
        return notificacion.enviar();
    }
}