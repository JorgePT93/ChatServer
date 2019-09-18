package cl.ucn.disc.dsm.chat.model;

import java.net.Socket;
import java.io.IOException;

public class Client {

    public static void main(String[] args) throws IOException{
        Socket socket = null;
        int port = 9000;
        try{
            socket = new Socket("localhost",port);

        }catch(IOException errorPort){
            System.err.println("Error de conexion!");
            errorPort.printStackTrace();
        }
    }
}
