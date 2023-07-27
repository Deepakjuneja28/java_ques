
class Doctors {
    String name;
    int experience;

    Doctors(String name, int experience) {
        this.experience = experience;
        this.name = name;
    }

    void displayInfo() {
        System.out.println("Name  is " + name + " and Experience of " + experience);
    }
}

// multilevel inheritance

class Surgeon extends Doctors {
    String Specialization;

    Surgeon(String name, int experience, String Specialization) {
        super(name, experience);
        this.Specialization = Specialization;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Specialization:" + Specialization);
    }

}
// herarichle inheritance

class Nurse extends Doctors {
    int noOfPatients;

    Nurse(String name, int experience, int noOfPatients) {
        super(name, experience);
        this.noOfPatients = noOfPatients;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("number of patients" + noOfPatients);
    }
}

public class inheritanceQues {
    public static void main(String[] args) {
        System.out.println("------Doctors Information------");
        System.out.println();
        Doctors d1 = new Doctors("Deepak", 10);
        d1.displayInfo();
        System.out.println();

        System.out.println("------Surgeon Info---------");
        System.out.println();
        Surgeon s1 = new Surgeon("Tanuj", 20, " Heart");
        s1.displayInfo();
        System.out.println();

        System.out.println("------Nurse info-------");
        System.out.println();
        Nurse n1 = new Nurse("Shikha", 30, 100);
        n1.displayInfo();
    }
}
