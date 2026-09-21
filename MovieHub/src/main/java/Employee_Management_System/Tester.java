package Employee_Management_System;

public class Tester extends Employee{
    Tester(String name){
        super(name);
    }
    @Override
    public void work() {
        System.out.println("Tester is testing the application.");
    }
}
