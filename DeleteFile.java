import java.io.File;
public class DeleteFile {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\tanvi\\OneDrive\\Attachments\\java\\copy_sample.txt");
        if(file.delete()){
            System.out.println("file delete");
        }else{
            System.out.println("failed to delete");
        }
    }
}
