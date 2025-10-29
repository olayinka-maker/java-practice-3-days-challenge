import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class SetPrctice {

    public static void main(String[] args){

        List<Integer>  userids = new ArrayList<>();
        HashSet<Integer> uniqueids = new HashSet<Integer>();
        LinkedHashSet<String> productTags = new LinkedHashSet<String>();

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
