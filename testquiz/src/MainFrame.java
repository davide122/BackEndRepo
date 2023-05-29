import java.awt.FlowLayout;

import javax.swing.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        setTitle("My Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 700);
        setLocationRelativeTo(null); // Center the frame on the screen
        setLayout(new FlowLayout()); 
        JButton pulsante = new JButton("Pulsante");
        JTextField textbox = new JTextField();
       
        pulsante.setBounds(0, 0, 100, 50);
        add(textbox);
        textbox.addActionListener(e->{});
        add(pulsante);
        pulsante.addActionListener(e -> {
            
        });
        
        // Add your components, panels, and layout here

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainFrame();
            }
        });
    }
}
