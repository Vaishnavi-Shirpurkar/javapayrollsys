import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener {
       
    Project(){
        setSize(2000,1100);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/p5.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200,700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        add(l1);
    
        JMenuBar mb = new JMenuBar();
        setJMenuBar(mb);
        JMenu m1 = new JMenu("Master");
        m1.setForeground(Color.blue);
        m1.setFont(new Font("Courier New",Font.BOLD,20));
        JMenuItem t1 = new JMenuItem("New Employee");
        t1.setForeground(Color.blue);
        t1.setFont(new Font("Comic Sans MS",Font.BOLD,17));       
        JMenuItem t3 = new JMenuItem("Salary");
        t3.setForeground(Color.blue);
        t3.setFont(new Font("Comic Sans MS",Font.BOLD,17));
        JMenuItem t4 = new JMenuItem("List Employee");
        t4.setForeground(Color.blue);
        t4.setFont(new Font("Comic Sans MS",Font.BOLD,17));
        m1.add(t1);
        //m1.add(t2);
        m1.add(t3);
        m1.add(t4);
        mb.add(m1);
        t1.addActionListener(this);
        //t2.addActionListener(this);
        t3.addActionListener(this);
        t4.addActionListener(this);
        
        JMenu edit =new JMenu("Update");
        edit.setForeground(Color.RED);
        edit.setFont(new Font("Courier New",Font.BOLD,20));
        mb.add(edit);
        JMenuItem s1 = new JMenuItem("Update Salary");
        s1.setForeground(Color.blue);
        s1.setFont(new Font("Comic Sans MS",Font.BOLD,17));      
        edit.add(s1);
        JMenuItem s2 = new JMenuItem("Update Employee");
        s2.setForeground(Color.blue);
        s2.setFont(new Font("Comic Sans MS",Font.BOLD,17));      
        edit.add(s2);
        JMenuItem s3 = new JMenuItem("Take Attendence");
        s3.setForeground(Color.blue);
        s3.setFont(new Font("Comic Sans MS",Font.BOLD,17));          
        edit.add(s3);
        s1.addActionListener(this);
        s2.addActionListener(this);
        s3.addActionListener(this);
        
        
        JMenu rep =new JMenu("Reports");
        rep.setForeground(Color.blue);
        rep.setFont(new Font("Courier New",Font.BOLD,20));
        mb.add(rep);
        JMenuItem p1 = new JMenuItem("Generate PaySlip");
        p1.setForeground(Color.blue);
        p1.setFont(new Font("Comic Sans MS",Font.BOLD,17));
        rep.add(p1);
        JMenuItem p2 = new JMenuItem("List Attendence");
        p2.setForeground(Color.blue);
        p2.setFont(new Font("Comic Sans MS",Font.BOLD,17));
        rep.add(p2);
        p1.addActionListener(this);
        p2.addActionListener(this);
   
    
        JMenu m8=new JMenu("Exit");
        m8.setForeground(Color.red);
        m8.setFont(new Font("Courier New",Font.BOLD,20));
        mb.add(m8);
        JMenuItem m8i1=new JMenuItem("Exit");
        m8.add(m8i1);
        m8i1.setForeground((Color.blue));
        m8i1.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
        m8i1.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/p4.jpg")));
        m8i1.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        String msg= ae.getActionCommand();
      
        if(msg.equals("New Employee"))
            new New_Employee().setVisible(true);
        else if(msg.equals("List Employee"))
            new List_Employee().setVisible(true);
        else if(msg.equals("Update Employee"))
            new Update_Employee().setVisible(true);
        else if(msg.equals("Salary"))
            new Salary().setVisible(true);
        else if(msg.equals("Update Salary"))
            new Update_salary().setVisible(true);
        else if(msg.equals("Take Attendence"))
            new TakeAttendence().setVisible(true);
        else if(msg.equals("Exit"))
            System.exit(0);
        else if(msg.equals("Generate PaySlip"))
            new pay_slip().setVisible(true);
        else if(msg.equals("List Attendence"))
            new List_Attendence().setVisible(true);
    }
    
    public static void main(String[] args){
        new Project().setVisible(true);
    }  
}