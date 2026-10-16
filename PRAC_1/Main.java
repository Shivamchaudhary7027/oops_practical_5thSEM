
// Definition of the Student class
class Student {
    // Instance variables
    int rollNo;
    String name;
    double sub1, sub2, sub3;

    // Parameterized constructor
    public Student(int rollNo, String name, double sub1, double sub2, double sub3) {
        this.rollNo = rollNo;
        this.name = name;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    // Method to calculate total marks
    public double calculateTotal() {
        return sub1 + sub2 + sub3;
    }

    // Method to calculate percentage
    public double calculatePercentage() {
        return (calculateTotal() / 300.0) * 100;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name       : " + name);
        System.out.println("Subject 1  : " + sub1);
        System.out.println("Subject 2  : " + sub2);
        System.out.println("Subject 3  : " + sub3);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.printf("Percentage : %.2f%%\n", calculatePercentage());
        System.out.println("------------------------------------");
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Creating three Student objects
        Student student1 = new Student(101, "Alice Smith", 85.5, 90.0, 78.0);
        Student student2 = new Student(102, "Bob Jones", 72.0, 68.5, 74.0);
        Student student3 = new Student(103, "Charlie Brown", 95.0, 88.0, 91.5);

        // Displaying details for each student object
        System.out.println("--- Student Details ---\n");
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
    }
}
