package Employee_Management_System;

public class Developer extends Employee{
    Developer(String name){
        super(name);
    }
    @Override
    public void work() {
        System.out.println("Developer is writing code.");
    }
}
