import  java.util.Scanner;

public class ExceptionPractice {

    public static void main(String[] args){
        Scanner  userInput = new Scanner(System.in);

        try{
            System.out.println("Enter the first Number: ");
            int firstNumber = userInput.nextInt();

            System.out.println("Enter the second Number: ");
            int secondNumber = userInput.nextInt();

            int result = firstNumber / secondNumber;
        }
        catch(ArithmeticException e){
            System.err.println("Error: Cannot divide by zero. Please try again.");
            System.err.println("Technical Details: " + e.getMessage());
        }finally {
            System.out.println("Completed");
            userInput.close();
        }
    }
}
