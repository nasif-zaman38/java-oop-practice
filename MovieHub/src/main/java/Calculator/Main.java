package Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        System.out.println("Sum of two integers: "+c.add(20,10));
        System.out.println("Sum of three integers: "+c.add(20, 10, 5));
        System.out.println("Sum of two decimal numbers: "+c.add(10.5, 7.9));
        System.out.println("Sum of integer and decimal number: "+c.add(10,5.5));
    }
}
