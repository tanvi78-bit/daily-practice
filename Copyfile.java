import java.io.IOException;
import java.nio.file.*;
public class Copyfile {
    public static void main(String[] args) {
        try{
            Path source=Paths.get("C:\\Users\\tanvi\\OneDrive\\Attachments\\java\\sample.txt");
            Path destination= Paths.get("copy_sample.txt");
            Files.copy(source,destination,StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully");
        }catch(IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
