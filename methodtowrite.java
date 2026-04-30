public class methodtowrite {
    public static void main(String[] args) {
        String mystr="Split a string by spaces, and also punctuation.";
        String regex="[,\\.\\s]";
        String[] myArray = mystr.split(regex);
        for(String also: myArray){
        System.out.println(also);
        }
    }
}
