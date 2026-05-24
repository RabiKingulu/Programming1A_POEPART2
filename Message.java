import java.util.Random;

public class Message {
    private String messageId;
    private int messageNum;
    private String recipient;
    private String messageContent;
    private static int totalMessagesSent = 0;

    public Message(int messageNum, String recipient, String messageContent) {
        this.messageNum = messageNum;
        this.recipient = recipient;
        this.messageContent = messageContent;
        this.messageId = generateRandomID();
    }

    private String generateRandomID() {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(rand.nextInt(10));
        }
        return sb.toString();
    }
}
