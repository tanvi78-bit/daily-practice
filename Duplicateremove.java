/*public class Duplicateremove {
    public static void main(String[] args) {

        String str = "programming";
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (result.indexOf(ch) == -1) {
                result = result + ch;
            }
        }

        System.out.println("Original String: " + str);
        System.out.println("After Removing Duplicates: " + result);
    }
}*/

//or

import java.util.Scanner;
public class Duplicateremove{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str=sc.nextLine();
        String result="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(result.indexOf(ch)==-1){
            result=result + ch;
            }
        }
        System.out.println("String after removing duplicates: "+ result);
        sc.close();
    }
}
