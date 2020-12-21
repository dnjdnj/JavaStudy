package com.dnj.study.frame;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName LoginFrame
 * @Description TODO
 * @Author dnj
 * @Date 2020/11/9
 **/
public class LoginFrame extends JFrame {
    private JPanel mainPanel;
    private JPanel centerPanel;
    private JPanel topPanel;
    private JPanel leftPanel;
    private JPanel bottomPanel;
    private JPanel rightPanel;
    private JPanel logoPanel;
    private JPanel loginPanel;
    private JLabel logoText;
    private JTextField textField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel text1;
    private JLabel text2;


    public LoginFrame() {
        init();
        loginButton.addActionListener(e -> {
            loginService ll = new loginService();
            String account = textField.getText();
            char[] password = passwordField.getPassword();
            String passString = new String(password);
            boolean result = ll.login(account, passString);
            if(result){
                JOptionPane.showMessageDialog(null,"登陆成功");
                LoginFrame.this.dispose();
            } else {
                JOptionPane.showMessageDialog(null,"登陆失败");
                LoginFrame.this.dispose();
            }
        });

    }
    public void init(){
        setTitle("LoginFrame");
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }


    public static void main(String[] args) {

        JFrame frame = new JFrame("LoginFrame");
        frame.setContentPane(new LoginFrame().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }


}
