package frame;

import javax.swing.*;

public class SignUpFrame extends JFrame{
    private JButton loginButton;
    private JButton signUpButton;
    private JButton fpBtn;
    private JLabel usernameLbl;
    private JLabel passwordLbl;
    private JTextField usernameTxF;
    private JPasswordField passwordFieldPwdF;
    private JLabel registerLbl;

    SignUpFrame () {
        this.setTitle ("Sign up into bank app");
        this.setSize(400,300);
        this.setLayout(null);
        registerLbl = new JLabel("Register");
        usernameLbl = new JLabel("Username:");
        usernameTxF = new JTextField();
        passwordLbl = new JLabel("Password:");
        passwordFieldPwdF = new JPasswordField();
        signUpButton = new JButton("Sign up");

        registerLbl.setBounds(120,20,100,60);
        usernameLbl.setBounds(40,60,100,30);
        usernameTxF.setBounds(140,60,100,30);
        passwordLbl.setBounds(40,100,100,30);
        passwordFieldPwdF.setBounds(140,100,100,30);
        signUpButton.setBounds(90,180,180,40);

        this.add(usernameLbl);
        this.add(usernameTxF);
        this.add(passwordLbl);
        this.add(passwordFieldPwdF);
        this.add(signUpButton);
        this.add(registerLbl);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
