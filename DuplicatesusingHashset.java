import java.util.*;
public class DuplicatesusingHashset {
    public static void main(String[] args) {
        int[]arr={1,2,3,1 };
        System.out.println(hasDuplicate(arr));}
        public static boolean hasDuplicate(int[]arr){
            Set<Integer>set=new HashSet<>();
            for(int num: arr){
                if(set.contains(num)){
                    return true;
                }
                set.add(num);
            }
            return false;
    }
    
}
