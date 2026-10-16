/*import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
class Testjavacollection{
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("Ravi");
        list.add("vijay");
        list.add("Ramesh");
        list.add("kamlesh");
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}*/
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
class Testjavacollection{
    public static void main(String[] args) {
            ArrayList<Integer> list=new ArrayList<Integer>();
            list.addAll(Arrays.asList(10,20,30,40,50));
        System.out.print(list);
        }
    }
