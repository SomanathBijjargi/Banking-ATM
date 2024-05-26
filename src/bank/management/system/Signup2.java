package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener
{
    JComboBox combobox,combobox2,combobox3,combobox4,combobox5;
    JTextField textPan,textAadhar;
    JRadioButton r1,r2,e1,e2;
    JButton next;
    String formno;

    Signup2(String formno){

        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("page 2:");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2 = new JLabel("Additional Detais: ");
        l2.setFont(new Font ("Raleway",Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);

        //For relegion .....
        JLabel l3 = new JLabel("Religion :");
        l3.setFont(new Font("Raleway", Font.BOLD,18));
        l3.setBounds(100,120,100,30);
        add(l3);

        String religion[] = {"Hindu","Muslim","Sikh","Others"};

        combobox = new JComboBox(religion);
        combobox.setBackground(new Color(252,208,76));
        combobox.setFont(new Font("Raleway",Font.BOLD,14));
        combobox.setBounds(350,120,320,30);
        add(combobox);

        //For Category.....
        JLabel l4 = new JLabel("Category :");
        l4.setFont(new Font("Raleway", Font.BOLD,18));
        l4.setBounds(100,170,100,30);
        add(l4);

        String Category[] = {"General","OBC","SC","ST","Other"};

        combobox2 = new JComboBox(Category);
        combobox2.setBackground(new Color(252,208,76));
        combobox2.setFont(new Font("Raleway",Font.BOLD,14));
        combobox2.setBounds(350,170,320,30);
        add(combobox2);

        //For income .....
        JLabel l5 = new JLabel("Income :");
        l5.setFont(new Font("Raleway", Font.BOLD,18));
        l5.setBounds(100,220,100,30);
        add(l5);

        String income [] = {"Null","<1,50,000","<2,50,000", "5,00,000", "Uptp 10,00,000","Above 10,00,000"};
        combobox3 = new JComboBox(income);
        combobox3.setBackground(new Color(252,208,76));
        combobox3.setFont(new Font("Raleway",Font.BOLD,14));
        combobox3.setBounds(350,220,320,30);
        add(combobox3);

        //For education....
        JLabel l6 = new JLabel("Educational : ");
        l6.setFont(new Font("Raleway", Font.BOLD,18));
        l6.setBounds(100,270,150,30);
        add(l6);

        String educational [] = {"Non-Graduate","Graduate","Post-Graduate", "Doctrate", "Others"};
        combobox4 = new JComboBox(educational);
        combobox4.setBackground(new Color(252,208,76));
        combobox4.setFont(new Font("Raleway",Font.BOLD,14));
        combobox4.setBounds(350,270,320,30);
        add(combobox4);

        //For Occupation.....
        JLabel l7 = new JLabel("Occupation : ");
        l7.setFont(new Font("Raleway", Font.BOLD,18));
        l7.setBounds(100,340,150,30);
        add(l7);

        String Occupation [] = {"Salaried","Self-Employed","Business", "Student", "Retired", "Other"};
        combobox5 = new JComboBox(Occupation);
        combobox5.setBackground(new Color(252,208,76));
        combobox5.setFont(new Font("Raleway",Font.BOLD,14));
        combobox5.setBounds(350,340,320,30);
        add(combobox5);

        //For panCard.....
        JLabel l8 = new JLabel("PAN Number : ");
        l8.setFont(new Font("Raleway", Font.BOLD,18));
        l8.setBounds(100,390,150,30);
        add(l8);

        textPan = new JTextField();
        textPan.setFont(new Font("Raleway", Font.BOLD,18));
        textPan.setBounds(350,390,320,30);
        add(textPan);

        //For Adhar no .....
        JLabel l9 = new JLabel("Aadhar Number : ");
        l9.setFont(new Font("Raleway", Font.BOLD,18));
        l9.setBounds(100,440,180,30);
        add(l9);

        textAadhar = new JTextField();
        textAadhar.setFont(new Font("Raleway", Font.BOLD,18));
        textAadhar.setBounds(350,440,320,30);
        add(textAadhar);

        //For Senior Citizen.....
        JLabel l10 = new JLabel("Senior Citizen : ");
        l10.setFont(new Font("Raleway", Font.BOLD,18));
        l10.setBounds(100,490,180,30);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway", Font.BOLD,14));
        r1.setBackground(new Color(252,208,76));
        r1.setBounds(350,490,100,30);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway", Font.BOLD,14));
        r2.setBackground(new Color(252,208,76));
        r2.setBounds(460,490,100,30);
        add(r2);

        //For existing Account.....
        JLabel l11 = new JLabel("Existing Account : ");
        l11.setFont(new Font("Raleway", Font.BOLD,18));
        l11.setBounds(100,540,180,30);
        add(l11);

        e1 = new JRadioButton("Yes");
        e1.setFont(new Font("Raleway", Font.BOLD,14));
        e1.setBackground(new Color(252,208,76));
        e1.setBounds(350,540,100,30);
        add(e1);

        e2 = new JRadioButton("No");
        e2.setFont(new Font("Raleway", Font.BOLD,14));
        e2.setBackground(new Color(252,208,76));
        e2.setBounds(460,540,100,30);
        add(e2);

        //For form no .....
        JLabel l12 = new JLabel("Form No : ");
        l12.setFont(new Font("Raleway", Font.BOLD,14));
        l12.setBounds(700,10,100,30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD,14));
        l13.setBounds(760,10,60,30);
        add(l13);

        //For NEXT button.....
        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);

        //For Layout.....
        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(252,208,76));
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) combobox.getSelectedItem();
        String cate = (String) combobox2.getSelectedItem();
        String inc =(String) combobox3.getSelectedItem();
        String edu = (String) combobox4.getSelectedItem();
        String occ = (String) combobox5.getSelectedItem();

        String pan = textPan.getText();
        String addhar = textAadhar.getText();

        String scitizen = "";
        if(r1.isSelected()){
            scitizen = "Yes";
        }else if (r2.isSelected()){
            scitizen = "No";
        }

        String eAccount = "";
        if(r1.isSelected()){
            eAccount = "Yes";
        }else if (r2.isSelected()){
            eAccount = "No";
        }

        try{
            if(textPan.getText().equals("") || textAadhar.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else{
                Con c1 = new Con();
                String q = "insert into signuptwo values('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+addhar+"','"+scitizen+"','"+eAccount+"');" ;
                c1.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);
            }
        }catch(Exception E){
           E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup2("");
    }
}
