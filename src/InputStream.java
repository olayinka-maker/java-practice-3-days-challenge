import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStream {
    
    public static void main(String[] args){

        try(FileInputStream input = new FileInputStream("AuT.jpeg");
            FileOutputStream output = new FileOutputStream("test.jpeg");){

            int i;

            while ((i = input.read()) != -1){
                  output.write(i);
            }
            System.out.println("File copied successfully.");
        }catch(IOException e) {
            System.out.println("Error handling file.");
        }
    }
}
