package substitute;

public class ReverseEvenWords {

public static void main(String[] args) {
		
		String test = "I am a software tester";
		String[] split = test.split(" ");
		String convertedTest="";
		for(int i=0;i<split.length;i++) {
			if(i%2!=0) {
				char[] charArray = split[i].toCharArray();
				String rev="";
				for(int j=charArray.length-1;j>=0;j--) {
					rev=rev+charArray[j];
	}
				convertedTest=convertedTest+" "+rev;
}
			else {
				convertedTest=convertedTest+" "+split[i];
}
	}
		System.out.println(convertedTest);
	}
}

