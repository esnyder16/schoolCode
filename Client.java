package clientSide;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

import java.net.InetSocketAddress;

import java.net.Socket;

import javax.swing.JOptionPane;

/**

 * client for the date server.

 */

public class Client
{

    /**

     * Runs the client application to read date and time from the server side..

     */

    public static void main(String[] args) throws IOException
    {

        String serverAddress = "";

        /** To Do

         * Create a socket and connects it to the specified

         * port number you created in the server side.

         * Hint: Use the constructor with host name and port as parameters

         */

        /* TO DO Here*/

        Socket clientSocket = new Socket("localhost", 7070);

        BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        String serverTime = input.readLine();

        System.out.println(serverTime);
        /* To Do

         * Write code to disconnect Here.

         */

        /* TO DO Here*/

        clientSocket.close();

        System.exit(0);

    }

}