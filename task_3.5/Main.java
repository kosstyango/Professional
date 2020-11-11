Задание: Дан массив с числами. Выведите последовательно его элементы используя рекурсию и не используя цикл.
*/
public class Main {
                public static void main(String[] args) {
                        int num[] = {4,2,6,2,65}, pointer=0;

                        private static void massiveprinter(pointer) {
                                System.out.print (num[pointer]);
                                //pointer++;
                                if (pointer > num.length) return;
                                massiveprinter(pointer+1);
                        }
                }
        }
