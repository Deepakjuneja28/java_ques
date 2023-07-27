import java.util.*;
// MODULE 10 QUESTION

// 1.

// class Employee {

//     String name;
//     int year;
//     String address;

//     void display() {
//         System.out.println("" + name + "\t" + year + "\t" + address);

//     }

// }

// public class labquestions {
//     public static void main(String[] args) {

//         System.out.println("Name" + "\tYear" + "\tAddress");
//         Employee e1 = new Employee();
//         e1.name = "Robert";
//         e1.year = 1994;
//         e1.address = "64C- WALLSTREAT";
//         e1.display();

//         Employee e2 = new Employee();
//         e2.name = "Sam";
//         e2.year = 2000;
//         e2.address = "68D- WALLSTREAT";
//         e2.display();

//         Employee e3 = new Employee();
//         e3.name = "JOHN";
//         e3.year = 1999;
//         e3.address = "26B- WALLSTREAT";
//         e3.display();
//     }
// }

// 2.

// class Average {

//     int num1, num2, num3;
//     float average;

//     void getInfo() {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter num1");
//         num1 = sc.nextInt();
//         System.out.println("Enter num2");
//         num2 = sc.nextInt();
//         System.out.println("Enter num3");
//         num3 = sc.nextInt();

//     }

//     int calculateAverage() {
//         return (num1 + num2 + num3) / 3;
//     }

// }
// 3.

// class Area {
//     int breadth, length;

//     Area(int length, int breadth) {
//         this.length = length;
//         this.breadth = breadth;
//     }

//     int returnArea() {
//         return length * breadth;
//     }

// }

// 4.

// class Doctors {
//     String name;
//     int experience;

//     Doctors(String name, int experience) {
//         this.experience = experience;
//         this.name = name;
//     }

//     void displayInfo() {
//         System.out.println("Name  is " + name + " and Experience of " + experience);
//     }
// }

// multilevel inheritance

// class Surgeon extends Doctors {
//     String Specialization;

//     Surgeon(String name, int experience, String Specialization) {
//         super(name, experience);
//         this.Specialization = Specialization;
//     }

//     void displayInfo() {
//         super.displayInfo();
//         System.out.println("Specialization:" + Specialization);
//     }

// }
//  herarichle inheritance

// class Nurse extends Doctors {
//     int noOfPatients;

//     Nurse(String name, int experience, int noOfPatients) {
//         super(name, experience);
//         this.noOfPatients = noOfPatients;
//     }

//     void displayInfo() {
//         super.displayInfo();
//         System.out.println("number of patients" + noOfPatients);
//     }
// }

//5.

// class showRoom {
//     String name;
//     long mobileNo;
//     double cost;
//     double dis;
//     double amount;

//     showRoom() {

//     }

//     void input() {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your name:");
//         name = sc.next();
//         System.out.println("Enter your Mobile no:");
//         mobileNo = sc.nextLong();
//         System.out.println("Enter your Cost:");
//         cost = sc.nextDouble();
//     }

//     void calculate() {
//         double discountedPercentage;
//         if (cost <= 10000) {
//             discountedPercentage = 5;
//         } else if (cost <= 20000) {
//             discountedPercentage = 10;
//         } else if (cost <= 35000) {
//             discountedPercentage = 15;
//         } else {
//             discountedPercentage = 20;
//         }

//         dis = (cost * discountedPercentage) / 100;
//         amount = cost - dis;

//     }

//     void display() {
//         System.out.println("Name is " + name);
//         System.out.println("mobile no is " + mobileNo);
//         System.out.println("final cost is " + amount);

//     }
// }

// 6.

// interface BankAccount {
//     void deposit(int amount);

//     void withdraw(int withdraw_amount);
// }

// class CheckingAccount implements BankAccount {
//     int amount;
//     int balance;
//     int withdraw_amount;

//     public void deposit(int amount) {

//         balance = amount + balance;
//         System.out.println("The deposited amount :" + balance);

//     }

//     public void withdraw(int withdraw_amount) {
//         if (balance < withdraw_amount) {
//             System.out.println("Insufficent balance");
//         } else {
//             balance = balance - withdraw_amount;
//             System.out.println("The withdraw amount: " + withdraw_amount);
//             System.out.println("The remaining balance : " + balance);
//         }
//     }
// }

// 7.

// class Perimeter{

//     void peri(int s)
//     {
//         System.out.println((4*s) + " is the perimeter of square.");
//     }

//     void peri(int l,int b)
//     {
//         System.out.println((2*(l+b)) + " is perimeter of rectangle.");
//     }

//      void peri(float r)
//     {
//         System.out.println((2*(22/7)*r) + " is perimeter of circle.");
//     }

// }

// 8.

// class Employee {
//     int emp_id;
//     int salary;
//     String name;

//     Employee(int emp_id, int salary, String name) {
//         this.emp_id = emp_id;
//         this.salary = salary;
//         this.name = name;
//     }

//     void display() {
//         System.out
//                 .println("Name is : " + name + "\n" + "Salary is " + salary + "\n" + "Employee id is " + emp_id);
//     }
// }

// 9. 

class circle {
    double radius = 1.0;
    String color = "red";

    double getArea() {
        double area;
        area = 3.14 * radius * radius;
        return area;
    }

    void printRadius() {

        System.out.println("area is " + getArea() + " color is " + color);
    }

}

public class labquestions {
    public static void main(String[] args) {

        // 2.

        // int temp;
        // Average a1 = new Average();
        // a1.getInfo();
        // temp = a1.calculateAverage();
        // System.out.println("average is " + temp);

        // 3.

        // Area a1 = new Area(10, 10);
        // int result = a1.returnArea();
        // System.out.println("Result is " + result);

        // 4.

        // System.out.println("------Doctors Information------");
        // System.out.println();
        // Doctors d1 = new Doctors("Deepak", 10);
        // d1.displayInfo();

        // System.out.println("------Surgeon Info---------");
        // System.out.println();

        // Surgeon s1 = new Surgeon("Tanuj", 20, " Heart");
        // s1.displayInfo();

        // System.out.println("------Nurse info-------");
        // System.out.println();

        // Nurse n1 = new Nurse("Shikha", 30, 100);
        // n1.displayInfo();

        // 5.

        // showRoom s1 = new showRoom();
        // s1.input();
        // s1.calculate();
        // s1.display();

        // 6.

        // CheckingAccount c1 = new CheckingAccount();
        // c1.deposit(50000);
        // c1.withdraw(10000);

        // 7.

        // Perimeter p1 = new Perimeter();
        // p1.peri(10,10);

        // 8.

        // String x;
        // int y, z;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter name:");
        // x = sc.nextLine();
        // System.out.println("enter id ");
        // y = sc.nextInt();
        // System.out.println("Enter salary ");
        // z = sc.nextInt();

        // Employee e1 = new Employee(y, z, x);
        // e1.display();

        circle c1 = new circle();
        // c1.getArea();
        c1.printRadius();

    }
}