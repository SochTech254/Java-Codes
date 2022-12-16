package packagesAndInterfaces;

// Use the default method.
class DefaultMethodDemo {

	public static void main(String[] args) {
		MyIFImp obj = new MyIFImp();
		
		// can call getNumber(), because it is explicitly
		// implemented by MyIFImp :
		System.out.println(obj.getNumber());
		
		// can also call getString(), because of default
		// implementation
		System.out.println(obj.getString());

	}

}
