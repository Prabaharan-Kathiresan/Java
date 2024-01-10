public class SMSNotification extends Notification{
	
	public void notify(String msg) {
		System.out.println("Email Notification");
		System.out.println("Message::"+msg);
	}
	
	public void notify1(String msg) {
		System.out.println("Mobile Notification");
		System.out.println("Message::"+msg);
	}
}