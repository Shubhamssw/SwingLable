import javax.swing.*;

public class SwingExample {
    public static void main(String[] args) {
        JFrame f = new JFrame();

        JLabel firstNameLabel = new JLabel("First Name:");
        firstNameLabel.setBounds(50, 50, 100, 30);
        JLabel lastNameLabel = new JLabel("Last Name:");
        lastNameLabel.setBounds(50, 80, 100, 30);

        JTextField firstNameField = new JTextField();
        firstNameField.setBounds(150, 50, 150, 30);
        JTextField lastNameField = new JTextField();
        lastNameField.setBounds(150, 80, 150, 30);

        JButton clearButton = new JButton("Clear");
        clearButton.setBounds(130, 150, 100, 40);
        clearButton.addActionListener(e -> {
            firstNameField.setText("");
            lastNameField.setText("");
        });

        JButton b = new JButton("Click");
        b.setBounds(130, 200, 100, 40);

        f.add(firstNameLabel);
        f.add(lastNameLabel);
        f.add(firstNameField);
        f.add(lastNameField);
        f.add(clearButton);
        f.add(b);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}