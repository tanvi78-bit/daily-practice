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


/*import java.util.*;
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
    }*/

import java.util.ArrayList;
class Testjavacollection{
    public static void main(String[] args) {
            ArrayList<Object> arr=new ArrayList<Object>();
            arr.add("Java is a platform");
            arr.add(14);
            arr.add(1800L);
            arr.add(6.0D);
            arr.add(1.99F);
        System.out.println("Array list after insertion: ");
        display(arr);
      arr.set(0,50);
      arr.set(1,10.0D);
       System.out.print("Arraylist  after modification: ");
       display(arr);
        }
        public static void display(ArrayList <Object> arr){
            for(int i=0;i<arr.size();i++){
                System.out.print(arr.get(i)+" ");
            }
            System.out.println();
        }
    }