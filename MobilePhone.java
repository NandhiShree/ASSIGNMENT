package week1.day1;

public class MobilePhone {
	int ramSize= 64;
	long imeNumber= 34565454464l;
	boolean isCharged= true;
	String brandName= "DN2101";
	String modelName= "one plus";
	double mobilePrice = 12.34;
	public static void main(String[] args) {
		MobilePhone phone =new MobilePhone();
		//System.out.println(phone.ramSize);
		//System.out.println(phone.imeNumber);
		//System.out.println(phone.isCharged);
        //System.out.println(phone.modelName);
        //System.out.println(phone.mobilePrice);
		int a = phone.ramSize;
		System.out.println(a);
		long b = phone.imeNumber;
		System.out.println(b);
		boolean c = phone.isCharged;
		System.out.println(c);
		String d= phone.brandName ;
		System.out.println(d);
		String e= phone.modelName;
		System.out.println(e);
		double f=phone.mobilePrice;
		System.out.println(f);
	}

}