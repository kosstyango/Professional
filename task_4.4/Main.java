/*
Создай классы Dog, Cat, Mouse.
Добавь по три поля в каждый класс, на твой выбор.
Создай объекты для героев мультика Том и Джерри.
Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse("Jerry", 12 , 5),
где 12 - высота в см,
5 - длина хвоста в см.
Требования:
•	Создай класс Dog.
•	Создай класс Cat.
•	В классе Dog должно быть три переменные.
•	В классе Cat должно быть три переменные.
•	Должен быть создан хотя бы один объект типа Mouse.
•	Должен быть создан хотя бы один объект типа Dog.
•	Должен быть создан хотя бы один объект типа Cat.
*/
public class Main {
                public static void main(String[] args) {
                        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
                        Cat tomCat = new Cat("Tom",5, 6);
                        Dog spykeDog = new Dog("Spyke",7,12);
                System.out.println ("создана мышь "+ jerryMouse.name + ", рост " + jerryMouse.height + ", хвост " + jerryMouse.tail);
                System.out.println ("создан кот "+ tomCat.name + ", возраст " + tomCat.age + ", масса " + tomCat.weight);
                System.out.println ("создан пёс "+ spykeDog.name + ", возраст " + spykeDog.age + ", масса " + spykeDog.weight);
                }
        }
        class Mouse {
                String name;
                int height;
                int tail;

                public Mouse(String name, int height, int tail) {
                        this.name = name;
                        this.height = height;
                        this.tail = tail;
                }
        }

        class Cat {
                String name;
                int age;
                int weight;

                public Cat(String name, int age, int weight) {
                        this.name = name;
                        this.age = age;
                        this.weight = weight;
                }
        }

        class Dog {
                String name;
                int age;
                int weight;

                public Dog(String name, int age, int weight) {
                        this.name = name;
                        this.age = age;
                        this.weight = weight;
                }
        }
