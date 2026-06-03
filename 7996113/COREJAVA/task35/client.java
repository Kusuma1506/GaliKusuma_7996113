import java.io.*;
import java.net.*;

public class client {

    public static void main(String[] args) {

        try {

            Socket socket = new Socket("localhost", 5000);

            System.out.println("Connected to Server");

            DataInputStream input =
                    new DataInputStream(socket.getInputStream());

            DataOutputStream output =
                    new DataOutputStream(socket.getOutputStream());

            BufferedReader br =
                    new BufferedReader(new InputStreamReader(System.in));

            String msgIn = "", msgOut = "";

            while (!msgIn.equals("exit")) {

                System.out.print("Client: ");

                msgOut = br.readLine();

                output.writeUTF(msgOut);

                output.flush();

                msgIn = input.readUTF();

                System.out.println("Server: " + msgIn);
            }

            socket.close();

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}