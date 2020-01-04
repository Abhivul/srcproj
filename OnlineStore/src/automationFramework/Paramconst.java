package automationFramework;

public class Paramconst {

	 Paramconst() {
		 this(10);
		 
		 
		 System.out.println("def const");
			
		}
	 
 Paramconst(int a) {
	 this(1,2,30f);
		 
		 System.out.println("1 const");
			
		}
 
 Paramconst(int a,int b) {
	 this(10,2,3f,40);
	 
	 
	 System.out.println("2 const");
	 
		
	}
Paramconst(int a,int b ,float c) {
	
	
	
	 
	 System.out.println("3 const");
		
	}
		
Paramconst(int a,int b ,float c, int s) {
	
	this();
	 
	 System.out.println("4 const");
		
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Paramconst p= new Paramconst(1,2);
	}

}
