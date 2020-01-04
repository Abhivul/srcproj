package automationFramework;

public class Secondcase {
	
	public int sum(int a,int b) {
		int c=a+b;
		return c;
		
	}
	
	public int sub(int a,int b) {
		int c=a-b;
		return c;
		
	}
	public int mul(int a,int b) {
		int c=a*b;
		return c;
		
	}
	public void div(int a,int b) {
		int c=a/b;
		
		System.out.println(((((10+2)-2)+2)*2)/2);
		
	}
	Secondcase() {
		
		System.out.println("FC");
		
	}
	public void Test() {
		
		System.out.println("Ganesha murugan ayyappa");
		
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Secondcase fs= new Secondcase();
		
		int a1=fs.sum(10,2);
		int a2= fs.sub(a1,2);
		int a3= fs.mul(a2,2);
		 fs.div(a3,2);
		 fs.Test();
		


	}

}
