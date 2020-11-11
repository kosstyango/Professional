import java.util.Scanner;

/*
Задание: Сделайте функцию, которая параметрами принимает 2 числа.
Если их сумма больше 10 - пусть функция вернет true, а если нет - false.
*/
public class Main {
                public static void main(String[] args) {
                        System.out.println("Введите первое число, пожалуйста");
                        Scanner s = new Scanner(System.in);
                        double a = s.nextDouble();
                        System.out.println("Введите второе число, пожалуйста");
                        double b = s.nextDouble();
                        checker(a, b);
                }
                        public static boolean checker(double a, double b){
                        if ((a+b)>10) return true;
                        else return false;
                        }
        }
