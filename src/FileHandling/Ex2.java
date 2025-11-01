package FileHandling;

import java.io.*;

public class Ex2 {
    private static final  String myfile = "settings.txt";


    public static void main(String[] args){

        try(BufferedWriter buffText = new BufferedWriter(new FileWriter(myfile))){
            buffText.write("AppName=DataProcessor");
            buffText.newLine();
            buffText.write("Version:1.0.2");
            buffText.newLine();
            buffText.write("LogLevel:INFO");
        }catch(IOException e){
        System.out.println(e.getMessage());

    }

        try(BufferedReader bufferRead = new BufferedReader(new FileReader(myfile))){
            String line;
            while ((line = bufferRead.readLine()) != null) {
                System.out.println("Setting: " + line);
            }        }catch (IOException e){
            System.out.println(e.getMessage());
        }
}
}
