package Lesson14.Ex.Inkapsulyaciya;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alex", 40);
        person.setAge(45);
        person.printAll();

        person.setAge(55);
        person.printAll();

        person.setName("Maxim");
        person.printAll();

        person.setName(null);
        person.printAll();


    }
}
