import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a = {89,5,41,6,55,61,23,200,88,1,25};
		sort(a);
		Arrays.stream(a).forEach(s->System.out.print(s+ " "));
	}

	private static void sort(int[] a) {
		int n = a.length;
		for(int i = 0; i<n; i++) {
			bubble(a,n);
		}
	}

	private static void bubble(int[] a,int n) {
		
		for(int j = 0; j<n-1; j++) {
			int temp = 0;
			if(a[j]>a[j+1]) {
				temp = a[j+1];
				a[j+1] = a[j];
				a[j] = temp;
			}
		}
	}
}
