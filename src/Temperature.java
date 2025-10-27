public class Temperature {


    private double temp;
    private static  final double ABSOLUTE_ZERO = -273.15;


    public void setCelsius(double  temp) {
        if(temp  < ABSOLUTE_ZERO){
            System.out.println("wrong temp");
        }else {
            this.temp = temp;
        }
    }

    public double getTemp() {
        return temp;
    }

    public void getFahrenheit(){
        double result =  (temp*9/5)+32;
        System.out.println(result);
    }



}
