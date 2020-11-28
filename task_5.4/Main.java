import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:/Games/test.txt");
        try {
            file.createNewFile();
            FileWriter w = new FileWriter("C://Games/test.txt");
            String text = ("5\n" + "8\n" + "-2\n" + "11\n" + "3\n" + "-5\n" + "2\n" + "10");
            w.write(text);
            w.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String address;
        Scanner s = new Scanner(System.in);
        while (true)
        {System.out.println("Введите путь к файлу для работы, пожалуйста:");
        address = s.next();
        if (address.contains(" ")||!(address.contains("C:\\"))) System.out.println("Неправильный путь к файлу. Попробуйте ещё раз");
            else break;
        }
        s.close();
        System.out.println("Путь к файлу: " + address + "\nПриступаем к работе");
        ArrayList list = new ArrayList();

        try {
            FileReader r = new FileReader(address);
            Scanner scan = new Scanner(r);
            int c;
            while (scan.hasNextLine()) {
                c=Integer.parseInt(scan.nextLine());
                if(c%2==0) list.add(c);
                }
            Collections.sort(list);
            System.out.println(list);

        } catch (IOException e) {
            e.printStackTrace();
        }
