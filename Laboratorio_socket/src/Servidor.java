import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

    public static void main(String[] args) throws IOException {

        double base, altura, resultado;
        ServerSocket welcomeSocket = new ServerSocket(6789);
        System.out.println("Servidor esperando conexiones...");

        while (true) {
            Socket connectionSocket = welcomeSocket.accept();
            System.out.println("Cliente conectado");

            BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));

            DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());

            String baseStr = inFromClient.readLine();
            base = Double.parseDouble(baseStr);

            String alturaStr = inFromClient.readLine();
            altura = Double.parseDouble(alturaStr);

            resultado = base * altura;

            outToClient.writeBytes("Área del rectángulo: " + resultado + "\n");

            connectionSocket.close();
        }
    }
}
