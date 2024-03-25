package Lesson36_binarniiPoisk.Home_1;

import java.util.Objects;

public class Student{
    String name;
    String groupNumber;
    String studentIdNumber;

    public Student(String name, String groupNumber, String studentIdNumber) {
        this.name = name;
        this.groupNumber = groupNumber;
        this.studentIdNumber = studentIdNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getStudentIdNumber() {
        return studentIdNumber;
    }

    public void setStudentIdNumber(String studentIdNumber) {
        this.studentIdNumber = studentIdNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", groupNumber='" + groupNumber + '\'' +
                ", studentIdNumber='" + studentIdNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentIdNumber, student.studentIdNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentIdNumber);
    }


}