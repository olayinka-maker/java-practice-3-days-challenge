import java.util.*;

public class SetPrctice {

    public static void main(String[] args){

        List<Integer>  userids = new ArrayList<>();
        HashSet<Integer> uniqueids = new HashSet<Integer>();
        LinkedHashSet<String> productTags = new LinkedHashSet<String>();
        TreeSet<String>  storeTicker = new TreeSet<String>();


        storeTicker.add("GOOG");
        storeTicker.add("MSFT");
        storeTicker.add("AAPL");
        storeTicker.add("AMZN");
        storeTicker.add("GOOG");

        System.out.println(storeTicker);

        String first = storeTicker.first();
        String second = storeTicker.last();
        System.out.println("first: " + first + "\n" + "second: " + second);




        productTags.add("Electronics");
        productTags.add("sale");
        productTags.add("Gadgets");
        productTags.add("Electronics");
        productTags.add("New");
        productTags.add("sale");

        System.out.println(productTags);
        productTags.remove("Gadgets");
        System.out.println(productTags);





        userids.add(101);
        userids.add(105);
        userids.add(103);
        userids.add(101);
        userids.add(108);
        userids.add(105);
        userids.add(109);

        for(int date : userids){
            uniqueids.add(date);
        }
        System.out.println(uniqueids.size());
        boolean firstNumber = uniqueids.contains(103);
        boolean secondNumber = uniqueids.contains(110);

        System.out.println("firstNumber: " + firstNumber + "\n" + "secondNumber: " + secondNumber);
    }
}
