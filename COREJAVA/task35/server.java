import java.io.*;
import java.net.*;

public class server {

    public static void main(String[] args) {

        try {

            ServerSocket serverSocket = new ServerSocket(5000);

            System.out.println("Server Started...");
            System.out.println("Waiting for client...");

            Socket socket = serverSocket.accept();

            System.out.println("Client Connected");

            DataInputStream input =
                    new DataInputStream(socket.getInputStream());

            DataOutputStream output =
                    new DataOutputStream(socket.getOutputStream());

            BufferedReader br =
                    new BufferedReader(new InputStreamReader(System.in));

            String msgIn = "", msgOut = "";

            while (!msgIn.equals("exit")) {

                msgIn = input.readUTF();

                System.out.println("Client: " + msgIn);

                System.out.print("Server: ");

                msgOut = br.readLine();

                output.writeUTF(msgOut);

                output.flush();
            }

            socket.close();
            serverSocket.close();

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}