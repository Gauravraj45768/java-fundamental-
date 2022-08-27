package fundamental;
import java.util.Scanner;
public class checkAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//The syntax of the code is correct but on execution dividing a number by zero gives a run time error.

	Scanner s = new Scanner(System.in);
        char ch = s.next().charAt(0);
        if(ch>64 && ch<97){
            System.out.print(1);
        }else if(ch>96 && ch<114){
            System.out.print(0);
        }else{
            System.out.print(-1);
        }
        
    }
}