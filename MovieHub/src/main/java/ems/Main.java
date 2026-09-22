package ems;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Developer("Alice");
        Employee employee2 = new Tester("Bob");
        Employee employee3 = new Manager("Charlie");

        employee1.work();
        employee2.work();
        employee3.work();
    }
}
