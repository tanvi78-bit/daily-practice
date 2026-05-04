
public class insertanddelete{
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello World");
        sb.insert(6, "Java");
        System.out.println("After Insert:"+sb);
        sb.delete(6,9);
        System.out.println("After delete:"+sb);

    }
}