package com.Taller.Entrega.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Taller.Entrega.service.NotificacionService;



@RestController
@RequestMapping("/notificaciones")
public class NotificacionController {

    @Autowired
    private NotificacionService service;

    @GetMapping("/{tipo}")
    public String enviar(@PathVariable String tipo) {
        return service.enviarNotificacion(tipo);
    }
}
