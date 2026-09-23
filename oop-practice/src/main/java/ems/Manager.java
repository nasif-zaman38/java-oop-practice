package ems;

public class Manager extends Employee{
    Manager(String name){
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Manager is managing the team.");
    }
}
