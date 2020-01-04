package automationFramework;


	
	public class JBT1 {
		public static void main(String[] args) {
			JBT11 obj = new JBT11();
			obj.i = 10;
			obj.method();
		}
	}
	class JBT11 extends JBT1 {
		int i;
		void method() {
			method1(this);
			
		}
		void method1(JBT11 t) {
			System.out.println(t.i);
		}


}
