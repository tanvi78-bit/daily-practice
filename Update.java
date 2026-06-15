import java.io.FileWriter;
import java.io.IOException;

public class Update{
    public static void main(String[] args) {
        try{
            FileWriter writer= new FileWriter("C:\\Users\\tanvi\\OneDrive\\Attachments\\java\\sample.txt" ,true);
            writer.write("\nHello I am Tanvi Tiwari.\n I am currently doing btech From technocrats Institute of Technology .\n I am in Second Year and from computer Science Branch.\n");
            writer.close();
            System.out.println("Content appended Successfully");
        }catch(IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}