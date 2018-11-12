import java.util.ArrayList;
import java.util.HashSet;

public class ArrayUnion {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,1};
		int[] b = {2,2,8,9};
		ArrayList<Integer> al = new ArrayList<>();
		int i = 0, j = 0;
		
		while(i < a.length && j<b.length) {
			if(a[i]<b[j]) {
				al.add(a[i++]);
			}else if(a[i]>b[j]) {
				al.add(b[j++]);
			}else {
				al.add(a[i++]);
				j++;
			}
		}
		
		while(i<a.length) {
			al.add(a[i++]);
		}
		while(j<b.length) {
			al.add(b[j++]);
		}
		
		System.out.println(new HashSet<>(al));
	}
}
