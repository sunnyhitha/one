/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,b,c=0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>=b)
		{
			c=a-b;
		}
		else if(a<=b)
		{
			c=b-a;
		}
		if(c%2==0)
		{
			System.out.print("even");
		}
		else
		{
			System.out.print("odd");
		}// your code goes here
	}
}
