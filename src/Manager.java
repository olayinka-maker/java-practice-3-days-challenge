public class Manager extends BaseEmployee {

    Manager(){
        super.name = "Dayo";
        super.salary =10000;
    }

    @Override
    public double calculateBonus() {
        return salary + 0.15*salary;
    }
}
