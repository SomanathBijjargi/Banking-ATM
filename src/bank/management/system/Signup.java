package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
public class Signup extends JFrame implements ActionListener {


    JRadioButton r1,r2,m1,m2,m3;
    JButton next;
    JTextField textname,textFname,Etext,Tadress,Tcity,Tpin,TState;
    JDateChooser date;
    Random ran = new Random();
    long f4 = (ran.nextLong()%9000L)+1000L;
    String first = " " + Math.abs(f4);

    Signup(){

        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO : "+ first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2  = new JLabel("Page 1");
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        label2.setBounds(330,70,600,30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(290,90,600,30);
        add(label3);

        //textfiels for ur name
        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        labelName.setBounds(100,190,100,30);
        add(labelName);

        textname = new JTextField();
        textname.setFont(new Font("Raleway",Font.BOLD,14));
        textname.setBounds(300,190,400,30);
        add(textname);

        //textfield for ur father name
        JLabel labelfName = new JLabel("Father's Name :");
        labelfName.setFont(new Font("Raleway",Font.BOLD,20));
        labelfName.setBounds(100,240,180,30);
        add(labelfName);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway",Font.BOLD,14));
        textFname.setBounds(300,240,400,30);
        add(textFname);

        //textfield for DOB
        JLabel DOB = new JLabel("Date of Birth :");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(100,340,180,30);
        add(DOB);

        date = new JDateChooser();
        date.setForeground(new Color( 105,105,105));
        date.setBounds(300,340,400,30);
        add(date);

        //For Gender...
        JLabel LabelG = new JLabel("Gender:");
        LabelG.setFont(new Font("Raleway",Font.BOLD,20));
        LabelG.setBounds(100,290,200,30);
        add(LabelG);

        r1=new JRadioButton("male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(222,225,228));
        r1.setBounds(300,290,60,30);
        add(r1);

        r2=new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(222,225,228));
        r2.setBounds(450,290,90,30);
        add(r2);

        ButtonGroup ButtonGroup = new ButtonGroup();
        ButtonGroup.add(r1);
        ButtonGroup.add(r2);

        //Email ....
        JLabel Email = new JLabel("Email Adress");
        Email.setFont(new Font("Raleway",Font.BOLD,20));
        Email.setBounds(100,390,200,30);
        add(Email);

        Etext = new JTextField();
        Etext.setFont(new Font("Raleway",Font.BOLD,14));
        Etext.setBounds(300,390,400,30);
        add(Etext);

        //Marital Status....
        JLabel MS = new JLabel("Marital Status");
        MS.setFont(new Font("Raleway",Font.BOLD,20));
        MS.setBounds(100,440,200,30);
        add(MS);

        m1 = new JRadioButton("Married");
        m1.setBounds(300,440,100,30);
        m1.setBackground(new Color(222,255,228));
        m1.setFont(new Font("Raleway",Font.BOLD,14));
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setBounds(450,440,100,30);
        m2.setBackground(new Color(222,255,228));
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        add(m2);

        m3 = new JRadioButton("Others");
        m3.setBounds(635,440,100,30);
        m3.setBackground(new Color(222,255,228));
        m3.setFont(new Font("Raleway",Font.BOLD,14));
        add(m3);

        ButtonGroup ButtonGroup1 = new ButtonGroup();
        ButtonGroup1.add(m1);
        ButtonGroup1.add(m2);
        ButtonGroup1.add(m3);


        JLabel adress = new JLabel("Adress:");
        adress.setFont(new Font("Raleway",Font.BOLD,20));
        adress.setBounds(100,490,200,30);
        add(adress);

        Tadress = new JTextField();
        Tadress.setFont(new Font("Raleway",Font.BOLD,14));
        Tadress.setBounds(300,490,400,30);
        add(Tadress);

        //city name .....
        JLabel cityName = new JLabel("City Name:");
        cityName.setFont(new Font("Raleway",Font.BOLD,20));
        cityName.setBounds(100,540,200,30);
        add(cityName);

        Tcity = new JTextField();
        Tcity.setFont(new Font("Raleway",Font.BOLD,14));
        Tcity.setBounds(300,540,400,30);
        add(Tcity);

        //pincode.....
        JLabel pin = new JLabel("PinCode:");
        pin.setFont(new Font("Raleway",Font.BOLD,20));
        pin.setBounds(100,590,200,30);
        add(pin);

        Tpin = new JTextField();
        Tpin.setFont(new Font("Raleway",Font.BOLD,14));
        Tpin.setBounds(300,590,400,30);
        add(Tpin);

        //State.....
        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,640,200,30);
        add(state);

        TState = new JTextField();
        TState.setFont(new Font("Raleway",Font.BOLD,14));
        TState.setBounds(300,640,400,30);
        add(TState);


        next = new JButton("NEXT");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);





        getContentPane().setBackground(new Color(222,225,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno = first;
        String name = textname.getText();
        String fname = textFname.getText();
        String dob = ((JTextField) date.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        }else if(r2.isSelected()){
            gender = "Female";
        }
        String email = Etext.getText();
        String marital = null;
        if(m1.isSelected()){
            marital = "Married";
        }else if(m2.isSelected()){
            marital = "Unmarried";
        }else if(m3.isSelected()){
            marital = "Other";
        }
        String address = Tadress.getText();
        String city = Tcity.getText();
        String pincode = Tpin.getText();
        String state = TState.getText();

        try{
            if(textname.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the Fields : ");
            }else{
                Con con1 = new Con();
                String q = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                con1.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);

            }

        }catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup();
    }
}
