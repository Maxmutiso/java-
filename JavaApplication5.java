import java.util.Scanner ;

class Main {
  public static void main(String[] args) {
      //this code calculates different bumbers by adding or subtracting and multiplying
    char operator;
    Double number1, number2, result;

      // ask users to enter operator
      try ( // create an object of Scanner class
              Scanner input = new Scanner(System.in)) {
          
          // ask users to enter numbers
          System.out.println("Enter first number");
          number1 = input.nextDouble();
          
          System.out.println("Enter second number");
          number2 = input.nextDouble();
                  // ask users to enter operator
          System.out.println("Choose an operator: +, -, *, or /");
          operator = input.next().charAt(0);
          switch (operator) {
              
              // performs addition between numbers
              case '+':
                  result = number1 + number2;
                  System.out.println(number1 + " + " + number2 + " = " + result);
                  break;
                  
                  // performs subtraction between numbers
              case '-':
                  result = number1 - number2;
                  System.out.println(number1 + " - " + number2 + " = " + result);
                  break;
                  
                  // performs multiplication between numbers
              case '*':
                  result = number1 * number2;
                  System.out.println(number1 + " * " + number2 + " = " + result);
                  break;
                  
                  // performs division between numbers
              case '/':
                  result = number1 / number2;
                  System.out.println(number1 + " / " + number2 + " = " + result);
                  break;
                  
              default:
                  System.out.println("Invalid operator!");
                  break;
          } }
  }
}