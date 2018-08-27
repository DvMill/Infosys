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

/*
 * Created the Anagram program to save on complexity by just turning the strings into a character array then sorting them. 
 * After they are sorted I compared the 2 array to make sure they are equal.
 * It will return true if they contain the same characters which means they are anagrams of eachother.
 * otherwise it will return false.
 * 
 * You can also do it by running a loop
 * first check if the strings are different sizes and if they are return false.
 * otherwise using a loop check each character in one string to the other string and see if they match, if one character in first string doesnt 
 * natch one in the second string return false
 * if all characters in one string match in the other string return true.
 * 
 * IT will run until it checks all and then it will return true, or if it found one that didnt match
*/ 