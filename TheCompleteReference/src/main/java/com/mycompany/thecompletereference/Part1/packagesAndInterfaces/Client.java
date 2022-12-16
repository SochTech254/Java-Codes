package packagesAndInterfaces;

class Client implements CallBackInterface {

	// Implement Callback's interface
	public void callback(int p) {
		System.out.println(" callback called with " + p);
	}
	
	void nonIfaceMeth() {
		System.out.println("Classes that implement interfaces " + 
							"may also define other members, too.");
	}

}
