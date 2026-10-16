// Base Superclass
class Person {
    String name;
    int age;

    public Person(String name  , int age) {
        this.name = name;
        this.age = age;
    }

    void introduce() {
        System.out.println("Hi, my name is " + name + ".");
        System.out.println("I am " + age + " years old.");
    }
}
// Intermediate Subclass
class Employee extends Person {
    String Emp_id;
    double salary;

    public Employee(String name, int age ,double salary , String emp_id)  {
        super(name , age); // Call Person constructor
        this.Emp_id = emp_id;
        this.salary = salary;
    }
    void work() {
        System.out.println(name + " is working and earns $" + salary + ".");
        System.out.println(name + "employee id is " + Emp_id + ".");
    }
}
// Derived Subclass from Employee
class Manager extends Employee {
    String department;
    String MngID;

    public Manager(String name,int age , String emp_id ,  double salary, String department , String managerID) {
        super( name , age , salary , emp_id ); // Call Employee constructor
        this.department = department;
        this.MngID = managerID;
    }

    void manageTeam() {
        
        System.out.println(name + " is managing the " + department + " department.");
        System.out.println(name + "manager id is " + MngID + ".");
    }
}

// Main class to test Multilevel Inheritance
public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Manager mgr = new Manager("YASH",22 , "emp_001"  ,
        85000, "Engineering" , "emp_001");

        mgr.introduce();  // Inherited from Person (top of chain)
        mgr.work();       // Inherited from Employee (middle of chain)
        mgr.manageTeam(); // Defined in Manager (bottom of chain)
    }
}

