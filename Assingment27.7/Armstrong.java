package substitute;

public class Armstrong {
	public static void main(String[] args) {
		int number=166;
		int r=0,sum=0;
		int temp=number;
		
		while(temp>0) {
			r=temp%10;
			
			sum=sum+(r*r*r);
			temp=temp/10;
		}
		if(sum==number) {
			System.out.println("  Armstrong number:"+number);
		}
		else {
			System.out.println(" not an Armstrong number:"+number);
		}
	}
}
