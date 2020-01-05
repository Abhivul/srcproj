package automationFramework;

public class ST {

	ST() { 
		this(1,2,3);
		
		 
		 System.out.println("Parent def const");
			
		}
	 
ST(int a) {
	
	this(1,2);
		 System.out.println(" Parent 1 const");
			
		}

ST(int a,int b) {	

	this();
	 
	
	 System.out.println("Parent 2 const");
	 
		
	}
ST(int a,int b ,float c) {
	
	 System.out.println(" Parent 3 const");
		
	}
		

	
	//	public static void main(String[] args) {
			// TODO Auto-generated method stub
			
		//	ST p= new ST(1);
	

}