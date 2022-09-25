import java.util.Scanner;

public class Digittoword {
	static void printValue(char digit)
	{
		switch (digit)
		{
		case '0' :
			System.out.println(" Zero ");
			break;
		case '1' :
			System.out.println(" One ");
			break;
		case '2' :
			System.out.println(" Two ");
			break;
		case '3' :
			System.out.println(" Three ");
			break;
		case '4' :
			System.out.println(" Four ");
			break;
		case '5' :
			System.out.println(" Five ");
			break;
		case '6' :
			System.out.println(" Six ");
			break;
		case '7' :
			System.out.println(" Seven ");
			break;
		case '8' :
			System.out.println(" Eight ");
			break;
		case '9' :
			System.out.println(" Nine ");
			break;
		default :
			System.out.println("Please  enter a single number. ");
		}
	}
	static void printWord(String N)
	{
		int i, length = N.length();
		for(i=0; i<length; i++)
		{
			printValue(N.charAt(i));
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter a digit number for word conversion : ");
		try (Scanner m = new Scanner(System.in)) {
			String N = m.next();
			printWord(N);
		}
	}

}
