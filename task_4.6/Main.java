/*
Задача вывести на экран такое сообщение (для объекта gosha):
Меня зовут "имя объекта"
Имя моей мамы: "имя мамы"
Имя моего папы: "имя папы"
У меня две бабушки, бабушка "имя бабушки" и "имя бабушки"
У меня два деда, деда "имя деда" и "имя деда"
*/

        public class Main {
            public static void main(String[] args) {
                Person valera=new Person("Валера","Иванов",69,null,null);
                Person olga = new Person("Ольга","Иванова",67,null,null);
                Person oleg = new Person("Олег","Петров",65,null,null);
                Person jula = new Person("Юля","Петрова",67,null,null);
                Person alex = new Person("Алексей","Иванов",37,olga,valera);
                Person eva  = new Person("Ева","Иванова",37,jula,oleg);
                Person gosha= new Person("Гоша","Иванов",10,eva,alex);
                System.out.println("Меня зовут: "+gosha.getName());
                System.out.println("Имя моей мамы: "+gosha.getMother().getName());
                System.out.println("Имя моего папы: "+gosha.getFather().getName());
                System.out.println("У меня две бабушки: бабушка "+gosha.getMother().getMother().getName()+" и бабушка "+gosha.getFather().getMother().getName());
                System.out.println("У меня два дедушки: дедушка "+gosha.getMother().getFather().getName()+" и дедушка "+gosha.getFather().getFather().getName());
    }
        }

        class Person{
            private String name;
            private String lastname;
            private int age;
            private Person mother;
            private Person father;
            public Person(String name, String lastname, int age, Person mother, Person father){
                this.name = name;
                this.lastname = lastname;
                this.age = age;
                this.mother = mother;
                this.father = father;
            }
            public String getName() {
                return this.name;
            }
            public Person getFather(){
                return this.father;
            }
            public Person getMother(){
                return this.mother;
            }
        }
