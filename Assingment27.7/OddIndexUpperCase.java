package substitute;

public class OddIndexUpperCase {
	public static void main(String[] args) {
		String text="changeme";
	      text = text.toLowerCase();
	      char[] ch = text.toCharArray();
	      for(int i=0; i<ch.length; i=i+2){
	         ch[i] = Character.toUpperCase(ch[i]);
	      }
	      System.out.println(new String(ch));
		//char[] charArray=text.toCharArray();
	   // for (int i = charArray.length-1; i >=0; i--) {
		//	System.out.println(charArray[i]);	
	    }
	}
//}
