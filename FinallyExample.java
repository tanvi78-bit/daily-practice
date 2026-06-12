public class FinallyExample {
    public static void main(String[] args) {
        int[] numbers={1,2,3};
        try{
            //This will show the ArrayIndexOutOfBounds Exception
            System.out.println(numbers[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception caught: " + e);
        }finally{
            System.out.println("This block always executes.");
        }
        System.out.println("program continues");
    }
}
