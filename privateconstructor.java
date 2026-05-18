public class privateconstructor {
    private privateconstructor(){
        System.out.print("Private constructor called: ");
    }
    void display(){
        System.out.println("Hello java");
    }
    public static void main(String[] args) {
        privateconstructor obj=new privateconstructor();
        obj.display();
    }
}
