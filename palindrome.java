import java.util.*;

public class palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        int rem;
        int temp = num;
        int result = 0;

        for (int i = 1; i <= num; i++) {
            rem = num % 10;
            result = result + rem;
        }
        if (result == temp) {
            System.out.println(num + " " + " is Palindrome number");
        } else {
            System.out.println(num + " " + "Not a Palindrome number");
        }

    }
}