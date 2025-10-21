package inheritance;

public class Multi_Child extends Multilevel_intermediateParent{

	public void sub() {
		int a = 50,b=25;
		int result = a-b;
		System.out.println("Substarction Result : "+ " "+ result);
		

	}
	public static void main(String[] args) {
		Multi_Child obj= new Multi_Child();
		
		obj.sub();
		obj.calc();
		obj.add();
		
		
		
		
	}
}
