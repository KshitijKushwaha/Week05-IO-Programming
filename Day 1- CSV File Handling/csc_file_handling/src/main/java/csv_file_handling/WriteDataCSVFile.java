import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataCSVFile {
    public static void main(String[] args) {
        String filePath="Employee.csv";
        try(BufferedWriter bw=new BufferedWriter(new FileWriter(filePath));){
            bw.write("101,Alice Williams,Finance,62000\n");
            bw.write("102,Bob Johnson,Sales,58000\n");
            bw.write("103,Charlie Brown,HR,55000\n");
            bw.write("104,David Wilson,IT,70000\n");
            bw.write("105,Emma Davis,Marketing,64000\n");
            System.out.println("CSV file written successfully!");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}