
public class MaxSumSubArray {

	public static void main(String[] args) {
		int[] a = {1,21,5,-9,5,8};
		int sum = maxSum(a);
		System.out.println(sum);
	}

	private static int maxSum(int[] a) {
		int maxSofar = a[0];
		int maxEndingHere = 0;
		
		for(int i = 0; i<a.length;i++) {
			maxEndingHere += a[i];
			if(maxSofar<maxEndingHere) {
				maxSofar = maxEndingHere;
			}
			if(maxEndingHere<0) {
				maxEndingHere = 0;
			}
		}
		return maxSofar;
	}
}
