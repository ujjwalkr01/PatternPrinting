package patternPrinting;

public class pattern2 {

	/*  design pattern
	 *      *****
	 *      *   *
	 *      *   * 
	 *      *****
	 */
	
	public static void main(String[] args) {
		int n = 4; // no of rows
		int m = 5; // no of coloumn

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (i == 1 || j == 1 || i == n || j == m) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
