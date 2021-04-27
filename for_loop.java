import java.util.*;

public class for_loop 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a,b,n : ");
		int a=sc.nextInt();int b=sc.nextInt();int n=sc.nextInt();
		int d=(int)(a+Math.pow(2, 0)*b);
		System.out.print(d+" ");
		for(int i=1;i<n;i++)
		{
			d=(int)(Math.pow(2, i)*b+d);
			System.out.print(d+" ");
		}
	}
}
