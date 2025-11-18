package abstraction;

public class AbstractChild extends AbstractParent
{
   public void method1() { //overridden from parent class
	System.out.println("show abstract override from parent ");
}
 public static void main(String[] args) {
		// TODO Auto-generated method stub
  AbstractChild m = new AbstractChild();
  m.method1();
  m.show();
	}

}
