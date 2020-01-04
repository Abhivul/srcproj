package automationFramework;

public class MethodConst {
	
public void Test() {
	
		System.out.println("0 arg method");
		
		
	}
public void Test1(int a) {
	
	System.out.println("1 arg method");
	
	
}
public void Test2(int a,int b) {
	
	
	 this.Test3(10,2,40);
	 this.Test1(10);
	 this.Test();
	 this.Test4(10,2,3,40);
	System.out.println("2 arg method");
	
	
}
public void Test3(int a,int b,int c) {
	
	System.out.println("3 arg method");
	
	
}
public void Test4(int a,int b,int c,int d) {
	
	System.out.println("4 arg method");
	
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodConst mc=new MethodConst();
		mc.Test2(10,20);

	}

}
