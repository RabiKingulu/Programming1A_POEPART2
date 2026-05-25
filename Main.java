import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome to Kanban Tasks");
        
        boolean running = true;
        while (running) {
            String menu = "Select an option:\n1. Add Tasks\n2. Show Report\n3. Quit";
            String choiceInput = JOptionPane.showInputDialog(menu);
            
            if (choiceInput == null) {
                break;
                    }  
            int choice = Integer.parseInt(choiceInput); 
                        if (choice == 1) {
                String recipient = JOptionPane.showInputDialog("Enter Recipient Name:");
                String cell = JOptionPane.showInputDialog("Enter Recipient Cell Number:");
                String content = JOptionPane.showInputDialog("Enter Message Content:");
                
                Message msg = new Message(recipient, cell, content);
                
                if (msg.checkRecipientCell() && msg.checkMessageLang()) {
                    msg.storeMessage();
                    JOptionPane.showMessageDialog(null, "Message successfully captured!\n" + msg.printMessageDetails());
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to capture message. Check cell number or character length.");
                }
            } else if (choice == 2) {
                JOptionPane.showMessageDialog(null, "Total Messages Sent so far: " + Message.returnTotalMessages());
            } else if (choice == 3) {
                running = false;
                JOptionPane.showMessageDialog(null, "Exiting Application.");
            }
        }
    }
}

            
