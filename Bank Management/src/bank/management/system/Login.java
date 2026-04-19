package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    JLabel label1, label2, label3;
    JTextField textField2;
    JPasswordField passwordField3;

    JButton button1, button2, button3;

    Login(){
        super("Bank Project");
        getContentPane().setBackground(new Color(160, 210, 235));
        setSize(1000, 550);
        setLocation(250, 180);
        setLayout(null); // Disable layout manager for setBounds to work

        label1 = new JLabel("Authentication Page");
        label1.setFont(new Font("Arial", Font.BOLD, 38));
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setBounds(0, 80, 1000, 50); // only header
        add(label1);

        label2 = new JLabel("CARD NO : ");
        label2.setFont(new Font("Railway", Font.BOLD, 20));
        label2.setBounds(280, 200, 110, 30);
        add(label2);

        textField2 = new JTextField(15);
        textField2.setBounds(400, 200, 200, 30);
        add(textField2);

        label3 = new JLabel("PIN NO : ");
        label3.setFont(new Font("Railway", Font.BOLD, 20));
        label3.setBounds(280, 250, 150, 30);
        add(label3);

        passwordField3 = new JPasswordField(15);
        passwordField3.setBounds(400, 250, 200, 30);
        add(passwordField3);


        button1 = new JButton("SIGN IN");
        button1.setBounds(350, 320, 100, 30);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("CLEAR");
        button2.setBounds(500, 320, 100, 30);
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("SIGN UP");
        button3.setBounds(350, 380, 250, 30);
        button3.addActionListener(this);
        add(button3);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource() == button1){
                System.out.println("BUTTON 1 is clicked");
            } else if (e.getSource()== button2) {
                textField2.setText("");
                passwordField3.setText("");
            } else if (e.getSource() == button3) {
                System.out.println("BUTTON 3 is clicked");
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
