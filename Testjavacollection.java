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

/*import java.util.ArrayList;
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
    }*/

/*import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class Testjavacollection{
    public static void main(String[] args) {
            ArrayList<String> names =new ArrayList<>(Arrays.asList("abs","gfh","hfgh","ygf","hfhfh"));
            System.out.println("Original List: " + names);
            //create sublist from index 1 to 4(4 execluded)
        List<String>sub=names.subList(1,4);
        System.out.println("Sub List: "+sub);
        }
    }*/
 /*import java.util.*;
class Testjavacollection{
    public static void main(String[] args) {
            ArrayList<String> al =new ArrayList<String>();
            al.add("Mango");
            al.add("Apple");
            al.add("Banana");
            al.add("Grapes");
            //accessing the element
        System.out.println("Returning Element: "+al.get(1));
        //changing the element
        al.set(1,"Dates");
        for(String fruit:al){
            //Traversing List
            System.out.println(fruit);
        }  
    }
}*/

/*import java.util.*;
class Testjavacollection{
    public static void main(String[] args) {
        //Creating a list
        List<String> list1=new ArrayList<String>();
        list1.add("Mango");  list1.add("Apple");  list1.add("Banana");  list1.add("Grapes");  list1.add("Guava"); 
        //sorting the list
        Collections.sort(list1);
        //Traversing the list
        for(String Fruit: list1){
            System.out.println(Fruit);
        }
            List<Integer> list2 =new Ar

    }
}*/

/*import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class Testjavacollection{
    public static void main(String[] args) {
            ArrayList<Integer> list =new ArrayList<>(Arrays.asList(10,20,30,40,50));
            System.out.println("Original List: " + list);
            //1.remove() method
            list.remove(Integer.valueOf(30));
            System.out.println("After remove(): " + list);
            // 2. remove All
            List<Integer>numbers=Arrays.asList(10,50);
            list.removeAll(numbers);
            System.out.println("After remove all() : "+ list);
        //clear all
        list.clear();
        System.out.println("After clear(): "+ list);
        System.out.println("Is list empty?:"+ listis)
        }
    }*/


    /*import java.util.*;
    public class Testjavacollection{
        public static void main(String[] args) {
            ArrayList<Integer>Numbers=new ArrayList<Integer>();
            Numbers.add(23);
            Numbers.add(32);
            Numbers.add(45);
            Numbers.add(63);
            Numbers.removeIf(n -> (n%3==0));
            for(int i : Numbers){
                System.out.println(i);
            }
 
        }
    }*/

       import java.util.*;

public class Testjavacollection {
    public static void main(String[] args) {
        ArrayList<String> Names = new ArrayList<String>();

        Names.add("Tanvi");
        Names.add("Sneha");
        Names.add("Swati");
        Names.add("Nikki");

        Names.removeIf(name -> name.startsWith("S"));

        for (String i : Names) {
            System.out.println(i);
        }
    }
}

