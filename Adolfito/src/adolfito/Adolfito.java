/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adolfito;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author enrik
 */
public class Adolfito {

    public static final int PUERTO=4444;
    
    ServerSocket socket;
    Socket sckServidor;
    
    public void arrancarAervidor(){
        try {
            socket=new ServerSocket(PUERTO);
            sckServidor = socket.accept();
        } catch (IOException ex) {
            System.out.println("No se ha podido crear el servidor en le puerto "+PUERTO+" puto");
        }
    }
}
