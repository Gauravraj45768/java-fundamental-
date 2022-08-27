package fundamental;
import java.util.Scanner;
import java.lang.Math;
public class totalsalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int basicSalary = s.nextInt();
		char grade = s.next().charAt(0);
		if( (basicSalary >= 0) && (basicSalary <= 7500000)){
		double  hra = basicSalary * 0.20;
		double da = basicSalary * 0.50;
		double pf = basicSalary * 0.11;
		int allow;
		if(grade=='A') {
			 allow = 1700;
		}else if (grade=='B') {
			 allow = 1500;
		}else {
			allow = 1300;
		}
		//if( basicSalary >=0 && basicSalary <= 7,500,000)
		double totalSalary =basicSalary + hra + da + allow - pf;
		
		System.out.println(Math.round(totalSalary));
		}
	}
}
