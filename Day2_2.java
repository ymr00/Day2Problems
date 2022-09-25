import java.util.Scanner;

public class Day2_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int thousand=0;
		int hundreds=0;
		int tens =0;
		int ones =0;
		
		System.out.println("Enter a 4 digit number :");
		int number = input.nextInt();
		if(number<=9999 && number>999)
		{
		thousand = number/1000;
		System.out.printf("\nThousands place digit : " + thousand);
		hundreds = (number/100)%10;
		System.out.printf("Hundreds place digit : ", + hundreds);
		tens = (number/10)%10;
		System.out.printf("\nTens place digit : ",tens);
		ones = (number%10);
		System.out.printf("\nOnes place digit : " ,ones);
		}
		else
		{
		if(number>9999);
		System.out.println("\nError! Number more then 3 digits. ");
		if(number<1000);
		System.out.println("Error! Number less then 3 digits.");
		}
	}

}
