
 import java.util.Scanner;

public class Day2_10 {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the first number = ");
			int a = sc.nextInt();
			System.out.print("Enter the second number = ");
			int b = sc.nextInt();
			System.out.print("Enter the third number = ");
			int c = sc.nextInt();
			System.out.println("number are a = " +a + " b =" +b + " c = " +c);
			int fun1 ,fun2,fun3,fun4;
			fun1 = a+b*c;
			fun2 = c+a/b;
			fun3 = a%b+c;
			fun4 = a*b+c;
			System.out.println("function values fun1 = " + fun1 + "\n fun2= " + fun2 + "\n fun3= " + fun3 + "\n fun4= " + fun4 );
			System.out.println("find max");
			if (fun1 > fun2 && fun1 > fun3 && fun1 >fun4) {
				
				System.out.println(" maximum arithmetic operation is fun1 " +fun1);
				}
				else if(fun2 > fun1 && fun2 > fun3 && fun2 >fun4) {
					System.out.println(" maximum arithmetic operation is fun2 " +fun2);
				}
				else if(fun3 > fun1 && fun3 > fun2 && fun3 >fun4) {
					System.out.println(" maximum arithmetic operation is fun3 " +fun3);
				}
				else
					System.out.println(" maximum arithmetic operation is fun4 " +fun4);
			
			System.out.println("find min");
			
			if (fun1 < fun2 && fun1 < fun3 && fun1 <fun4) {
				
				System.out.println(" minimum arithmetic operation is fun1 " +fun1);
				}
			
				else if(fun2 < fun1 && fun2 < fun3 && fun2 <fun4) {
					System.out.println(" minimum arithmetic operation is fun2 " +fun2);
				}
				else if(fun3 < fun1 && fun3 < fun2 && fun3 < fun4) {
					System.out.println(" minimum arithmetic operation is fun3 " +fun3);
				}
				else
					System.out.println(" minimum arithmetic operation is fun4 " +fun4);
			}
					
			}
		
		

