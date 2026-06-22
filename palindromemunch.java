public class palindromemunch {
    public static boolean ispalindrome(int n){
        int original=n;
        int rev=0;
        while(n!=0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        return original==rev;
    }
    public static void main(String[] args) {
        int num1=121;
        int num2=123;
        System.out.println(num1 + " is palindrome ? :" + ispalindrome(num1));
        System.out.println(num2 + " is palindrome ? :" + ispalindrome(num2));
    }
}
