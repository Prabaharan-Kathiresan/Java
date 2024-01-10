public class NotificationFactory {
  
   public void sendNotification(String channel,String msg) {
      if(channel.equalsIgnoreCase("SMS")) { 
		 SMSNotification sms = new SMSNotification();
		 sms.notify(msg);
	  } else if(channel.equalsIgnoreCase("EMAIL")) {
		 EmailNotification email = new EmailNotification();
		 email.notify(msg);
	  } else if(channel.equalsIgnoreCase("PUSH")) { 
	     PushNotification push = new PushNotification();
		 push.notify(msg);
	  } else {
		  System.out.println("Invalid channel");
		}
   }
   
    public Notification getChannel(String channel) {
		if(channel.equalsIgnoreCase("SMS")) { 
		 return new SMSNotification();
	  } else if(channel.equalsIgnoreCase("EMAIL")) {
			return new EmailNotification();
	  } else if(channel.equalsIgnoreCase("PUSH")) { 
			return new PushNotification();
	  } else {
		  System.out.println("Invalid channel");
		  return null;
		  
	}
   
}
}







