import java.io.*;
import java.net.*;

class App {

        public static void main(String[] args) throws Exception {

                String sentence;
                String modifiedSentence;
                BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));

                // Conectarse al servidor en el puerto 6789
                Socket clientSocket = new Socket("localhost", 6789); // Cambiar "localhost" por IP del servidor si es
                                                                     // remoto

                // Flujos para enviar y recibir datos
                DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
                BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                // Pedir al usuario la base
                System.out.print("Ingrese la base del rectángulo: ");
                String base = inFromUser.readLine();

                // Pedir al usuario la altura
                System.out.print("Ingrese la altura del rectángulo: ");
                String altura = inFromUser.readLine();

        }
}
