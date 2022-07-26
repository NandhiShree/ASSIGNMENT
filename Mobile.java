package week1.day1;

public class Mobile {
	public void sendMessage() {
		System.out.println("Message");
}

public void shareDocument() {
	System.out.println("Document");
}
public void call() {
	System.out.println("Call");
}

public static void main(String[] args) {
Mobile mobile=new Mobile();
mobile.sendMessage();
mobile.shareDocument();
mobile.call();
}
}
