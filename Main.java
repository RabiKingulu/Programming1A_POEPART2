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
            } else if (choice == 2) {
                JOptionPane.showMessageDialog(null, "Coming Soon: Task Reports");
            } else if (choice == 3) {
                running = false;
                JOptionPane.showMessageDialog(null, "Exiting Application.");
            }
        }
    }
}
