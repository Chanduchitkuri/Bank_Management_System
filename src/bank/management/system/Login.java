
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener
{
    JButton login,clear,signup;
    JTextField cardField;
    JPasswordField pinField;
    Login()//constructor is called automatically when instance of class is created...
    {
        setTitle("Automated Teller Machine"); setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l=new JLabel(i3);
        l.setBounds(70,10,100,100);
        add(l);
        
        JLabel text=new JLabel("Welcome To ATM");
        text.setFont(new Font("osward",Font.BOLD,38));
        text.setBounds(200,40,450,40);
        add(text);
        
        JLabel cardno=new JLabel("Card No: ");
        cardno.setFont(new Font("Raleway",Font.BOLD,28));
        cardno.setBounds(125,150,375,30);
        add(cardno);
        
        cardField=new JTextField();
        cardField.setBounds(300,150,230,30);
        cardField.setFont(new Font("Arial",Font.BOLD,14));
        add(cardField);
        
        JLabel pin=new JLabel("PIN: ");
        pin.setFont(new Font("Raleway",Font.BOLD,28));
        pin.setBounds(120,220,375,30);
        add(pin);
        
        pinField=new JPasswordField();
        pinField.setBounds(300,220,230,30);
        pinField.setFont(new Font("Arial",Font.BOLD,14));
        add(pinField);
        
        login = new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        clear = new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
        signup = new JButton("SIGN UP");
        signup.setBounds(300,350,230,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
        
        getContentPane().setBackground(Color.white);
        
        
        
        
       // setLayout(new FlowLayout()); //FlowLayout, GridLayout Null
        setVisible(true);
        setSize(800, 480);
        setLocation(350,200);//to display it in center
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// to close the window directly and terminate.
   
    }
    
    public static void main(String[] args)
    {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==clear){
            cardField.setText("");
            pinField.setText("");
        }else if(e.getSource()==login){
             Conn c = new Conn();
                String cardno  = cardField.getText();
                String pinno  = pinField.getText();
                String q  = "select * from login where card_Number = '"+cardno+"' and pin = '"+pinno+"'";
                try{
                    ResultSet rs = c.s.executeQuery(q);
                     if(rs.next()){
                    setVisible(false);
                    new Transactions(pinno).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
                }
                }catch(Exception ae){
                    System.out.println(e);
                }
                
               
            
        }else if(e.getSource()==signup){
            setVisible(false);
            new SignupOne().setVisible(true);
    }
        

    }
}
