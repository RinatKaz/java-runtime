package Lesson11MassivExCompany;

public class Company {
    String name;
    Employee[] employees;

    void hire(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                break;
            }
        }
    }

    void fire(String nameFire){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].name == name){
                employees[i]= null;
                break;

            }
        }
    }
    void display(){
        System.out.println(name);
        for (Employee employee : employees) {
            if (employee!=null){
                System.out.println(employee.name+" "+employee.age);
            }

        }
    }
}

