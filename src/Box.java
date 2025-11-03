public class Box<T> {

    T value;


    public static <T> void printArray(T[] array){
        for(T item : array){
            System.out.println(item);
        }
    }


    public void setValue(T value) {
        this.value = value;
    }

     T getValue() {
        return value;
    }
    public static void main(String[] args){

        String[] names = {"john","Doe"};
        Integer[] nums = {10,20,30,40};

        Box<String> testStr = new Box<>();
        Box<Integer> testInt = new Box<>();

        testStr.setValue("olumide");
        System.out.println( testStr.getValue());


        testInt.setValue(10);
        System.out.println(testInt.getValue());

       printArray(names);
       printArray(nums);


    }
}
