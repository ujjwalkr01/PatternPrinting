package patternPrinting;

public class Pattern {

	public static void main(String[] args) {
        
		/*
		 *   0 0 0 0 0 1 0 0 0 0 0 
                     0 0 0 0 2 3 2 0 0 0 0 
                     0 0 0 3 4 5 4 3 0 0 0 
                     0 0 4 5 6 7 6 5 4 0 0 
                     0 5 6 7 8 9 8 7 6 5 0 
                     6 7 8 9 10 11 10 9 8 7 6 
		  
		 */

		int n = 6;
		int k = 0;
		int l = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= (2 * n) - 1; j++) {

				if (j == n - i + 1) {
					for (l = n - i + 1; l <= n + i - 1; l++) {
						if (l <= n) {
							k++;
							System.out.print(k + " ");
						} else if (l > n) {
							k--;
							System.out.print(k + " ");
						}
					}
					j = l - 1;
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}

}
