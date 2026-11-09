package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class signup2 extends JFrame implements ActionListener {
    String formno ;

    public JComboBox comboBox ,comboBox2 ,comboBox3 ,comboBox4 ,comboBox5;

    JRadioButton r1,r2 , r3, r4 ;

    JTextField textPan ,textAdhar;

    JButton next ;

    signup2(String first){

        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(60,2,120,120);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("Page 2 :");
        l1.setFont(new Font("Raleway" , Font.BOLD ,22));
        l1.setBounds(370,30,600,40);
        add(l1);


        JLabel l2 = new JLabel("Additional information");
        l2.setFont(new Font("Raleway" , Font.BOLD ,22));
        l2.setBounds(300,60,600,40);
        add(l2);


        JLabel l3 = new JLabel("Religion :");
        l3.setFont(new Font("Raleway",Font.BOLD,15));
        l3.setBounds(100,120,100,25);
        add(l3);

        String[] religion = {"Hindu","Muslim","Sikh","Christien","Other"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(236, 219, 190));
        comboBox.setFont(new Font("raleway",Font.BOLD,14));
        comboBox.setBounds(350,120,500,25);
        add(comboBox);


        JLabel l4 = new JLabel("Category :");
        l4.setFont(new Font("Raleway",Font.BOLD,15));
        l4.setBounds(100,170,100,25);
        add(l4);

        String[] category = {"Genral","OBC","SC","ST","Others"};
        comboBox2 = new JComboBox(category);
        comboBox2.setBackground(new Color(236, 219, 190));
        comboBox2.setFont(new Font("raleway",Font.BOLD,14));
        comboBox2.setBounds(350,170,500,25);
        add(comboBox2);


        JLabel l5 = new JLabel("Income :");
        l5.setFont(new Font("Raleway",Font.BOLD,15));
        l5.setBounds(100,220,100,25);
        add(l5);

        String[] Income = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000,","Above to 10,00,000"};
        comboBox3 = new JComboBox(Income);
        comboBox3.setBackground(new Color(236, 219, 190));
        comboBox3.setFont(new Font("raleway",Font.BOLD,14));
        comboBox3.setBounds(350,220,500,25);
        add(comboBox3);


        JLabel l6 = new JLabel("Educational :");
        l6.setFont(new Font("Raleway",Font.BOLD,15));
        l6.setBounds(100,270,150,25);
        add(l6);

        String[] Educations = {"Non-Graduate","Graduate","Post-Graduate","Docterate","Others"};
        comboBox4 = new JComboBox(Educations);
        comboBox4.setBackground(new Color(236, 219, 190));
        comboBox4.setFont(new Font("raleway",Font.BOLD,14));
        comboBox4.setBounds(350,270,500,25);
        add(comboBox4);


        JLabel l7 = new JLabel("Occupations :");
        l7.setFont(new Font("Raleway",Font.BOLD,15));
        l7.setBounds(100,320,150,25);
        add(l7);

        String[] Occupations = {"Salaried","Self-Employee","Business","Retired","Others"};
        comboBox5 = new JComboBox(Occupations);
        comboBox5.setBackground(new Color(236, 219, 190));
        comboBox5.setFont(new Font("raleway",Font.BOLD,14));
        comboBox5.setBounds(350,320,500,25);
        add(comboBox5);

        JLabel l8 = new JLabel("PAN Number :");
        l8.setFont(new Font("Raleway",Font.BOLD,15));
        l8.setBounds(100,370,150,25);
        add(l8);

        textPan = new JTextField();
        textPan.setFont(new Font("Raleway",Font.BOLD,18));
        textPan.setBounds(350,370,500,25);
        add(textPan);


        JLabel l9 = new JLabel("Adhar  Number :");
        l9.setFont(new Font("Raleway",Font.BOLD,15));
        l9.setBounds(100,410,150,25);
        add(l9);

        textAdhar = new JTextField();
        textAdhar.setFont(new Font("Raleway",Font.BOLD,18));
        textAdhar.setBounds(350,410,500,25);
        add(textAdhar);


        JLabel l10 = new JLabel("Senior Citizen :");
        l10.setFont(new Font("Raleway",Font.BOLD,15));
        l10.setBounds(100,450,150,25);
        add(l10);

        r1 = new JRadioButton("yes");
        r1.setFont(new Font("Raleway",Font.BOLD,15));
        r1.setBackground(new Color(229, 219, 164));
        r1.setBounds(350,450,100,25);
        add(r1);

        r2 = new JRadioButton("NO");
        r2.setFont(new Font("Raleway",Font.BOLD,15));
        r2.setBackground(new Color(229, 219, 164));
        r2.setBounds(480,450,100,25);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);


        JLabel l11 = new JLabel("Existing Account :");
        l11.setFont(new Font("Raleway",Font.BOLD,15));
        l11.setBounds(100,490,180,25);
        add(l11);

        r3 = new JRadioButton("yes");
        r3.setFont(new Font("Raleway",Font.BOLD,15));
        r3.setBackground(new Color(229, 219, 164));
        r3.setBounds(350,490,100,25);
        add(r3);

        r4 = new JRadioButton("NO");
        r4.setFont(new Font("Raleway",Font.BOLD,15));
        r4.setBackground(new Color(229, 219, 164));
        r4.setBounds(480,490,100,25);
        add(r4);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(r3);
        buttonGroup2.add(r4);



        JLabel l12 = new JLabel("Form No :");
        l12.setFont(new Font("Raleway",Font.BOLD,15));
        l12.setBounds(700,10,160,25);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,15));
        l13.setBounds(760,10,60,25);
        add(l13);


        next = new JButton("next");
        next.setFont(new Font("Raleway",Font.BOLD,15));
        next.setBackground(new Color(178, 237, 235));
        next.setBounds(590,550,150,25);
        next.addActionListener(this);
        add(next) ;






        setLayout(null);
        setSize(850,750);
        setLocation(180,80);
        getContentPane().setBackground(new Color(229, 219, 164));
        setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {


        String Rel =(String) comboBox.getSelectedItem();
        String Category =(String) comboBox2.getSelectedItem();
        String Income =(String) comboBox3.getSelectedItem();
        String Education =(String) comboBox4.getSelectedItem();
        String Occupation =(String) comboBox5.getSelectedItem();
        String PAN = textPan.getText();
        String Adhar = textAdhar.getText();

        String Senior_Citizen= null ;
        if(r1.isSelected()){
            Senior_Citizen ="Yes";

        }else if (r2.isSelected()){

            Senior_Citizen= "No" ;
        }

        String Existing_Account= null ;
        if(r3.isSelected()){
            Existing_Account ="Yes";

        }else if (r4.isSelected()){

            Existing_Account= "No" ;
        }



        try {

            if(textPan.getText().isEmpty() || textAdhar.getText().isEmpty()){

                JOptionPane.showMessageDialog(null,"fill all the field");
            }
            else{
                conn con1 = new conn();
                String q = "insert into signupTwo values('"+formno+"','"+Rel+"' ,'"+Category+"','"+Income+"','"+Education+"','"+Occupation+"','"+PAN+"', '"+Adhar+"','"+Senior_Citizen+"','"+Existing_Account+"')";
                con1.statement.executeUpdate(q);
                new signup3(formno);
                setVisible(false);
            }

        }
        catch (Exception E){

            E.printStackTrace();
        }



    }

    public static void main(String[] args) {
       new  signup2("") ;
    }


}
