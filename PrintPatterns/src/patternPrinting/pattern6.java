package patternPrinting;

public class pattern6 {

	/*  design pattern
	 *      1
	 *      12
	 *      1234 
	 *      12345
	 */
	
	public static void main(String[] args) {
		int n = 5; // no of rows

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
