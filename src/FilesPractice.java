import java.io.File;
import java.io.FileWriter;
import  java.io.IOException;


public class FilesPractice {
    public static void main(String[]  args){

        try( FileWriter myWriter = new FileWriter("filename2.txt",true)){
            System.out.println("/append new text");
            myWriter.write("starting of a  new Files in Java might be tricky, but it is fun enough!");
            System.out.println("Successfully appended  to the file.");
        }catch(IOException e){
            System.out.println(e.getMessage());
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
