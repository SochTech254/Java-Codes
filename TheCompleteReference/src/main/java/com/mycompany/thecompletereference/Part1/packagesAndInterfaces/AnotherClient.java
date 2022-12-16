package packagesAndInterfaces;

// Another implementation of Callback.
class AnotherClient implements CallBackInterface {
	
	// Implement Callback's interface
	public void callback(int p) {
		System.out.println("Another version of callback");
		System.out.println("p squared is " +(p * p));
	}
	

}
