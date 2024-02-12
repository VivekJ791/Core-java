package TryWithResource;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceBuffer {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader br=null;
        try {
            String line="";
            br= new BufferedReader(new FileReader("practice/src/conceptClearingExamples/text.txt"));
            while ((line = br.readLine()) != null) {
                System.out.printf(line);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Entering finally block");
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("IOException in finally block =>"+e.getMessage());
            }
        }
    }

}