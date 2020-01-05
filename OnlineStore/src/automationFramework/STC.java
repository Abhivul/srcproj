package automationFramework;

public class STC extends ST {

	STC() { 
		this(1,1);
	
		 
		 System.out.println("Child def const");
			
		}
	 
STC(int a) {
	this(1,1,1);
	
		 System.out.println(" Child 1 const");
			
		}

STC(int a,int b) {	 
	 super(1);
	
	 System.out.println("Child 2 const");
	 
		
	}
STC(int a,int b ,float c) {
	this();
	
	 System.out.println(" Child 3 const");
		
	}
		
public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	STC p= new STC(1);
}


}
