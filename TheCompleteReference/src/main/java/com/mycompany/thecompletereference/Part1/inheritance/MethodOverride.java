package inheritance;

// Method overriding.
class A3 {
	int i, j;
	
	A3(int a, int b) {
		i = a;
		j = b;
	}
	
	// display i and j
	void show() {
		System.out.println("i and j : " + i + " " + j);
	}
}

class B3 extends A3 {
	int k;
	
	B3(int a, int b, int c) {
		super(a, b);
		k = c;
	}
	
	//  this overrides show() in A
	void show() {
		super.show(); 	// this calls A's show()
		System.out.println("k : " + k);
	}
}
class MethodOverride {

	public static void main(String[] args) {
		B3 subOb = new B3(1, 2, 3);
		
		subOb.show(); 	// this calls show() in B

	}

}
