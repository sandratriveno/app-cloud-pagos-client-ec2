package pe.edu.idat.app_cloud_pagos_client_ec2.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CloudController {
    @Value("${mensaje:Default mensaje}")
    private String mensaje;

    @GetMapping("/mensaje")
    public String verMensajeCloud(){
        return mensaje;
    }


    //EndPoint para recibir idPedido
    @GetMapping("/realizar-pago/{idPedido}")
    public String procesarPago(@PathVariable Long idPedido) {
        return "Pago realizado con éxito para el pedido: " + idPedido;
    }
}
