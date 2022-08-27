package fundamental;
import java.util.Scanner;
public class sumofevenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int sumEven=0;int sumOdd=0;
		while(n>0) {
			if(n%2==0) {
				sumEven+=n%10;
				n=n/10;
			}else {
				sumOdd+=n%10;
				n=n/10;
			}
		}
		System.out.println(sumEven + " " +sumOdd);
	}

}
