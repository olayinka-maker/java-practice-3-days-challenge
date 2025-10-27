public class Employee {

    private int baseSalary;
    private int hourRate;


    public int  calculateWage(int extraHours){
        return  baseSalary + (hourRate * extraHours);
    }

    public void setBaseSalary(int baseSalary) {
        if(baseSalary <= 0){
            throw new IllegalArgumentException("Salary cannot be 0 or less");
        }
        this.baseSalary = baseSalary;
    }

    public void setHourRate(int hourRate) {
        this.hourRate = hourRate;
    }

    public int getHourRate() {
        return hourRate;
    }

    public int getBaseSalary(){
        return baseSalary;
    }
}
