package bank.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SignupTwo extends JFrame implements ActionListener{

    JTextField Tin, nic;
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    JComboBox religion, category, income, occupation, education;
    String formno;

    SignupTwo (String formno) {

        this.formno = formno;
        setLayout(null);

        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400,30);
        add(additionalDetails);

        JLabel labelreligion = new JLabel("Religion:");
        labelreligion.setFont(new Font("Raleway", Font.BOLD, 20));
        labelreligion.setBounds(100, 140, 100,30);
        add(labelreligion);

        String valReligion[] = {"Buddhism", "Hindu", "Muslim", "Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);

        JLabel labelcategory = new JLabel("Category:");
        labelcategory.setFont(new Font("Raleway", Font.BOLD, 20));
        labelcategory.setBounds(100, 190, 200,30);
        add(labelcategory);

        String valcategory[] = {"General", "OBC", "SC", "ST", "Other"};
        category = new JComboBox(valcategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);

        JLabel labelincome = new JLabel("Income:");
        labelincome.setFont(new Font("Raleway", Font.BOLD, 20));
        labelincome.setBounds(100, 240, 200,30);
        add(labelincome);

        String incomeCategory[] = {"Null", "< 150,000", "< 400,000", "< 600,000", "Upto 10,000,000"};
        income = new JComboBox(incomeCategory);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);

        JLabel labeleducation = new JLabel("Educational:");
        labeleducation.setFont(new Font("Raleway", Font.BOLD, 20));
        labeleducation.setBounds(100, 290, 200,30);
        add(labeleducation);

        JLabel labelqualification = new JLabel("Qualification:");
        labelqualification.setFont(new Font("Raleway", Font.BOLD, 20));
        labelqualification.setBounds(100, 315, 200,30);
        add(labelqualification);

        String eduactionValues[] = {"Non-Graduation", "Graduate", "Post-Graduate", "Doctorate", "Other"};
        education = new JComboBox(eduactionValues);
        education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);

        JLabel labeloccupation = new JLabel("Occupation:");
        labeloccupation.setFont(new Font("Raleway", Font.BOLD, 20));
        labeloccupation.setBounds(100, 390, 200,30);
        add(labeloccupation);

        String occupationValues[] = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Other"};
        occupation = new JComboBox(occupationValues);
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);

        JLabel labelTin = new JLabel("TIN Number:");
        labelTin.setFont(new Font("Raleway", Font.BOLD, 20));
        labelTin.setBounds(100, 440, 200,30);
        add(labelTin);


        Tin = new JTextField();
        Tin.setFont(new Font("Raleway",Font.BOLD, 14));
        Tin.setBounds(300, 440, 400, 30);
        add(Tin);


        JLabel labelnic = new JLabel("NIC Number:");
        labelnic.setFont(new Font("Raleway", Font.BOLD, 20));
        labelnic.setBounds(100, 490, 200,30);
        add(labelnic);

        nic = new JTextField();
        nic.setFont(new Font("Raleway",Font.BOLD, 14));
        nic.setBounds(300, 490, 400, 30);
        add(nic);

        JLabel labelcitizen = new JLabel("Senior Citizen:");
        labelcitizen.setFont(new Font("Raleway", Font.BOLD, 20));
        labelcitizen.setBounds(100, 540, 200,30);
        add(labelcitizen);

        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);

        ButtonGroup citizengroup =  new ButtonGroup();
        citizengroup.add(syes);
        citizengroup.add(sno);

        JLabel labelexaccount = new JLabel("Existing Account:");
        labelexaccount.setFont(new Font("Raleway", Font.BOLD, 20));
        labelexaccount.setBounds(100, 590, 200,30);
        add(labelexaccount);

        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.WHITE);
        add(eno);

        ButtonGroup exaccountgroup =  new ButtonGroup();
        exaccountgroup.add(eyes);
        exaccountgroup.add(eno);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30 );
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);

        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        String seniorcitizen = null;
        if(syes.isSelected()){
            seniorcitizen="Yes";
        } else if (sno.isSelected()) {
            seniorcitizen = "No";
        }

        String existingaccount = null;
        if(eyes.isSelected()){
            existingaccount="Yes";
        } else if (eno.isSelected()) {
            existingaccount = "No";
        }

        String stin = Tin.getText();
        String snic = nic.getText();

        try{
                Conn c = new Conn();
                String query = "insert into signuptwo values('"+formno+"', '"+sreligion+"','"+scategory+"', '"+sincome+"', '"+seducation+"','"+soccupation+"','"+stin+"', '"+snic+"', '"+seniorcitizen+"', '"+existingaccount+"')";
                c.s.executeUpdate(query);

                //Signup 3 object
                setVisible(false);
                new SignupThree(formno).setVisible(true);

        }catch (Exception e){
            System.out.println(e);
        }
    }


    public static void main(String args[]) {
        new SignupTwo("");
    }

}




