import java.util.ArrayList;
    /*
     * Задание: Дана коллекция с числами. Запишите в новую коллекцию только те числа, которые больше нуля и меньше 10-ти.
     * Коллекции вы создаёте сами
     */
    //public class Main {
    /*
     * Задание: Дана коллекция с числами. Запишите в новую коллекцию только те числа, которые больше нуля и меньше 10-ти.
     * Коллекции вы создаёте сами
     */
public class Main {
        public static void main(String[] args) {
            ArrayList firstList = new ArrayList(); //Создаём первый список
            for(int i=0; i<100; i++)
                firstList.add(Math.random()*100-50); //Наполняем первый список из 100 чисел от -50 до 49
            ArrayList secondList = new ArrayList(); //Создаём второй список
            for(int j=0; j< firstList.size(); j++)
                {if ((firstList.get(j) > 0)&&(firstList.get(j) < 10)) //проверяем условие 0< X <10
                    secondList.add(firstList.get(j));}  
        }
        
    }
