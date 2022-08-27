package fundamental;
import java.util.Scanner;
public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s=new Scanner(System.in);
      int d=2;
     System.out.println("enter the no ");
     int n = s.nextInt();
     while(d<=n-1) {
    	 if(n%d==0) {
    		 System.out.println("not prime");
    		 return;
    	 }
    	 d=d+1;
     }
     System.out.println(" prime");
	}

}
