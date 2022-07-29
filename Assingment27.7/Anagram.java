package substitute;
import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String str1="stops";
		String str2="potss";
		 char [] charArray1= str1.toCharArray();
		 char [] charArray2= str2.toCharArray();
		Arrays.sort(charArray1);
	    Arrays.sort(charArray2);
	     System.out.println(Arrays.equals(charArray1, charArray2));
	}

}
