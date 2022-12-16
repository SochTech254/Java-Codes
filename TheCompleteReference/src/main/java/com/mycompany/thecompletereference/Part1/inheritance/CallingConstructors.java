package inheritance;

// Demonstrate when constructors are executed.
// Create a super class.
class A2 {
	A2() {
		System.out.println("Inside A's constructor.");
	}
}

// Create a subclass by extending class A.
class B2 extends A2 {
	B2() {
		System.out.println("Inside B's constructor.");
	}
}

// Create another subclass by extending B.
class C2 extends B2 {
	C2() {
		System.out.println("Inside C's constructor.");
	}
}
class CallingConstructors {

	public static void main(String[] args) {
		C2 c = new C2();
		
		System.out.println(c.getClass());

	}

}
