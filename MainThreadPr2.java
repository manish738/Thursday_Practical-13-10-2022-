   		/*	Q2	Write a JAVA program which will generate the threads:

		- To display 10 terms of Fibonacci series.
		- To display 1 to 10 in reverse order.*/

import java.util.Scanner;

class FibonacciSeries extends Thread
{
     public void run()
     {
               int a=0, b=1, c=0;
               Scanner sc=new Scanner(System.in);
               System.out.print("Enter the Limit for fabonacci: ");

               int n = sc.nextInt();
               System.out.println("Fibonacci series:");
               
               		while (n>0)
               		{
               			System.out.print(c+" ");
               			a=b;
               			b=c;
               			c=a+b;
               			n=n-1;
               		}  
     }
}

class Reverse extends Thread
{
     public void run()
     {
    	 		System.out.println("\n --------------------------------------------------------");
		    	 System.out.println("\n Before reverse is:");

		    	 for (int i=1; i <= 10 ;i++ )
		         {
		              System.out.print(i+"  ");
		         }
		          
               System.out.println("\n After Reverse is: ");
               
               for (int i=10; i >= 1 ;i-- )
               {
                    System.out.print(i+"  ");
               }
     }
}
public class MainThreadPr2 
{
	public static void main(String[] args)
    {
         try                                                        //exception handling for sleep() method
         {
              FibonacciSeries fib = new FibonacciSeries();
              fib.start();
              fib.sleep(9000);
              Reverse rev = new Reverse();
              rev.start();
         }
         catch (Exception ex)
         {
              ex.printStackTrace();
         }
    }

}
