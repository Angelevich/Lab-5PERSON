

//Задача: создание класса с определенными условиями.Ход выполнения:
//    1. Создать класс Person, который содержит:
//       - переменные fullName, age;
//        - методы move() и talk(), в которых вывести на консоль сообщение "Такой-то  Person говорит".
//        2. Добавить два конструктора: Person() и Person(fullName, age).
//       3. Создать два объекта этого класса:  Person() и Person(fullName, age).
public class persons {
    public static void main( String[] args ) {
        Person person1 = new Person();
        Person person2 = new Person("Александр", 41);

        person1.PersonMove();
        person2.PersonTalk();
    }
}
