class Student {
    String name;
    int roll_no;

    Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    void display() {
        System.out.println("Name is: " + name + "\nRoll no: " + roll_no);
    }
}

public class StudentQues {
    public static void main(String[] args) {
        Student s1 = new Student("John", 2);
        s1.display();
    }

}
