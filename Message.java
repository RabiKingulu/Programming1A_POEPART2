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
    public boolean checkMessageID() {
        if (this.messageId != null && this.messageId.length() <= 10) {
            return true;
        }
        return false;
    }

    public String checkRecipientCell() {
        if (this.recipient == null || this.recipient.length() > 12) {
            return "Cell phone number is incorrectly formatted or does not contain an international code. Please correct the number and try again.";
        }
        if (this.recipient.startsWith("+") || this.recipient.startsWith("0")) {
            return "Cell phone number successfully captured.";
        }
        return "Cell phone number is incorrectly formatted or does not contain an international code. Please correct the number and try again.";
    }

    public String SentMessage(int choice) {
        if (choice == 1) {
            totalMessagesSent++;
            return "Message successfully sent";
        } else if (choice == 2) {
            return "Press 0 to delete the message";
        } else if (choice == 3) {
            storeMessage();
            return "Message successfully stored";
        }
        return "";
    }
}

