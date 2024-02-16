package Lesson14.Ex;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ivan",24);

        System.out.println(person.getName());
        System.out.println(person.getAge());

        person.setName("");
        person.setAge(0);

        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
