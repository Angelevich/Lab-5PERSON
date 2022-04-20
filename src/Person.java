public class Person {
    String Fullname;
    int Age;
    public Person(String name, int age) {
        Fullname= name;
        Age =age;
    }
    public Person() {
        Fullname=null;
        Age=0;
    }
    public void PersonMove() {
        System.out.println("Привет меня зовут Александр");
    }
    public void PersonTalk() {
        System.out.println("Пойду спать");
    }
}
