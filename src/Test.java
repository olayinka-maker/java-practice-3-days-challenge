public class Test {


    public static void main(String[] args){

        String strInt = String.valueOf(121);
        String reversed = new StringBuilder(strInt).reverse().toString();
        System.out.println("\nReversed (as string): " + reversed);

        if( reversed.equals(strInt)){
            System.out.println("palindrome");
        }
    }
}
