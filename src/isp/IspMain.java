package isp;

public class IspMain {
	public static void main(String[] args) {
		GmailAccount gk = new GmailAccount();
		gk.emailAdress = "noreply@gmail.com";
		gk.name = "Unknown";
		
		EmailSender es = new EmailSender();
		es.SendEmail(gk, "Hello World");
				
	}
}
