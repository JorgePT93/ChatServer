package cl.ucn.disc.dsm.chat.model;

import cl.ucn.disc.dsm.chat.model.ChatMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {


    public static void main(String args[]) throws IOException {

        serverSocket = null;
        try{
            serverSocket = new ServerSocket (port);
        }catch(IOException errorPort){
            System.err.println("No se puede escuchar el puerto: "+port);
            System.exit(1);
        }
    }

    public static void acceptClients(){
        while(true){
            try {
                Socket socket = serverSocket.accept();
            }catch(IOException errorPort){
                System.out.println("Aprovacion fallo en el puerto: "+port);
            }
        }
    }


}
