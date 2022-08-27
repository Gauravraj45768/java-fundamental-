package fundamental;
import java.util.Scanner;
public class evenno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Scanner s=new Scanner(System.in);
//	     System.out.println("enter the natural no ");
//	     int n = s.nextInt();
//	      int d=2;
//	      int sum=0;
//	     while(d<=n) {
//	    	    sum=sum+d;
//	    	 	d=d+2;
//	     }
//	     System.out.println(sum);
		Scanner s=new Scanner(System.in);
	     int n = s.nextInt();
	      int d=2;
       	int sum=0;
	     while(d<=n) {
            if(d%2==0){
	    	 sum=sum+d;
            }
            d=d+1;
	     }
       System.out.println(sum);

	
	}

}
