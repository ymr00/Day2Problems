import java.util.Scanner;

public class Day2_6 {
	static int reverse=0;
	public static void main(String[] args) {
		System.out.println("Enter a number for reverse : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(;num != 0; num /= 10) {
		      int digit = num % 10;
		      reverse = reverse * 10 + digit;
		    }

		    System.out.println("Reversed Number: " + reverse);
	}

}
