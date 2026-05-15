public class parameterized{
    String Name;
    int id;
    double Salary;
    String Designation;

    parameterized(String Name,int id,float Salary,String Designation){
        this.Name=Name;
        this.id=id;
        this.Salary=Salary;
        this.Designation=Designation;

    }
    void display(){
        System.out.println("First TCS employee: "+Name +", id is:"+id +" ,Salary is: "+Salary +" ,Designation: "+Designation);
    }
   
    public static void main(String[] args) {
        parameterized emp1=new parameterized("sweta", 68, 60000, "Manager");
        emp1.display();
        parameterized emp2=new parameterized("nikhil", 50, 80000, "CEO");
       emp2.display();
    }

}
