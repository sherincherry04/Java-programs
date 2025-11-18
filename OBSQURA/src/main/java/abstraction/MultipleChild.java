package abstraction;

public class  MultipleChild implements MultipleParent1,MultipleParent2{
public void show()
{
	System.out.println("inheriting..");
}
public void display()
{
	System.out.println("interface 2");
}
public static void main(String[] args) {
	MultipleChild m= new MultipleChild();
	m.display();
	m.show();
}
}
