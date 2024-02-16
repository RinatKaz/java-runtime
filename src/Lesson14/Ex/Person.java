package Lesson14.Ex;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        if (name!="") {
            this.name = name;
        }else {
            System.out.println("Имя не может быть пустым");
        }
    }

    public void setAge(int age) {
        if (age>0) {
            this.age = age;
        }else {
            System.out.println("Возраст не может быть меньше нуля");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
