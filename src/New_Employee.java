import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class New_Employee extends JFrame implements ActionListener{
    
    JLabel title=new JLabel("NEW EMPLOYEE DETAILS");
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField t1,t2,t3,t4,t5,t6;
    JButton b1,b2;
    Choice c1;
    
    New_Employee(){
        
        super("New Employee");
        
        setSize(700,700);
        setLocation(600,200);
        getContentPane().setBackground(Color.WHITE);
        title.setFont(new Font("Courier New",Font.BOLD,20));
        add(title);
        title.setBounds(230,20,500,100);
     
        setLayout(new GridLayout(8,2,10,40));
        l1 = new JLabel("NAME");
        l1.setBounds(150,140,250,20);
        t1 = new JTextField(15);
        t1.setBounds(300,140,300,35);
        add(l1);
        add(t1);
       
        c1 = new Choice();
        c1.setBounds(300,220,300,35);
        c1.add("Male");
        c1.add("Female");
       
        l2 = new JLabel("GENDER");
        l2.setBounds(150,200,250,20);
        add(l2);
        add(c1);
        l3 = new JLabel("ADDRESS");
        l3.setBounds(150,280,250,20);
        t3 = new JTextField(15);
        t3.setBounds(300,280,300,35);
        add(l3);
        add(t3);
        l4 = new JLabel("STATE");
        l4.setBounds(150,350,250,20);
        t4 = new JTextField(15);
        t4.setBounds(300,350,300,35);
        add(l4);
        add(t4); 
        l5 = new JLabel("CITY");
        l5.setBounds(150,420,250,20);
        t5 = new JTextField(15);
        t5.setBounds(300,420,300,35);
        add(l5);
        add(t5);
        l6 = new JLabel("PHONE NO.");
        l6.setBounds(150,490,250,20);
        t6= new JTextField(15);
        t6.setBounds(300,490,300,35);
        add(l6);
        add(t6);
        b1 =new JButton("SUBMIT");
        b1.setBounds(50,560,250,35);
        b2 = new JButton("CANCEL");
        b2.setBounds(350,560,250,35);
        add(b1);
        add(b2);
 
        setLayout(new BorderLayout());
        add(new JLabel(new ImageIcon(ClassLoader.getSystemResource("icon/p2.jpg"))),"West");
             
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b2.addActionListener(this);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
       
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
       
        String n = t1.getText();
        String g = c1.getSelectedItem();
        String a = t3.getText();
        String s = t4.getText();
        String c = t5.getText();
        String p = t6.getText();
        String qry = "insert into employee values(null,'"+n+"','"+g+"','"+a+"','"+s+"','"+c+"','"+p+"')";
       
        try{
            conn c1 = new conn();
            c1.s.executeUpdate(qry);
            JOptionPane.showMessageDialog(null,"Employee Created");
            this.setVisible(false);  
        }catch(Exception ee){
            ee.printStackTrace();
        }
    }
    public static void main(String s[]){
        new New_Employee().setVisible(true);
    }

}
