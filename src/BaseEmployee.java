public class BaseEmployee {

    String name;
    int salary;

    BaseEmployee(){

    }


    public double  calculateBonus(){
          return 0.05*salary;
    };
}
