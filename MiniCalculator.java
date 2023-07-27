import java.util.*;

public class MiniCalculator {

    public static void main(String[] args) {
        char ch;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Operand 1");
            int operand1 = sc.nextInt();
            System.out.println("Enter the Operand 2");
            int operand2 = sc.nextInt();

            System.out.println("Enter the Operation do you want to do");
            System.out.println("1 - Addition");
            System.out.println("2 - Subtraction");
            System.out.println("3 - Division");
            System.out.println("4 - Multiplication");
            System.out.println("Enter the operation from above");
            int operation = sc.nextInt();
            int result;

            switch (operation) {

                case 1:
                    result = operand1 + operand2;
                    System.out.println("Here is your result: " + result);

                    break;
                case 2:
                    result = operand1 - operand2;
                    System.out.println("Here is your result: " + result);

                    break;
                case 3:
                    result = operand1 / operand2;
                    System.out.println("Here is your result: " + result);

                    break;
                case 4:
                    result = operand1 * operand2;
                    System.out.println("Here is your result: " + result);

                    break;

                default:
                    System.out.println("invalid character");
                    break;
            }

            System.out.println("Enter the character if you want to continue the program 'y' or 'n' ");
            ch = sc.next().charAt(0);

        } while (ch == 'y');

    }
}
