abstract public class PayrollEntry {

    String employeeName;
    double monthlyRate;


   PayrollEntry(String name, double rate){
       this.employeeName=name;
       this.monthlyRate = rate;
   }


    abstract double calculatePay();
    public void   displayRate(){
        System.out.println(employeeName + "'s monthly rate is: $" + monthlyRate);
    };
}
