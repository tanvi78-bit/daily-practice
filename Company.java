class Employee {
    String name;
    int employeeId;
    double salary;

    Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Salary        : " + salary);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int employeeId, double salary, String department) {
        super(name, employeeId, salary); // calling parent constructor
        this.department = department;
    }

    void manageTeam() {
        System.out.println(name + " is managing the " + department + " department.");
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int employeeId, double salary, String programmingLanguage) {
        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void writeCode() {
        System.out.println(name + " is coding in " + programmingLanguage + ".");
    }
}

public class Company {
    public static void main(String[] args) {

        Manager m1 = new Manager(
                "Tanvi",
                101,
                85000,
                "HR"
        );

        // Creating Developer Object
        Developer d1 = new Developer(
                "Rahul",
                102,
                70000,
                "Java"
        );

    
        System.out.println("----- Manager Details -----");
        m1.displayDetails();
        m1.manageTeam();

        System.out.println();

        System.out.println("----- Developer Details -----");
        d1.displayDetails();
        d1.writeCode();
    }
}