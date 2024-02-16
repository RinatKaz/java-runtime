package Lesson11MassivExCompany;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        company.name = "Apple";
        company.employees= new Employee[4];


        Employee employee = new Employee();
        employee.name = "Maksim";
        employee.age =24;
        company.hire(employee);

        employee = new Employee();
        employee.name = "Almaz";
        employee.age =26;
        company.hire(employee);

        employee = new Employee();
        employee.name = "Diego";
        employee.age =23;
        company.hire(employee);

        employee = new Employee();
        employee.name = "Alex";
        employee.age =28;
        company.hire(employee);

        company.display();
        company.fire("Diego");
        company.display();

    }
}
