package server;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class server {
    public static void main(String[] args) {
        ArrayList<Socket> clients = new ArrayList<>(); //создём список сокетов клиентов
        ArrayList<String> names = new ArrayList<>(); //создём список имён клиентов
        Socket socket = null;
        try {ServerSocket serverSocket = new ServerSocket(10000);
            System.out.println("Сервер работает");
            while (true){
                socket = serverSocket.accept(); //устанавливаем соединение с клиентом
                DataOutputStream out = new DataOutputStream(socket.getOutputStream()); //создаем поток сообщения клиенту
                out.writeUTF("Представьтесь в чате, пожалуйста"); //запрашиваем имя клиента
                DataInputStream in = new DataInputStream(socket.getInputStream()); //создаем поток приёма от клиента
                String name = in.readUTF(); //принимаем имя клиента
                out.writeUTF(name+", добро пожаловать в чат!");
                names.add(name); //сохраняем имя клиента
                clients.add(socket); //сохраняем сокет клиента
                //DataInputStream in = new DataInputStream(socket.getInputStream());
                //DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                Thread thread = new Thread(new Runnable(){
                    @Override
                    public void run(){
                        try {
                            while (true) {
                            String request = null;
                            System.out.println("Ожидаем сообщения...");
                                request = in.readUTF();
                                System.out.println(name + " прислал " + request);
                                DataOutputStream outputStream;
                                for (Socket socket:clients)
                                {
                                DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                                out.writeUTF(name + " отправил сообщение " + request);
                                }
                            }
                        }catch (IOException e) {
                            e.printStackTrace();
                        } }});
                thread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
