public class Main{
    public static void main(String[] args) {
        String mystr="Hello World";
        int result=mystr.offsetByCodePoints(3, 2);
        System.out.println(result);
    }
}