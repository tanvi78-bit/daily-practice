import java.io.*;

public class CSVFile {
    public static void main(String[] args) {

        try {
            FileWriter fw = new FileWriter("data.csv");
            fw.write("Name,Age\n");
            fw.write("Tanvi,20\n");
            fw.write("Rahul,21\n");
            fw.close();

            // Read CSV file
            BufferedReader br = new BufferedReader(new FileReader("data.csv"));
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}