package arithmaticcalculator;

import java.util.Scanner;
public class ArithmeticOperations {
	
	    public static void main(String args[])
	  {
	    int first, second, add, subtract, multiply;
	    float divide;
	    Scanner scan = new Scanner(System.in);

	    System.out.print("Enter first Number : ");
	    first = scan.nextInt();
	    System.out.println("Enter second Number : ");
	    second = scan.nextInt();

	    add = first + second;
	    subtract = first - second;
	    multiply = first * second;
	    divide = (float) first / second;

	    System.out.println("Sum = "+first+" + "+second +" = "+ add);
	    System.out.println("Difference = "+first+" - "+second +" = " + subtract);
	    System.out.println("Multiplication = "+first+" * "+second +" = " + multiply);
	    System.out.println("Division = "+first+" / "+second +" = " + divide);
	  }
	}

