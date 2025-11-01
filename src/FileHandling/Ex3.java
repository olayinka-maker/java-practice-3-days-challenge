package FileHandling;

import java.io.File;
import java.io.IOException;

public class Ex3 {
    private static final String report = "temp_report.log";

    public static void  deleteFileIfPresent(String filepath){
        File checkFile = new File(filepath);
        if(checkFile.exists()){
            checkFile.delete();
            System.out.println("Successfully deleted: "+ checkFile.getName());
        }
    }


    public static void createTempFile(String filepath){
        File checkFile = new File(filepath);
        try{
            if (checkFile.createNewFile()) {
                System.out.println("File created: " + checkFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }




    public static void main(String[] args){
        createTempFile(report);

        deleteFileIfPresent(report);

        System.out.println("\n--- Second Deletion Attempt ---");
        deleteFileIfPresent(report);
    }


}
