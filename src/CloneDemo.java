
public class CloneDemo implements Cloneable {
	int i = 10;
	int j = 20;

	public static void main(String[] args) throws CloneNotSupportedException
	{
	CloneDemo cd1 = new CloneDemo();
	CloneDemo cd2 = (CloneDemo)cd1.clone();
	cd2.i = 888;
	cd2.j = 999;
	System.out.println(cd1.i+"-----"   +cd1.j);
	System.out.println(cd2.i+"----"    +cd2.j);
	System.out.println("After");
	cd1.i = 222;
	cd1.j = 333;
	System.out.println(cd1.i+"-----"   +cd1.j);
	System.out.println(cd2.i+"----"    +cd2.j);
	}
}
