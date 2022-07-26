package week1.day1;

public class Whatsapp {

	public void makeCall() {
	    System.out.println("make call");
	}
	private void sendMessage() {
		System.out.println ("send message");
	}
	protected void whatsappPayments() {
		System.out.println("whatsapp payments");
	}
	void sendText() {
		System.out.println("send text");
	}
	public static void main(String[] args) {
		Whatsapp app = new Whatsapp ();
		app.makeCall();
		app.sendMessage();
		app.whatsappPayments();
		app.sendText();	
	}
	}
