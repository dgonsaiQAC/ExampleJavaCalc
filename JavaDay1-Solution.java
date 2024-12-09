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
          case '*':
		  // additional task - check multiplication syntax
              result = num1 * num2;
              System.out.println(num1 + " * " + num2 + " = " + result);
              break;
          case '/':
		  // additional task - check for 0 in division
              if (num2 != 0) {
                  result = num1 / num2;
                  System.out.println(num1 + " / " + num2 + " = " + result);
              } else {
                  System.out.println("You cannot divide by zero!");
              }
              break;
          // additional task - add modulo switch:case 
		  case '%':
              result = num1 % num2;
              System.out.println(num1 + "%" + num2 + "=" + result);

              if (result == 0) {
                System.out.println("Modulo is true!");
              } else {
                System.out.println("Modulo is false!");
              }
              break;
          default:
		  // additional task - correct statements
              System.out.println("Error: Please choose a valid operator (+, -, x, /).");
      }
      
      System.out.println("Thank you for using the calculator!");
      scanner.close();
  }
}