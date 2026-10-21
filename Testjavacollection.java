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
/*import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
class Testjavacollection{
    public static void main(String[] args) {
            ArrayList<Integer> list=new ArrayList<Integer>();
            list.addAll(Arrays.asList(10,20,30,40,50));
        System.out.print(list);
        }
    }*/

/*import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
class Testjavacollection{
    public static void main(String[] args) {
            ArrayList<Integer> list=new ArrayList<Integer>();
            
            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);
            list.add(50);
        System.out.println("First array list " + list);
        ArrayList sec_list=new ArrayList();
        sec_list=(ArrayList)list.clone();
        System.out.println("Second arraylist "+ sec_list);
        }
    }*/

    /*import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
class Testjavacollection{
    public static void main(String[] args) {
            ArrayList<String> list=new ArrayList<String>();
            
            list.add("Hello");
            list.add("I");
            list.add("Tanvi");
            list.add("Tiwari");
            list.add("TIT");
        System.out.println("First array list " + list);
        ArrayList sec_list=new ArrayList();
        sec_list=(ArrayList)list.clone();
        System.out.println("Second arraylist "+ sec_list);
        }
    }*/


import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
class Testjavacollection{
    public static void main(String[] args) {
            ArrayList<Integer> Arrlist=new ArrayList<Integer>();
            
            Arrlist.add(10);
            Arrlist.add(20);
            Arrlist.add(30);
            Arrlist.add(40);
            Arrlist.add(50);
        System.out.println("First array list " + Arrlist);
       Object[] arr=Arrlist.toArray();
       System.out.println("Elements of Arraylist " + "as Array: "+ Arrays.toString(arr));
        }
    }