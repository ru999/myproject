package assignments;

public class Typecasting {


	public static void main(String[] args) {
		
		//implicit conversion
		System.out.println("Implicit Type Casting");
		char a='A';
		System.out.println("Value of a: "+a);
		
		int b=a;
		System.out.println("Value of b: "+b);
		
		float c=a;
		System.out.println("Value of c: "+c);
		
		long d=a;
		System.out.println("Value of d: "+d);
		
		double e=a;
		System.out.println("Value of e: "+e);
		
				
		System.out.println("\n");
		
		System.out.println("-------------------------------------Explicit Type Casting------------------------------------------------------------");
		
		//-------------------------------------------------------explicit conversion------------------------------------------------------------------
		
		double x=45.5;
		System.out.println("Value of x: "+x);
		
		int y=(int)x;
		System.out.println("Value of y: "+y);
		
		char o =(char)x;
		System.out.println("value of o"+ o);
				
		long l=(long)x;
		System.out.println("value of l"+ l);
		
		float f=(float)x;
		System.out.println("value of f"+ f);
		
		
	}
}

