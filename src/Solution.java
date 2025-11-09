import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<String>  names = Arrays.asList("yinka","bola","sade");
        List<Integer> mydata = Arrays.asList(5, 3, 2, 3, 5, 1);

        List<Integer> sortedUnique = mydata.stream().distinct().sorted().collect(Collectors.toList());



        int squrNumbr = numbers.stream()
                .filter(n-> n>3)
                .map(n -> n*n)
                .reduce(0, Integer::sum);




        List<String>  uppercase = names.stream()
                .map(String::toUpperCase).collect(Collectors.toList());

        List<String>  newNames = Arrays.asList("Ada", "Alex", "Tobi", "Amaka");

        List<String>  startsWithA = newNames.stream().
                filter(data -> data.startsWith("A")).map(String::toUpperCase)
                .collect(Collectors.toList());

        List<Integer> even = numbers.stream()
                                 .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(sortedUnique);

    }
}