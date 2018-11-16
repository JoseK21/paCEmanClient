package com.ce.paceman.connection;

import java.util.Observable;

public class Controller {
    public static SocketCliente pipe;


    public Controller (String host, int port){
        //**************************</INICIALIZACIÓN DE LA CONEXIÓN************************************************
        //Se debe de hacer solo una vez cuando el programa inicia



        pipe= new SocketCliente(host,port); //<<<<<<<<<<<<<<<<<<<<localhost si es en la misma máquina o ip para otra en la misma red
        pipe.addObserver((Observable obj, Object arg) -> {//Añade un observer que se va a encargar de escuchar los mensajes entrantes, es asíncrono


            System.out.println("\nRespuesta recibida: " + arg);//arg es el mensaje recibido.
        });
        Thread thread=new Thread(pipe);
        thread.start();




        //**************************INICIALIZACIÓN DE LA CONEXIÓN/>************************************************


    }



}




