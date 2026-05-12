public class allmethods {
    public static void main(String[] args) {
        String mystr="Hello, my name is Tanvi";
        byte[] bytes=mystr.getBytes();
        System.out.println("get bytes: ");
        for (byte b: bytes){
            System.out.print(b+" ");
        }
        System.out.println();
        System.out.println("hashcode: "+mystr.hashCode());
        System.out.println("tostring : "+mystr.toString());

    }
}
