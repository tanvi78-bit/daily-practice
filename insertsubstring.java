public class insertsubstring {
    public static String insertstring(String originalstring , String stringtobeinserted,int index){
    String newString= new String();
    for(int i=0;i<originalstring.length();i++){
        newString += originalstring.charAt(i);
        if(i==index){
            newString += stringtobeinserted;
        }
    }
    return newString;
    }
    public static void main(String[] args) {
     String originalstring ="We are progarmmer";
     String stringtobeinserted="students";
     int index=6;
     System.out.println("original String:" + originalstring);
     System.out.println("string to be inserted:" + stringtobeinserted);
     System.out.println("string to be inserted at index:" + index);
     System.out.println(" Modified String:" + insertstring(originalstring,stringtobeinserted,index));

    }
}
