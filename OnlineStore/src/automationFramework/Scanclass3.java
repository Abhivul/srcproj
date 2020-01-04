package automationFramework;

import java.util.Scanner;

public class Scanclass3 {

	//Without void
	
		public int sum(int x1,int x2) {
			int c=x1+x2;
			return c;
			}
		
		public int sub(int c,int x3) {
			int c1= c-x3;
			return c1;
			
		}
		public int add(int c1,int x4) {
			int c2=c1+x4;
			return c2;
			
		}
		public int mul(int c2,int x5) {
			int c3=c2*x5;
			return c3;
			
		}
		public int div(int c3,int x6) {
		 int  c4 =c3/x6;
		 return c4;
					 
		}

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


