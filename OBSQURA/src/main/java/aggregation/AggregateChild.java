package aggregation;

public class AggregateChild {
	int x,y;
	AggregateParent c;
	
	public AggregateChild(int x,int y, AggregateParent c) //constructor
	{
		this.x=x;
		this.y=y;
		this.c=c;
	}
	
	public void show() //method
	{
		System.out.println(x);
		System.out.println(y);
		c.display();
	}

	public static void main(String[] args) {
		AggregateParent p = new AggregateParent(0,0);
		AggregateChild n= new AggregateChild(90,60,p); //p is reference of Parent
		n.show();
		
	}

}
