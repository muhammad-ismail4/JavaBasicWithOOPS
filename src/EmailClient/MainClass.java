package EmailClient;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        // Create an instance of EmailClient
        EmailClient emailClient = new EmailClient("smtp.example.com", "your_username", "your_password");
        EmailValidator emailValidator = new EmailValidator();

        // Prompt the user for email details
        Scanner scanner = new Scanner(System.in);

        System.out.print("Recipient: ");
        String recipient = scanner.nextLine();

        if (!emailValidator.validate(recipient)) {
            System.out.println("Invalid email address. Aborting...");
            return;
        }

        System.out.print("Subject: ");
        String subject = scanner.nextLine();

        System.out.print("Body: ");
        String body = scanner.nextLine();

        // Send the email
        emailClient.sendEmail(recipient, subject, body);

        scanner.close();
    }
}
