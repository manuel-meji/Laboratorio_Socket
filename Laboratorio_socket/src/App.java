import java.io.*;
import java.net.*;

class App {

        public static void main(String[] args) throws Exception {

                String sentence;
                String modifiedSentence;
                BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));

        String sentence;
        String modifiedSentence;
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        
    // Conectarse al servidor en el puerto 6789
    Socket clientSocket = new Socket("localhost", 6789); // Cambiar "localhost" por IP del servidor si es remoto

    // Flujos para enviar y recibir datos
    DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
    BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));




    // Enviar ambas medidas al servidor separadas por coma
    outToServer.writeBytes(base + "," + altura + '\n');

    // Esperar la respuesta del servidor
    String respuesta = inFromServer.readLine();
    System.out.println("Área calculada por el servidor: " + respuesta);

    // Cerrar conexión
    clientSocket.close();
}

    }

