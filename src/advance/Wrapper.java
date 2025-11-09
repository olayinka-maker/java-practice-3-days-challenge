package advance;

public class Wrapper {

    public static void wappermethod(String str, double num){
        Integer convertedStr = Integer.parseInt(str);
        Double  convertdDb = num;


        System.out.println(convertdDb);
        System.out.println(convertedStr);
    }


    public static void main(String[]  args){
        Wrapper.wappermethod("42",3.14);
    }
}
