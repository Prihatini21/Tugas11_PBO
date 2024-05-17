import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author Akmal N.F
 */
public class CSVReader {
    public static void main(String[] args) {
        String csvFile = "C:\\Users\\komputer 14\\Documents\\P\\students.csv";
        String line;
        String csvSplitBy = ",";
        int index = 0;
        System.out.println("NIM, NAMA, UMUR, PRODI");
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))){
            while ((line = br.readLine()) != null){
                index++;
                if(index>0){
                    String[] Student = line.split(csvSplitBy);
                    System.out.println(Student[0]+", "+Student[1]+", "+Student[2]+", "+Student[3]);
                }
            } System.out.println("\nJumlah Baris = "+index);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}