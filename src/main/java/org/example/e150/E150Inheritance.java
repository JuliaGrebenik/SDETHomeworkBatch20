package org.example.e150;

public class E150Inheritance {

    public static void main(String[] args) {
        Employee e=new Employee("Joe","Smith",35, 35000);
e.printEmployeeDetails();

        Student s=new Student("Adam","Smith",15, 10);
        s.printStudentDetails();

        Retiree r=new Retiree("Frank", "Smith", 15, "tour");
        r.printRetireeDetails();
    }

}
