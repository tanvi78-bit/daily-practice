public class evenlength {
    public static void main(String[] args) {
        String mystr="Hello my name is Tanvi i study in tit and i am from cse branch";
        String[] words=mystr.split(" ");
        for(String word : words){
            if(word.length() %2==0){
                System.out.println(word);
            }
        }
    }
}
