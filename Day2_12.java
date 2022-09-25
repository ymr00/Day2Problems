

import java.util.Scanner;



public class Day2_12 {
public static void main(String[] args) {
	System.out.println("Quadratic Equation = a*x*x + b*x + c");
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the value of a = ");
	int a = sc.nextInt();
	System.out.println("enter the value of b = ");
	int b = sc.nextInt();
	System.out.println("enter the value of c = ");
	int c = sc.nextInt();
	System.out.println(a+"*x*x + " + b + "*x + " +c);
	System.out.println("find the roots");
	int delta = b*b - 4*a*c;
	int root1 = (int) ((-b + Math.sqrt(delta))/(2*a));
	int root2 = (int) ((-b - Math.sqrt(delta))/(2*a));
	System.out.println("Root1 of X = " + root1);
	System.out.println("Root2 of X = " + root2);
	
			}

}