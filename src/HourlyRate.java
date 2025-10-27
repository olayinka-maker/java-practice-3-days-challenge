 public class HourlyRate extends   PayrollEntry {

     public HourlyRate(String name, double hourlyRate) {
         super(name, hourlyRate);
     }


     @Override
     double calculatePay() {
         return monthlyRate * 160;
     }
 }
