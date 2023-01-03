package JavaPratice;
import java.util.*;
public class Calculator 
{
  Scanner scan = new Scanner(System.in);
	
  public int scanintvalue(String msg) 
	{
		System.out.print(msg);
		int n=scan.nextInt();
		return n;
	}
	
  public char scanoperator(String msg) 
  {
	  System.out.print(msg);
	  char operator = scan.next().charAt(0);
	  return operator;
  }
  
  public void add(int a, int b) 
  {
	 
	  System.out.print("Sum of  " + a + "&" + b +" is " + (a+b));
  }
  
  public void sub(int a, int b) 
  {
	 
	  System.out.print("Sub of  " + a + "&" + b +" is " + (a-b));
  }
  
  
  
  public void Logic()
  {
	  int a= this.scanintvalue("Enter a value");
	  int b = this.scanintvalue("Enter b value");
	  char operator = this.scanoperator("Enter + OR -");
	  
	  if (operator=='+') 
	  {
		  this.add(a, b);
	  }
	  else
	  {
		  this.sub(a, b);
	  }
	  
  }
  
  public static void main(String[] args) 
  {
	  Calculator cal = new Calculator();
	  
	  cal.Logic();
	  
  }
	
}
