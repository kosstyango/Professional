import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи
Лондон
Пример вывода:
Абрамовичи */
 public class Main {
        public static void main(String[] args) {
            System.out.println("Добрый день! Заполните базу данных, пожалуйста:");
            Scanner s = new Scanner(System.in);

            List<String> list = new ArrayList<>();
            List<String> cities = new ArrayList<>();
            while (true) {
                System.out.print("Фамилия: ");
                String family = s.nextLine();
                System.out.print("Город проживания:");
                String city = s.nextLine();

                if (family.isEmpty()) break;

                list.add(family);
                cities.add(city);
            }
            // Read the city
            while (true){
                System.out.println("Введите фамилию, чтобы узнать город проживания");
            String family = s.nextLine();
            int index;
            if (list.contains(family)) {
                    index=list.indexOf(family);
                    System.out.println("По данным нашей базы, "+family+" проживает в городе "+cities.get(index));
                    }
                else System.out.println("Фамилия не найдена в базе");
            }
        }
