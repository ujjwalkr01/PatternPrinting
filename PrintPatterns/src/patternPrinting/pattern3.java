package patternPrinting;

public class pattern3 {

	/*  design pattern
	 *      *
	 *      **
	 *      *** 
	 *      ****
	 */
	
	public static void main(String[] args) {
		int n = 4; // no of rows

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
