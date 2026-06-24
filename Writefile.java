import java.io.FileWriter;
import java.io.IOException;
public class Writefile {
    public static void main(String[]args){
           try{
            FileWriter writer=new FileWriter("C:\\Users\\tanvi\\OneDrive\\Attachments\\java\\sample.txt");
            writer.write("Hello Today is wednesday and i am going to attend codechef contest at 8:00 pm.This is new content of my file");
            writer.close();
            System.out.println("File written successfully.");
           }catch(IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
           }

    }
}
