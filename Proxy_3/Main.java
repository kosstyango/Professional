import java.io.*;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class Proxy_3 {
    public void main(String[] args) {
        ArrayList<String> ipList = new ArrayList<>();

        try {
            FileReader r = new FileReader("C://Games/Test.txt"); //Читаем файл
            int a;
            String proxy = ""; //создаём пустую строку proxy "IP адрес:порт"
            while ((a = r.read()) != -1) {
                if (a == 10) {
                    ipList.add(proxy); //конец строки, добавляем proxy в ipList
                    proxy = "";
                } //очищаем proxy для следующего цикла
                else if (a != 9) proxy += (char) a; //добавляем символ из файла в строку proxy если это НЕ табуляция
                else proxy += ":"; //вместо табуляции ставим двоеточие
            } //закончили работу с файлом
            
            for (String ipString : ipList) { //начинаем цикл по списку из файла
                String ip = ipString.split(":")[0]; //получаем строку из файла
                int port = Integer.parseInt(ipString.split(":")[1]); //разделяем полученную строку по двоеточиям

            Thread t = new Thread(new Runnable(){//реализуем поток методом "от интерфейса Runnable"    
                @Override
                public void run() {
                        System.out.println("проверяю " + ip + "...");
                        try {
                            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(ip, port));
                            URLConnection firstConnection = new URL("https://Vozhzhaev.ru/test.php").openConnection(proxy);
                            InputStream is = firstConnection.getInputStream();
                            InputStreamReader r = new InputStreamReader(is);
                            char[] store = new char[256];
                            int s;
                            StringBuilder string = new StringBuilder();
                            while ((s = r.read(store)) != -1) {
                                string.append(store, 0, s);
                            }
                            r.close(); //закрыли поток чтения
                            System.out.println(string + " РАБОТАЕТ!!!");
                        } catch (IOException e) {
                            System.out.println(ip + " НЕ работает");
                        }                    
                }
            });
            t.start();
        }
    } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
