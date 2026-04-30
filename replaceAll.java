public class replaceAll {
    public static void main(String[] args) {
        String mystr="I love cats. Cats are very easy to love. Cats are very popular ";
        String regex="(?i)cat";
        System.out.println(mystr.replaceAll( regex,"dogs"));
    }
}
