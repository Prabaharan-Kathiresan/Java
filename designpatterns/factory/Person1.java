public class Person1 {
 
 public static void main(String[] arg) {
	
	//SMSNotification smsMsg = new SMSNotification(); //no need to create object creation
	//smsMsg.notify("I will come Tomorrow");
	
	//EmailNotification email = new EmailNotification(); //no need to create object creation
	//email.notify("Bank statemeent send");
	
	//PushNotification push = new PushNotification(); //no need to create object creation
	//push.notify("December Sale is on");
	NotificationFactory  factory = new NotificationFactory();
	factory.sendNotification("EMAIL","Bank statemeent send");
	factory.sendNotification("PUSH","December Sale is on");
	factory.sendNotification("SMS","I will come Tomorrow");
	
	
	
	
 }

}