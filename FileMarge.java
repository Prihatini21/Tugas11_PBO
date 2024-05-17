import java.io.*;
/**
 *
 * @author Akmal N.F
 */
public class FileMarge {
    public static void main(String[] args) {
        String[] files = {
            "C:\\Users\\komputer 14\\Documents\\P\\students.csv",
            "C:\\Users\\komputer 14\\Documents\\P\\new_students.csv"
        };
        String mergedFile = "C:\\Users\\komputer 14\\Documents\\P\\merge_students.csv";
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(mergedFile))){
            for (String file : files){
                try (BufferedReader br = new BufferedReader(new FileReader(file))){
                    String line;
                    while ((line = br.readLine()) != null){
                        bw.write(line);
                        bw.newLine();
                    }
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}