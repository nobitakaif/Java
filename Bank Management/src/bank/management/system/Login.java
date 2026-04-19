package bank.management.system;

import javax.swing.*;

public class Login extends JFrame {
    Login(){
        super("Bank Project");
        setSize(1000, 550); // window ui Dimension
        setVisible(true); // by default this is false(hidden) we need to manually set this true
        setLocation(250, 180);
    }

    public static void main(String[] args) {
        new Login();
    }
}
