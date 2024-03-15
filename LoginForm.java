import java.awt.*;

public class LoginForm
{
    //label(String text)
    //It construct the level with the given string(left justified by default)
    //frame(String)
    Label userNameLabel, passwordLabel;      //Consutructor overloading 
    TextField userNameTextField, passwordTextField;
    Frame f;
    Panel p;

    public LoginForm()
    {
        //initialize the components and containers
        f = new Frame("Login Form");
        p = new Panel();
        userNameLabel = new Label("User Name");
        passwordLabel = new Label("Password");

        userNameTextField = new TextField(20);
        passwordTextField = new TextField(20);
        passwordTextField.setEchoChar('*');

        //add all the components into pannel
        p.add(userNameLabel);
        p.add(userNameTextField);

        p.add(passwordLabel);
        p.add(passwordTextField);

        

        //add the panel into frame
        f.add(p);

        //setSize (int width, int height) of window 
        f.setSize(300, 400);
        f.setVisible(true);
        f.setBackground(Color.RED);
        f.setResizable(false);

    }

    public static void main(String[] args) {
        LoginForm formObj = new LoginForm();
      
    }
}
