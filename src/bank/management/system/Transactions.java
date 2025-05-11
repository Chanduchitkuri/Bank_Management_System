package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Transactions extends JFrame implements ActionListener{

    JLabel l1;
    JButton deposit,Withdraw,fastCash,b4,pinchange,balanceEnquiry,b7;
    String pin;
    Transactions(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l2 = new JLabel(i3);
        l2.setBounds(0, 0, 960, 1080);
        add(l2);
        
        l1 = new JLabel("Please Select Your Transaction");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 16));
        
       
        deposit = new JButton("DEPOSIT");
        Withdraw = new JButton("CASH WITHDRAWL");
        fastCash = new JButton("FAST CASH");
        b4 = new JButton("MINI STATEMENT");
        pinchange = new JButton("PIN CHANGE");
        balanceEnquiry = new JButton("BALANCE ENQUIRY");
        b7 = new JButton("EXIT");
        
        setLayout(null);
        
        l1.setBounds(235,400,700,35);
        l2.add(l1);
        
        deposit.setBounds(170,499,150,35);
        l2.add(deposit);
        
        Withdraw.setBounds(390,499,150,35);
        l2.add(Withdraw);
        
        fastCash.setBounds(170,543,150,35);
        l2.add(fastCash);
        
        b4.setBounds(390,543,150,35);
        l2.add(b4);
        
        pinchange.setBounds(170,588,150,35);
        l2.add(pinchange);
        
        balanceEnquiry.setBounds(390,588,150,35);
        l2.add(balanceEnquiry);
        
        b7.setBounds(390,633,150,35);
        l2.add(b7);
        
        
        deposit.addActionListener(this);
        Withdraw.addActionListener(this);
        fastCash.addActionListener(this);
        b4.addActionListener(this);
        pinchange.addActionListener(this);
        balanceEnquiry.addActionListener(this);
        b7.addActionListener(this);
        
        
        setSize(960,1080);
        setLocation(500,0);
//        setUndecorated(true);
        setVisible(true);
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==deposit){ 
            setVisible(false);
            new Deposit(pin).setVisible(true);
        }else if(ae.getSource()==Withdraw){ 
            setVisible(false);
            new Withdrawl(pin).setVisible(true);//class
        }
        else if(ae.getSource()==fastCash){ 
            setVisible(false);
            new FastCash(pin).setVisible(true);
        }
        else if(ae.getSource()==b4){ 
            new MiniStatement(pin).setVisible(true);
        }
        else if(ae.getSource()==pinchange){ 
            setVisible(false);
            new PinChange(pin).setVisible(true);
        }
        else if(ae.getSource()==balanceEnquiry){ 
            this.setVisible(false);
            new BalanceEnquiry(pin).setVisible(true);
        }
        else if(ae.getSource()==b7){ 
            System.exit(0);
        }
    }
    
    
    public static void main(String[] args){
        new Transactions("").setVisible(true);
//        new Transactions("");
    }
}