import java.util.*;
import java.util.regex.*;
public class password {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine();
        String regex="^(?=.*[a-z](?=.*[A-Z](?=.*[0-9](?=.*[@#%&?]).{10,}$)";

            if (Pattern.matches(regex, s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
    }

