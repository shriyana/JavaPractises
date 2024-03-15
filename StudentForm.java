import javax.swing.*;
import java.awt.*;

public class StudentForm
{
    JFrame f ;
    JPanel p;
    JCheckBox chkReading, chkTravelling, chkSaved;
    JRadioButton rbmale, rbfemale;
    ButtonGroup groupGender;
    JTextField textUsername;
    JPasswordField textPassword;
    JButton btnLogin;
    JButton btnReset;
    JLabel lblpassword;
    //JLabel textpassword;
    JLabel lblResult;
    //Jcheck chkSaved

    JComboBox cmbProgram;
    JList lstSemester;



    public StudentForm () //condructor

    {       


        f = new JFrame ("student form");
        p = new JPanel ();

        lblpassword=new JLabel("Password");
        lblResult=new JLabel("Result");
        

        chkReading= new JCheckBox ("Reading");
        chkTravelling= new JCheckBox("travelling");
        chkSaved = new JCheckBox("Saved??");


        f.add(p);
        
        textUsername= new JTextField (15);
        //textpassword= new JPasswordField(15);
        textPassword = new JPasswordField(10);



        groupGender= new ButtonGroup();
        rbmale= new JRadioButton ("male");
        rbfemale = new JRadioButton ("female");
        groupGender.add(rbmale);
        groupGender.add(rbfemale);

       


        String[] program= {"BCA", "BICT", "BBM", "BBA"};
        cmbProgram = new JComboBox(program);
        
        String[]semester= {"1st", "2nd", "3rd"};
        lstSemester= new JList(semester);

        btnLogin= new JButton ("login");
        btnReset=new JButton ("Reset");


        p.add (lblpassword);
        p.add (textPassword);

        p.add (rbmale);
        p.add(rbfemale);

        p.add(chkSaved);
        p.add(cmbProgram);
        p.add (lstSemester);

        p.add(btnLogin);
        p.add(btnReset);
        p.add(lblResult);

        f.add(p);
//setTitle

        f.setSize (300,400);
        f.setVisible (true);
    }


    public static void main (String[] args){
        new StudentForm();

    }

}

