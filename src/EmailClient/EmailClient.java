package EmailClient;

public class EmailClient {

    private String serverAddress;
    private String username;
    private String password;

    public EmailClient (String serverAddress, String username, String password){
        this.serverAddress = serverAddress;
        this.username = username;
        this.password = password;
    }

    public void sendEmail(String recipient, String subject, String body){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

    }
}
