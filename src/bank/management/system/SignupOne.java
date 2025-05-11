package bank.management.system;

import java.awt.*;
import java.util.Random;
import javax.swing.*;
import javax.swing.JLabel;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener{
    
    long random;
    JTextField nameTextField,fnameTextField,emailTextField,addrTextField,cityTextField,stateTextField,pincodeTextField;
    JRadioButton male,female,other,single,married;
    JDateChooser dateChooser;
    JButton next;
    
    public SignupOne()//Constructor
    {
        setLayout(null);
        
        Random ran=new Random();
        random=Math.abs((ran.nextLong() % 9000L)+1000L);
        JLabel formno=new JLabel("Application Form No. "+random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        JLabel personDetails=new JLabel("page 1: Personal Details");
        personDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personDetails.setBounds(290,80,400,30);
        add(personDetails);
        
        JLabel name=new JLabel("Name: ");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
        nameTextField=new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        
        JLabel fname=new JLabel("Father's Name: ");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        fnameTextField=new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);
        
        JLabel dob=new JLabel("Date of Birth: ");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        dateChooser=new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setFont(new Font("Raleway",Font.BOLD,14));
        add(dateChooser);
        
        JLabel gender=new JLabel("Gender: ");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
        male=new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);
        female=new JRadioButton("Female");
        female.setBounds(400,290,120,30);
        female.setBackground(Color.WHITE);
        add(female);
        other=new JRadioButton("Other");
        other.setBounds(520,290,120,30);
        other.setBackground(Color.WHITE);
        add(other);
        
        ButtonGroup bg=new ButtonGroup();
        bg.add(male);
        bg.add(female);
        bg.add(other);
        
        JLabel email=new JLabel("Email Address: ");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);
        
        emailTextField=new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);
        
        JLabel maritalstatus=new JLabel("Marital Status: ");
        maritalstatus.setFont(new Font("Raleway",Font.BOLD,20));
        maritalstatus.setBounds(100,390,200,30);
        add(maritalstatus);
        
        single=new JRadioButton("Single");
        single.setBounds(300,390,100,30);
        single.setBackground(Color.WHITE);
        add(single);
        married=new JRadioButton("Married");
        married.setBounds(400,390,100,30);
        married.setBackground(Color.WHITE);
        add(married);
        
        ButtonGroup bgM=new ButtonGroup();
        bgM.add(single);
        bgM.add(married);
        
        JLabel addr=new JLabel("Address: ");
        addr.setFont(new Font("Raleway",Font.BOLD,20));
        addr.setBounds(100,440,200,30);
        add(addr);
        
        addrTextField=new JTextField();
        addrTextField.setFont(new Font("Raleway",Font.BOLD,14));
        addrTextField.setBounds(300,440,400,30);
        add(addrTextField);
        
        JLabel city=new JLabel("City: ");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);
        
        cityTextField=new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);
        
        JLabel state=new JLabel("State: ");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);
        
        stateTextField=new JTextField();
        stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);
        
        JLabel pincode=new JLabel("Pincode: ");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
        pincodeTextField=new JTextField();
        pincodeTextField.setFont(new Font("Raleway",Font.BOLD,14));
        pincodeTextField.setBounds(300,590,400,30);
        add(pincodeTextField);
        
        next=new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,620,80,30);
        next.addActionListener(this);
        add(next);
        
       // setLayout(new FlowLayout()); //FlowLayout, GridLayout Null
        getContentPane().setBackground(Color.white);
       
        setVisible(true);//comming from jframe''''
        setSize(850, 850);
        setLocation(350,10);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// to close the window directly and terminate.
   
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String formno=""+random;//long
        String name=nameTextField.getText();//setText
        String fname=fnameTextField.getText();
        String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(male.isSelected()){
            gender="male";
        }else if (female.isSelected()){
            gender="female";
        }else if(other.isSelected()){
            gender="other";
        }
        
        String email=emailTextField.getText();
        String marital=null;
        if(single.isSelected()){
            marital="Single";
        }else if(married.isSelected()){
            marital="Married";
    }
        String addr=addrTextField.getText();
        String city=cityTextField.getText();
        String state=stateTextField.getText();
        String pin=pincodeTextField.getText();
        
        try{
            if(name.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Name is Required");
            }
            else
            {
                Conn c=new Conn();
                String query="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+addr+"','"+city+"','"+state+"','"+pin+"')";
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SignupTwo(formno).setVisible(true);
            }
        }
        catch(Exception ee)
        {
            System.out.println(ee);
        }
    }
    
    
      public static void main(String[] args)
    {
        new SignupOne();
    }
}
