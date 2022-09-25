
import java.util.Scanner;

public class Day2_11 {
	
public static void main(String[] args) {
	Scanner scanobj =new Scanner(System.in);
	System.out.println("Enter the month (1 - 12) " );
	int m = scanobj.nextInt();
	System.out.println("Enter the day(1 - 31) " );
	int d = scanobj.nextInt();
	boolean season = false;
	
	if(d <= 31 && m <=12) {
		if ((m == 3 && d >=20 && d<=31)||(m == 4 && d >=1 && d<=30)||(m == 5 && d >=1 && d<=31)||(m==6 && d <=20 && d>=1)){
			season =true;
		}
		else 
			season = false;
	
	
	 if (season ==true)
		 System.out.println(" yes its a Spring season");
	 else
		 System.out.println("Not a Spring season");
	}
	 else 
			System.out.println("invalid date & month ");
			
	
}
}