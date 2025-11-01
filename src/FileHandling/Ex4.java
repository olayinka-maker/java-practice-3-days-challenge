package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex4 {

    public static void writerFunc() {
        try (FileOutputStream writer = new FileOutputStream("source.data")) {
            for (int i = 0; i <= 10; i++) {
                writer.write(i);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void copyFileBytes(String sourcePath, String destPath){

    }


    public static void main(String[] args) {


    }
}