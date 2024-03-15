import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;



public class Login implements ActionListener


{
    //label(String text)
    //It construct the level with the given string(left justified by default)
    //frame(String)
    JLabel userNameLabel, passwordLabel;      //Consutructor overloading 
    JTextField userNameTextField;
    JPasswordField pwdField;

    JFrame f;
    JPanel p;
    JButton submitButton;

    public Login()
    {
        //initialize the components and containers
        f = new JFrame("Login Form");
        p = new JPanel();
        userNameLabel = new JLabel("User Name");
        passwordLabel = new JLabel("Password");

        userNameTextField = new JTextField(20);
        pwdField = new JPasswordField(20);
       // PasswordField.setEchoChar('*');

       submitButton = new JButton("Submit");

       submitButton.addActionListener(this);

        //add all the components into pannel
        p.add(userNameLabel);
        p.add(userNameTextField);

        p.add(passwordLabel);
        p.add(pwdField);
        p.add(submitButton);

        

        //add the panel into frame
        f.add(p);

        //setSize (int width, int height) of window 
        f.setSize(300, 400);
        f.setVisible(true);
        f.setBackground(Color.GRAY);
        f.setResizable(false);

    }

    @Override
    public void actionPerformed (ActionEvent e) {
        System.out.println("login button is clicked");

    }

    public static void main(String[] args) {
        Login formObj = new Login();
      
    }
}
