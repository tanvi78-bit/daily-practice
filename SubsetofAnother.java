import java.util.HashSet;
public class SubsetofAnother {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);

boolean isSubset = set1.containsAll(set2);

        System.out.println("set2 is subset of set1: " + isSubset);
    }
}