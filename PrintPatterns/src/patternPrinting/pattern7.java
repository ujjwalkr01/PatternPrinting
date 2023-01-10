package patternPrinting;

public class pattern7 {

	/*  design pattern
	 *      12345
	 *      1234
	 *      123 
	 *      12
	 *      1
	 */
	
	public static void main(String[] args) {
		int n = 5; // no of rows

		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------------------");
		alternateMethod(n);

	}

	private static void alternateMethod(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
