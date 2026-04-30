import java.util.Scanner;
class nptel {
    private String name;
private int age;
public nptel(String name, int age){
    this.name=name;
    this.age=age;
}
public String getname(){
    return name;
}
public int getage(){
    return age;
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String name=sc.next();
    int age=sc.nextInt();
    nptel obj= new nptel(name , age);
System.out.print("Name is" + obj.getname() + " age is" + obj.getage() );
sc.close();
}
}
