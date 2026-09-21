package Employee_Management_System;

public class Manager extends Employee{
    Manager(String name){
        super(name);
    }
    @Override
    public void work() {
        System.out.println("Manager is managing the team.");
    }
}
