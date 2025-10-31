package FileHandling;

import java.io.*;

public class Exercise1 {

   public static void main(String[] args){
       try(BufferedWriter source = new BufferedWriter(new FileWriter("source.txt"))){
           source.write("Hello, Java File Handling is fun!");
           source.newLine();
           source.write("This is the second line of text.");

       } catch (IOException e){
           System.out.println(e.getMessage());
       }

       try(
           FileInputStream readSource = new FileInputStream("source.txt");){
           BufferedReader  readSourceWithBuffer = new BufferedReader( new FileReader("source.txt"));


           int lineCount = 0;
           int i;
           String data;

           while((data = readSourceWithBuffer.readLine()) != null){
               System.out.println(data);

           }


           while( (i = readSource.read()) != -1){
               System.out.println((char) i);
               lineCount++;
           }
           System.out.println("Total number of lines in the file: " + lineCount);

           System.out.println("Successfully wrote to the file.");
       }catch(IOException e){
           System.out.println(e.getMessage());
       }
   }
}
