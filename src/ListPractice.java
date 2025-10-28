
import java.util.*;

public class ListPractice {

    public static void main(String[] args){
        List<String> students = new ArrayList<>();

        students.add("Lummy");
        students.add("Sarah");
        students.add("Tolu");
        students.add("Foluso");

        System.out.println("Original list: " + students);
        System.out.println("Size: " + students.size());


        // GETTING ELEMENTS - get(index)
        String firstStudent = students.get(0);
        String thirdStudent = students.get(2);

        System.out.println("First student (index 0): " + firstStudent);
        System.out.println("Third student (index 2): " + thirdStudent);


        // CHECKING IF LIST CONTAINS AN ELEMENT
        boolean hasJohn = students.contains("John");
        boolean hasEmma = students.contains("Emma");

        System.out.println("Contains 'John'? " + hasJohn);
        System.out.println("Contains 'Emma'? " + hasEmma);

        // ITERATING THROUGH A LIST
        for (String student : students) {
            System.out.println(student);
        }

        // Use this when you need the index
        for (int i = 0; i < students.size(); i++) {
            System.out.println(i + ": " + students.get(i));
        }

        System.out.println("\n=== ITERATION METHOD 3: ITERATOR ===");

        Iterator<String> iterator = students.iterator();
        while (iterator.hasNext()) {
            String student = iterator.next();
            System.out.println(student);
        }


    }
}
