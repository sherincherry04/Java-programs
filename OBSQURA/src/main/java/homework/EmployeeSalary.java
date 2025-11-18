package homework;

public class EmployeeSalary {
	double basicPay,deduction,bonus;
	
 public EmployeeSalary(double basicPay,double deduction,double bonus ){
	 this.basicPay=basicPay;
	 this.deduction=deduction;
	 this.bonus=bonus;
	 
 }
public class SalaryCalc{
	double hra,pfa;
	
 public SalaryCalc(double basicPay) {
	  hra = 0.05*basicPay;
	  pfa = 0.20*basicPay;
			
 }
}

public void TotalSalary() {
	SalaryCalc calc= new SalaryCalc(this.basicPay);
	double totalSalary = basicPay+calc.hra-calc.pfa -  deduction +  bonus;
	System.out.println("Salary slip");
	System.out.println("-------------");
	System.out.println("basic pay : "+ " " +basicPay);
	System.out.println("deduction :"+" "+deduction);
	System.out.println("HRA 5% :"+" "+calc.hra);
	System.out.println("PF 20% :"+ " "+calc.pfa);
	System.out.println("bonus :"+" "+bonus);
	System.out.println("-------------- ");
	System.out.println("Total salary :"+" "+ totalSalary);
}

	public static void main(String[] args) {
		EmployeeSalary emp= new EmployeeSalary(50000,2000,3000);
		emp.TotalSalary();
   
	}

}

