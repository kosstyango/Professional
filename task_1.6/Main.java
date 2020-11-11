import java.util.Scanner;
/*
Пользователь вводит число, необходимо увеличить это число на 15% и вывести результат на экран
*/

    public class Main {
        public static void main(String[] args) {
            System.out.println("Введите число");
            Scanner s = new Scanner(System.in);
            int number = s.nextInt();
            Double result = number*1.15;
            System.out.println(result);

        }
    }
