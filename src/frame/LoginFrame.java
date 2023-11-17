package frame;

import javax.swing.*;

public class LoginFrame extends JFrame{
    private JButton loginButton;
    private JButton signUpButton;
    private JButton fpBtn;
    private JLabel usernameLbl;
    private JLabel passwordLbl;
    private JTextField usernameTxF;
    private JPasswordField passwordFieldPwdF;

    LoginFrame () {
        this.setTitle ("Login into bank app");
        this.setSize(400,300);
        this.setLayout(null);
        usernameLbl = new JLabel("Username:");
        usernameTxF = new JTextField();
        passwordLbl = new JLabel("Password:");
        passwordFieldPwdF = new JPasswordField();
        loginButton = new JButton("Login");
        fpBtn = new JButton("Forgotten password");
        signUpButton = new JButton("Sign up");

        usernameLbl.setBounds(40,20,100,20);
        usernameTxF.setBounds(140,20,100,20);
        passwordLbl.setBounds(40,60,100,20);
        passwordFieldPwdF.setBounds(140,60,100,20);
        loginButton.setBounds(140,120,100,30);
        fpBtn.setBounds(40,160,160,30);
        signUpButton.setBounds(220,160,80,30);

        this.add(usernameLbl);
        this.add(usernameTxF);
        this.add(passwordLbl);
        this.add(passwordFieldPwdF);
        this.add(loginButton);
        this.add(fpBtn);
        this.add(signUpButton);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
