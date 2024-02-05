package javaFundemantals;


import java.util.Scanner;

public class InputAndArithmeticOperators {
    public static void main(String[] args){
      String name;
      float num1,num2;
      Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Basic Addition");
        System.out.print("What is your Name: ");
        name = input.nextLine();
        System.out.print("Enter your First Digit: ");
        num1 = input.nextFloat();
        System.out.print("Enter your Second Digit: ");
        num2 = input.nextFloat();
        System.out.println("Hello " + name + "\nThe Sum of your 2 digits is equals to: " + (num1+num2));

    }

}
