package inheritance;

// When working with inheritance, the inferred type is the declared
// type of the initializer, which may not be the most derived type of
// the object being referred to by the initializer.
class MyClass1 {
	// ...
}
class FirstDerivedClass extends MyClass1 {
	int x;
	// ...
}
class SecondDerivedClass extends FirstDerivedClass {
	int y;
	// ...
}
class TypeInferenceAndInheritance {
	// Return some type of MyClass object.
	static MyClass1 getObj(int which) {
		switch(which) {
		case 0 : return new MyClass1();
		case 1 : return new FirstDerivedClass();
		default : return new SecondDerivedClass();
		}
	}

	public static void main(String[] args) {
		// Even though getObj() returns different types of
		// objects within the MyClass1 inheritance hierarchy,
		// its declared return type is MyClass1. As a result,
		// in all three cases shown here, the type of the
		// variables is inferred to be MyClass1, even though
		// different derived types of objects are obtained.
		
		// Here, getObj() returns a MyClass1 object.
		var mc = getObj(0);
		
		// In this case, a FirstDerivedClass object is returned.
		var mc2 = getObj(1);
		
		// Here, a SecondDerivedClass object is returned
		var mc3 = getObj(2);
		
		// Becaause the types of both mc2 and mc3 are inferred
		// as MyClass1 (because the return type of getObj() is
		// MyClass1), neither mc2 nor mc3 can access the fields 
		// declared by FirstDerivedClass or SecondDerivedClass.

	}

}
