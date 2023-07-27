import java.util.*;

class Store {
    String name;
    Long mobileNo;
    double cost;
    double dis;
    double amount;

    // Default Constructor
    Store() {

    };

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter customer name: ");
        name = sc.next();
        System.out.println("Enter mobile no:");
        mobileNo = sc.nextLong();
        System.out.println("Enter the Cost of the product: ");
        cost = sc.nextDouble();

    }

    void calculate() {

        int discountedPercentage;

        if (cost <= 10000) {
            discountedPercentage = 5;
        } else if (cost <= 20000) {
            discountedPercentage = 10;
        } else if (cost <= 35000) {
            discountedPercentage = 15;
        } else {
            discountedPercentage = 20;
        }

        dis = (cost * discountedPercentage) / 100;
        amount = cost - dis;

    }

    void display() {

        System.out.println("Name of customer is:" + name);
        System.out.println("Mobile no is :" + mobileNo);
        System.out.println("cost after discount is " + amount);
    }
}

public class Showroom {
    public static void main(String[] args) {

        Store s1 = new Store();
        s1.input();
        s1.calculate();
        s1.display();
    }
}
