package TestCases;


	public class example001 {
		int a=10;
		int b=20;
		public void add() {
			System.out.println(a+b);
		}
		public void sub() {
			System.out.println(b-a);
		}
		public void mul() {
			System.out.println(a*b);
		}		


		public static void main(String[] args) {
			example001 e=new example001();
			e.add();
			e.sub();
			e.mul();



		}



	}
