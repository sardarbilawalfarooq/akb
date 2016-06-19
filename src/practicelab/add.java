package practicelab;

import java.util.Scanner;

public class add {
	/**
	 * this class will add two numbers.\n
	 * @return c
	 * c shows the rezult\n,,,
	 */
	public int addition(int a,int b)
	{
		int c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		a=sc.nextInt();
		System.out.println("enter second number");
		b=sc.nextInt();
		c=a+b;
		System.out.println("result="+c);
		return c;
		
		
		
	}

}
