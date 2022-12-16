package packagesAndInterfaces;

class TestIface {

	public static void main(String[] args) {
		CallBackInterface c = new Client();
		c.callback(42);

	}

}
