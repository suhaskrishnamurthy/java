import java.util.*;
public class Main
{
	public static void main(String args[]) {
		int a=0,b=1,c;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=in.nextInt();
		System.out.println("The Fibonacci series are");
		for(int i=0;i<n;i++)
		{
		    System.out.println(a);
		    c=a+b;
		    a=b;b=c;
		}
		
	}
}