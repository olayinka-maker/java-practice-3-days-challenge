package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex4 {

    private static final String SOURCE_FILE = "source.data";
    private static final String DEST_FILE = "destination.data";

    public static void writerFunc(String filePath) {
        try (FileOutputStream writer = new FileOutputStream(filePath)) {
            for (int i = 0; i <= 10; i++) {
                writer.write(i);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void copyFileBytes(String sourcePath, String destPath){

        try(FileOutputStream writer2 = new FileOutputStream(destPath);
            FileInputStream reader = new FileInputStream(sourcePath)){

            int b;
            while ((b = reader.read()) != -1) {
                writer2.write(b);
            }
            System.out.println("File copied successfully.");

        } catch (IOException e){
            System.out.println(e.getMessage());
        }

    }


    public static void main(String[] args) {
  writerFunc(SOURCE_FILE);
  copyFileBytes(SOURCE_FILE,DEST_FILE);

    }
}