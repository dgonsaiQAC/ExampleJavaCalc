// Below is the code for a simple calculator. You have 2 main tasks here:
// 1. Edit the code to ensure that it calculates correctly
// 2. Add code to do an additional calculation

//importing the scanner to take user input
//this input is simulated by the stdin (standard input) on the right
import java.util.Scanner;

//public class calculator has a main method pointed at to run the program
public class Calculator {
    public static void main(String[] args) {
      
      //creating a new scanner object to take in user input
      Scanner scanner = new Scanner(System.in);
      System.out.println("Welcome to this calculator app! Enter 2 numbers (spaced) alongside the operator you want to use...");
      System.out.println("");

      // The scanner will take in the first floating point number
      System.out.print("Enter your first number: ");
      float num1 = scanner.nextFloat(); 
      System.out.println("");

      // The scanner will take in the next floating point number - we have our two numbers to calculate!
      System.out.print("Enter your second number: ");
      float num2 = scanner.nextFloat();
      System.out.println("");

      // Finally, the scanner will take in user input on the operator to use
      System.out.println("Choose which operator to use: ");
      char operator = scanner.next().charAt(0);
      System.out.println("");

      // initialise the variable that will hold the result
      float result = 0;

      // using a switch:case statement for each operator
      switch (operator) {
          case '+':
              result = num1 + num2;
              System.out.println(num1 + " + " + num2 + " = " + result);
              break;
          case '-':
              result = num1 - num2;
              System.out.println(num1 + " - " + num2 + " = " + result);
              break;
		  // read this block - is this correct? edit it to make sure it is!
          case '*':
              result = num1 x num2;
              System.out.println(num1 + " x " + num2 + " = " + result);
              break;
          case '/':
		 // how could we recognise if 0 is used as the second number? we can't divide by zero!
			  result = num1 / num2 
              System.out.println(num1 + " / " + num2 + " = " + result);
              break;
		  
		  // add an additional statement here to calculate the modulo of the first number by the second number. 
		  //for example, firstnum is 4, secondnum is 2, so you will calculate 2 to the power of 4, which equals 16
		  //you can calculate x to the modulo of y with the use of the % operator
		  
		  // use the switch:case statement structure above to make a new statement for this!
		  
	
          default:
		  // are these the correct operators?
              System.out.println("Error: Please choose a valid operator (+, -, x, /).");
      }
      
      System.out.println("Thank you for using the calculator!");
      scanner.close();
  }
}