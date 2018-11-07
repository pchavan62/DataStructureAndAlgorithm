
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5,10,15,20,25};
		int index=binarySearch(a,5,20);
		if(index!=-1) {
			System.out.println("Yahooo... you got your index :) Element found at : "+index);
		}else {
			System.out.println("Sorry your element not found bcz index is return as -1");
		}
	}
	
	public static int binarySearch(int[] a,int n,int x) {
		int low=0;int high = n-1;int mid=0;
		while(low<=high) {
			mid = (low+high)/2;
			if(x==a[mid])
				return mid;
			else if(x<a[mid])
				high=mid-1;
			else
				low=mid+1;
		}
		return -1;
	}
}
