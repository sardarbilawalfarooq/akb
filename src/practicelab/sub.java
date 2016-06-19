package practicelab;

import java.util.Scanner;
/**
 * 
 * @author DeeByte Computers
 *
 */
public class sub {
	/**
	 * this class subtraction of two numbers.\n
	 * @return
	 */
	 public int subtraction ()
	
	 {
		 int a,b,c;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter first number");
			a=sc.nextInt();
			System.out.println("enter second number");
			b=sc.nextInt();
			c=a-b;
			System.out.println("result="+c);
			return c;
		 
	 }

}
