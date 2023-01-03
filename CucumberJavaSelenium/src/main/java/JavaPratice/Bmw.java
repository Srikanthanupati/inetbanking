package JavaPratice;

public class Bmw extends Car
{
	public void cruise() {
		
		System.out.print("yes, cruise is available");
	}
	public static void main(String[] args) 
	{
		
		Bmw a= new Bmw();
		a.autoparking();
		a.cruise();
	
	}

}
