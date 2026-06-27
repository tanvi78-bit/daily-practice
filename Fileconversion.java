 import java.io.*;
public class Fileconversion {
    public static void main(String[] args) {
        try {
            // Step 1: Create TXT file
            FileWriter txtWriter = new FileWriter("student.txt");
            txtWriter.write("Name Age City\n");
            txtWriter.write("Tanvi 20 Bhopal\n");
            txtWriter.write("Rahul 21 Indore\n");
            txtWriter.write("Aman 22 Delhi\n");
            txtWriter.close();
            System.out.println("TXT file created successfully.");

            // Step 2: Convert TXT to CSV
            BufferedReader br = new BufferedReader(new FileReader("student.txt"));
            FileWriter csvWriter = new FileWriter("student.csv");

            String line;
            while ((line = br.readLine()) != null) {
                csvWriter.write(line.replace(" ", ","));
                csvWriter.write("\n");
            }

            br.close();
            csvWriter.close();
            System.out.println("CSV file created successfully.");

            // Step 3: Convert CSV to XLS
            br = new BufferedReader(new FileReader("student.csv"));
            FileWriter xlsWriter = new FileWriter("student.xls");

            while ((line = br.readLine()) != null) {
                xlsWriter.write(line.replace(",", "\t"));
                xlsWriter.write("\n");
            }

            br.close();
            xlsWriter.close();
            System.out.println("XLS file created successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

