
public class ArrayIntersection {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b = {1,5,10};
		int i=0,j=0;
		
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) {
				i++;
			}else if(a[i]>b[j]) {
				j++;
			}else {
				System.out.println(a[i++]);
				j++;
			}
		}
	}

}
