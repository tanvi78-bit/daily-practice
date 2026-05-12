public class palindromestring{
    public static boolean ispalindrome(String str){
        str=str.toLowerCase();
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!= str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str="Level";
        if(ispalindrome(str)){
            System.out.println("\""+str+"\"is a palindrome.");
        }else{
            System.out.println("\""+str+"\"is not a palindrome.");
        }

    }
}