
public class EncodeStringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "AAAABBBCCDDAAA";
		calculate(s);
	}

	private static void calculate(String s) {
		int n = s.length();
		for(int i = 0; i <= n-2; i++) {
			int count = 1;
			while(i<n-1 && s.charAt(i) == s.charAt(i+1)) {
				count++;
				i++;
			}
			System.out.print(count);
			System.out.print(s.charAt(i));
		}
	}
}
