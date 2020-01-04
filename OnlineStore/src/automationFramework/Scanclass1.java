package automationFramework;

import java.util.Scanner;

public class Scanclass1 {
	
	//int x1,x2,x3,x4,x5,x6;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter values of below x1");
		int x1=  sc.nextInt();
		System.out.println("Enter values of below x2");
		int x2=  sc.nextInt();
		System.out.println("Enter values of below x3");
		int x3=  sc.nextInt();
		System.out.println("Enter values of below x4");
		int x4=  sc.nextInt();
		System.out.println("Enter values of below x5");
		int x5=  sc.nextInt();
		System.out.println("Enter values of below x6");
		int x6=  sc.nextInt();
		
		System.out.println(((((x1+x2)-x3)+x4)*x5)/x6);
		
		
		

	}

}
