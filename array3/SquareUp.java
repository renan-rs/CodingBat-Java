package array3;

/**
 * Given n>=0, create an array length n*n with the 
 * following pattern, shown here for n=3 : 
 * {0, 0, 1,    0, 2, 1,    3, 2, 1} 
 * (spaces added to show the 3 groups).
 * 
 * squareUp(3) = {0, 0, 1, 0, 2, 1, 3, 2, 1}
 * squareUp(2) = {0, 1, 2, 1}
 * squareUp(4) = {0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1}
 * 
 *  
 *
 */

public class SquareUp {

	public static void main(String[] args) {
		int[] nums;
		//System.out.print(squareUp(3));
		nums = squareUp(3);
		for(int n : nums) System.out.print(n+" ");
	}

	public static int[] squareUp(int n) {
		int[] nums = new int[n*n];
		int pos = 0;
		
		for (int i = 1; i <= n; i++) {
			for(int j = 1; j <= n - i; j++) {
				nums[pos++] = 0;
			}
			for (int k = i; k > 0; k--) {
				nums[pos++] = k;
			}
		}
		return nums;
	}


}
