public class PushNotification extends Notification {

	public void notify(String msg) {
		System.out.println("Email Notification");
		System.out.println("Message::"+msg);
	}

	public void notify1(String msg) {
		System.out.println("Push Notification");
		System.out.println("Message::"+msg);
	}
}