package bank.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.JLabel;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
    
  
    JTextField nameTextField,fnameTextField,pan,aadhar;
    JRadioButton senior,senior2,eaccount,eaccount2;
    JDateChooser dateChooser;
    JButton next;
    JComboBox religion,education,income, category,occupation;
    String formno;
    
    public SignupTwo(String formno)//Constructor
    {
        this.formno=formno;
        setLayout(null);
        
        setTitle("New ACCOUNT APPLICATION FORM - PAGE 2");
               
//        JLabel formno=new JLabel("Page 2:Additional Details");
//        formno.setFont(new Font("Raleway",Font.BOLD,38));
//        formno.setBounds(140,20,600,40);
//        add(formno);
        
        JLabel additionalDetails=new JLabel("Page 2:Additional Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
        JLabel name=new JLabel("Religion: ");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
        String valReligion[]={"Hindu","Muslim","sikh","Christian","other"};
        religion=new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);
                
        nameTextField=new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        
        JLabel fname=new JLabel("Category: ");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        String valcategory[]={"General","OBC","SC","ST","Other"};
        category=new JComboBox(valcategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);

        
        fnameTextField=new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);
        
        JLabel dob=new JLabel("Income: ");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        String valIncome[]={"NULL","<1,50,000","2,50,000","<5,00,000","upto 10,00,000"};
        income=new JComboBox(valIncome);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.WHITE);
        add(income);
        
        dateChooser=new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setFont(new Font("Raleway",Font.BOLD,14));
        add(dateChooser);
        
        JLabel gender=new JLabel("Educational: ");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
                
        JLabel email=new JLabel("Qualification: ");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,315,200,30);
        add(email);
        
        String Educationval[]={"Undergaduate","Graduate","POst Graduation","Doctorate","Others"};
        education=new JComboBox(Educationval);
        education.setBounds(300,315,400,30);
        education.setBackground(Color.WHITE);
        add(education);
        
 
        
        JLabel maritalstatus=new JLabel("Occupation: ");
        maritalstatus.setFont(new Font("Raleway",Font.BOLD,20));
        maritalstatus.setBounds(100,390,200,30);
        add(maritalstatus);
        
        String occupationval[]={"salaried","self-Employed","Bussiness","student","Retired","Others"};
        occupation=new JComboBox(occupationval);
        occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
        JLabel addr=new JLabel("PAN Number: ");
        addr.setFont(new Font("Raleway",Font.BOLD,20));
        addr.setBounds(100,440,200,30);
        add(addr);
        
        pan=new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD,14));
        pan.setBounds(300,440,400,30);
        add(pan);
        
        JLabel city=new JLabel("Aadhar Number: ");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);
        
        aadhar=new JTextField();
        aadhar.setFont(new Font("Raleway",Font.BOLD,14));
        aadhar.setBounds(300,490,400,30);
        add(aadhar);
        
        JLabel state=new JLabel("Senior Citizen: ");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);
        
        senior=new JRadioButton("YES");
        senior.setBounds(300,540,100,30);
        senior.setBackground(Color.WHITE);
        add(senior);
        senior2=new JRadioButton("NO");
        senior2.setBounds(400,540,100,30);
        senior2.setBackground(Color.WHITE);
        add(senior2);
        
        ButtonGroup bgM=new ButtonGroup();
        bgM.add(senior);
        bgM.add(senior2);
        
        JLabel pincode=new JLabel("Existing Account: ");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
        eaccount=new JRadioButton("YES");
        eaccount.setBounds(300,590,100,30);
        eaccount.setBackground(Color.WHITE);
        add(eaccount);
        eaccount2=new JRadioButton("NO");
        eaccount2.setBounds(400,590,100,30);
        eaccount2.setBackground(Color.WHITE);
        add(eaccount2);
        
        ButtonGroup ebgM=new ButtonGroup();
        ebgM.add(eaccount);
        ebgM.add(eaccount2);
        
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
       
        String sreligion=(String)religion.getSelectedItem();//setText
        String scategory=(String)category.getSelectedItem();
        String sincome=(String)income.getSelectedItem();
        String seducation=(String)education.getSelectedItem();
        String soccupation=(String)occupation.getSelectedItem();
        String seniorcitizen=null;
        if(senior.isSelected()){
            seniorcitizen="YES";
        }else if (senior2.isSelected()){
            seniorcitizen="NO";
        }
       
        String existingaccount=null;
        if(eaccount.isSelected()){
            existingaccount="YES";
        }else if(eaccount2.isSelected()){
            existingaccount="NO";
    }
        String span=pan.getText();
        String saadhar=aadhar.getText();
        
        try{
            Conn c=new Conn();
            String query="insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
            c.s.executeUpdate(query);
            
            //Signup3 object
              new Signup3(formno).setVisible(true);
                setVisible(false);
        }
        catch(Exception ee)
        {
            System.out.println(ee);
        }
    }
    
    
      public static void main(String[] args)
    {
        new SignupTwo("");
    }
}
