package substitute;

public class CalcAssignment {
	int a = 10;
	int b= 20;
	int add= a+b;
	int e= 100;
	int f= 90;
	int sub=e-f;
    double i=20.2;
	double j=10.2;
	double mux= i*j;
	float x= 200000f;
	float y= 100000f;
	float div = x/y;
	public static void main(String[] args) {
			CalcAssignment local =new CalcAssignment();
			System.out.println("Addition= "+local.add);
			System.out.println("Subraction= "+local.sub);
			System.out.println("Multiplication= "+local.mux);
			System.out.println("Division= "+local.div);
			
	}	
	}


