import java.util.Scanner;

public class Day2_3 {
	 
	public static void main(String[] args)   
	{     
	int num, i=1, sum = 0;    
	Scanner sc = new Scanner(System.in);  
	System.out.print("Enter a number : ");  
	num = sc.nextInt();  
	while(i <= num)  
	{  
	sum = sum + i;   
	i++;  
	}  
	System.out.println("Sum of Natural Numbers = " + sum);  
	}  
	}   