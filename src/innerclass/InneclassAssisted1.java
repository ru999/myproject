package innerclass;

public class InneclassAssisted1 {


	 private String msg="Welcome to Java"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
	 }  


	public static void main(String[] args) {

		InneclassAssisted1 obj=new InneclassAssisted1();
		InneclassAssisted1.Inner in=obj.new Inner();  
		in.hello();  
	}
}




