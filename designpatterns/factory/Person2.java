public class Person2 {

 public static void main(String[] arg) {
	
	NotificationFactory factory = new NotificationFactory();
	Notification channel = factory.getChannel("SMS");
	channel.notify1("I will come tomorrow");
	
		
	channel = factory.getChannel("EMAIL");
	channel.notify1("receipt send");
	
	channel = factory.getChannel("PUSH");
	channel.notify1("hello");
 }
}