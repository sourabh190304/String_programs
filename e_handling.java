package strings_by_hrishi_sir;

public class e_handling {
	public static void main(String[] args) {


		System.out.println("LOG-IN");
		try {
			System.out.println("search PRODUCTS"+10/0);
		}
		catch(Exception E) {
			System.out.println(E);
		}

		System.out.println("add to cart");

		System.out.println("payment");
	}

}
