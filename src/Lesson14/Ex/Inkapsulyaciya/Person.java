package Lesson14.Ex.Inkapsulyaciya;

public class Person {
    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }else {
            System.out.println("Ошибка в имени");
        }
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printAll(){
        System.out.println(name+", "+age);
    }
}
