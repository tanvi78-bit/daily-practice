abstract class Person{
    protected int id;
    protected String name;

    public Person(int id,String name){
        this.id=id;
        this.name=name;
    }

    public String getName(){
        return name;
    }

    abstract void displayDetails();
}

//Interface
interface PlacementStatus{
    void updateStatus(String status);
}

//Student Class
class Student extends Person implements PlacementStatus{

    private String branch;
    private double cgpa;
    private String status;

    public Student(int id, String name, String branch, double cgpa){
        super(id,name);

        if(cgpa<0||cgpa>10){
            throw new IllegalArgumentException("CGPA must be between 0 and 10");
        }

        this.branch = branch;
        this.cgpa = cgpa;
        this.status = "Not Applied";
    }

    public String getBranch(){
        return branch;
    }

    public double getCgpa(){
        return cgpa;
    }

    public String getStatus(){
        return status;
    }

    @Override
    public  void updateStatus(String status){
        this.status = status;
    }

    @Override
    public void displayDetails(){
        System.out.println("Student ID : " + id);
        System.out.println("Student Name : " + name);
        System.out.println("Branch : " + branch);
        System.out.println("CGPA : " + cgpa);
        System.out.println("Placement Status : " + status);
        System.out.println("----------------------------------------------------------");
    }
}

//Company Class
class Company{

    private String companyName;
    private double minCgpa;

    public Company(String companyName, double minCgpa){
        this.companyName = companyName;
        this.minCgpa = minCgpa;
    }

    public String getCompanyName(){
        return companyName;
    }

    public double getMinCgpa(){
        return minCgpa;
    }
}

//Placement Drive class
class PlacementDrive{

    private Company company;

    public PlacementDrive(Company company){
        this.company = company;
    }

    public boolean checkEligility(Student s){
        return s.getCgpa() >= company.getMinCgpa();
    }

    public void scheduleInterview(Student s){

        if(checkEligility(s)){
            System.out.println(
                s.getName() + " is eligible for"
                        + company.getCompanyName());

            s.updateStatus("Interview Schedule");    
        }else{
            System.out.println(
                s.getName() + " is NOT eligible for"
                        + company.getCompanyName());

            s.updateStatus("Rejected");
        }
    }
}

//Placement Cell Class
class PlacementCell{

    //Method Overloading
    public void registerStudent(Student s){
        System.out.println(
                 s.getName() + " Registered Successfully");
    }

    public void registerStudent(Student s,
            String specialization){

        System.out.println(
            s.getName()
                    + " Registered with Speacialization"
                    + specialization);
            }
}

//Main Class
public class Project {

    public static void main(String[] args){

        try{

            Student s1 = new Student(101,
                          "Dheeraj",
                          "CSE",
                          8.5);

            Student s2 = new Student(102,
                          "Aman",
                          "IT",
                          6.8);

            Company company = new Company("TCS",7.0);

            PlacementCell cell = new PlacementCell();

            System.out.println("===== Registration =====");
            cell.registerStudent(s1);
            cell.registerStudent(s2,
                    "Java Full Stack");

            PlacementDrive drive = new PlacementDrive(company);
            
            System.out.println("\n===== Eligibility Check =====");
            drive.scheduleInterview(s1);
            drive.scheduleInterview(s2);

            System.out.println("\n===== Student Details =====");
            s1.displayDetails();
            s2.displayDetails();

            //Runtime Polymorphism
            System.out.println("\n===== Runtime Polymorphism======");

            Person p = new Student(103,
                          "rahul",
                          "CSE",
                           9.2);

            p.displayDetails();

       } catch(Exception e){
        System.out.println("Error:" + e.getMessage());
    }
    }
}
