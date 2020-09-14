final class ImmutableDemo {
	private int i;

	ImmutableDemo(int i) {
		this.i = i;
	}

	public ImmutableDemo modify(int i) {
		if (this.i == i)
			return this;
		else
			return (new ImmutableDemo(i));
	}

	public static void main(String[] args) {
		ImmutableDemo ID1 = new ImmutableDemo(10);
		ImmutableDemo ID2 = ID1.modify(100);
		ImmutableDemo ID3 = ID1.modify(10);
		System.out.println(ID1 == ID2);
		System.out.println(ID1 == ID3);
	}
}
