import java.util.Arrays;
// message to check for anagrams
class Anagrams{
	public static boolean check(String x1,String x2) {
		char a[]=x1.toCharArray();
		char b[]=x2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		return Arrays.equals(a,b);
	}
	public static void main(String[] args) {
		System.out.println(check("Hello", "oHlel"));
		System.out.println(check("Hello", "polHel"));
	}
}

