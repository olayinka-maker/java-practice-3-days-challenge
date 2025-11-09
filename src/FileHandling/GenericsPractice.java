package FileHandling;



public class GenericsPractice<T> {
    private T item;

    public GenericsPractice(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void displayType() {
        System.out.println("The type of the item in the box is: " + item.getClass().getName());
    }


    public static void main(String[] args){
        GenericsPractice<String> stringBox = new GenericsPractice<>("Hello Generics");
        String myString = stringBox.getItem();
        System.out.println("String Box Value: " + myString);
        stringBox.displayType();

        GenericsPractice<Integer> integerBox = new GenericsPractice<>(42);
        Integer myInt = integerBox.getItem();
        System.out.println("Integer Box Value: " + myInt);
        integerBox.displayType();
    }
}