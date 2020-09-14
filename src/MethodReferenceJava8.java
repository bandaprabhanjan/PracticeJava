
public class MethodReferenceJava8 {
	public void m1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("method reference");
		}
	}

	public static void main(String[] args) {
		MethodReferenceJava8 t = new MethodReferenceJava8();
		Runnable r = t::m1;
		Thread t1 = new Thread(r);
		t1.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("parent thread");
		}
	}
}
