import java.util.Scanner;

public class Day2_5 {
	static int findSum(int n)
    {
        int sum = 0;
        for (int x = 1; x <= n; x++)
            sum = sum + x;
        return sum;
    }
 
    // Driver code
    public static void main(String args[])
    {
    	System.out.println("Enter a number :  ");
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findSum(n));
    }

}
