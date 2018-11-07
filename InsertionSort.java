import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] a = {5,3,2,1,15,48,72,4};
		sort(a);
		Arrays.stream(a).forEach(s->System.out.print(s+ " "));
	}

	private static void sort(int[] a) {
	
		for(int i = 0; i<a.length-1; i++) {
			int hole = i+1;
			int value = a[i+1];
			while(hole>0 && a[hole-1]>value) {
				a[hole]=a[hole-1];
				hole--;
			}
			a[hole] = value;
		}
		
	}

}
