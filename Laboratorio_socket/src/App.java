// Josué David Ortiz Bermudez C4I156
//Samanta De Franco C4E644
//Telma Mercado Talavera c4L697
//David Avila C10789
import java.io.*;
import java.net.*;

class TCPClient {
    public static void main(String argv[]) throws Exception {
        // Crear lector para ingreso por teclado
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));

        // Conectarse al servidor en el puerto 6789
        Socket clientSocket = new Socket("10.153.157.11", 6789); // Cambiar "localhost" por IP del servidor si es remoto

        // Flujos para enviar y recibir datos
        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        // Pedir al usuario la base
        System.out.print("Ingrese la base del rectángulo: ");
        String base = inFromUser.readLine();

        // Pedir al usuario la altura
        System.out.print("Ingrese la altura del rectángulo: ");
        String altura = inFromUser.readLine();

        // Enviar ambas medidas al servidor separadas por coma
        outToServer.writeBytes(base + "," + altura + '\n');

        // Esperar la respuesta del servidor
        float respuesta = Float.parseFloat(inFromServer.readLine());
        System.out.println("Área calculada por el servidor: " + respuesta);

        // Cerrar conexión
        clientSocket.close();
    }
}