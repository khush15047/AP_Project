import com.sun.org.apache.regexp.internal.RE;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

/**
 *
 * @author khushvinder
 */
public class FMS extends JFrame {
    private JFrame frame1, frame2, frame3, frame4;
    private JPanel panel1, panel2, panel3, panel4;
    private JLabel label1, label2, head, head2, head3, name1, name2, name3, name4, label4, label5, label6, label7, label8, label9, label10, label11, lab_log, lab_pass;
    private JButton Login, fi, logout, submit, cancel, Exit, B_Home, Exit1, cancel2;
    private JButton Register, Login2;
    JRadioButton one, two, three, four;
    private JTextField text1, text2, text3, text4, textField1, text_log, text_pass, textField2, textField3, textField4, textField5, textField6, textField7, textField8;
    private String Text1, Text2, t3, t4, t5, t6, t7, t8, t9, t10;

    //constructor
    public FMS() {
        frame1 = new JFrame("FMS");
        frame1.setSize(500, 300);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel1 = new JPanel();
        JLabel label1 = new JLabel();
        label1.setText("Facility Management Services System");
        Font myFont = new Font("Comic Sans MS", Font.PLAIN, 27);
        label1.setFont(myFont);
        panel1.setBackground(Color.BLACK);
        label1.setForeground(Color.GREEN);
        panel1.add(label1);
        JButton Login = new JButton("Login");
        Login.setBackground(Color.GREEN);
        Login.setForeground(Color.BLUE);
        panel1.add(Login);
        JButton Register = new JButton("Register");
        Register.setBackground(Color.GREEN);
        Register.setForeground(Color.BLUE);
        panel1.add(Register);
        frame1.add(panel1);
        Exit = new JButton("Exit");
        Exit.setBackground(Color.GREEN);
        Exit.setForeground(Color.BLUE);
        panel1.add(Exit);
        frame1.add(panel1);
        frame1.setVisible(true);
        Login.setActionCommand("Login");
        Login.addActionListener(new Action1());

        Register.setActionCommand("Register");
        Register.addActionListener(new Action4());

        Exit.setActionCommand("Exit");
        Exit.addActionListener(new Action4());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new FMS();//contructor call
    }

    class Action1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame1.getContentPane().removeAll();
            frame1.repaint();
            String command = e.getActionCommand();
            if (command.equals("Login")) {
                JPanel panel2 = new JPanel();
                panel2.setBackground(Color.BLACK);
                head = new JLabel();
                head.setText("USER LOGIN");
                Font myFont = new Font("Comic Sans MS", Font.PLAIN, 65);
                head.setFont(myFont);
                head.setForeground(Color.GREEN);
                panel2.add(head);
                lab_log = new JLabel("USERNAME");
                lab_log.setForeground(Color.GREEN);
                text_log = new JTextField(35);
                panel2.add(lab_log, BorderLayout.CENTER);
                panel2.add(text_log);
                lab_pass = new JLabel("PASSWORD");
                lab_pass.setForeground(Color.GREEN);
                panel2.add(lab_pass);
                text_pass = new JTextField(35);
                panel2.add(lab_pass, BorderLayout.CENTER);
                panel2.add(text_pass);
                Login2 = new JButton("Login");
                Login2.setBackground(Color.GREEN);
                Login2.setForeground(Color.BLUE);
                panel2.add(Login2);
                JButton Back = new JButton("Back");
                Back.setBackground(Color.GREEN);
                Back.setForeground(Color.BLUE);
                panel2.add(Back);
                Login2.setActionCommand("Login2");
                Login2.addActionListener(new Action2());
                Back.setActionCommand("cancel2");
                Back.addActionListener(new Action6());
                frame1.add(panel2);
                frame1.setVisible(true);
            }
        }
    }

    class Action4 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame1.getContentPane().removeAll();
            frame1.repaint();
            String command = e.getActionCommand();
            if (command.equals("Register")) {
                JPanel panel2 = new JPanel();
                panel2.setBackground(Color.BLACK);
                label4 = new JLabel("   ID                  ");
                textField1 = new JTextField(34);
                textField1.setBackground(Color.BLACK);
                textField1.setForeground(Color.GREEN);
                panel2.add(label4, BorderLayout.EAST);
                panel2.add(textField1);
                label5 = new JLabel("   TYPE            ");
                textField2 = new JTextField(34);
                textField2.setBackground(Color.BLACK);
                textField2.setForeground(Color.GREEN);
                panel2.add(label5, BorderLayout.CENTER);
                panel2.add(textField2);
                label6 = new JLabel("  NAME            ");
                textField3 = new JTextField(34);
                textField3.setBackground(Color.BLACK);
                textField3.setForeground(Color.GREEN);
                panel2.add(label6, BorderLayout.EAST);
                panel2.add(textField3);
                label7 = new JLabel("USERNAME    ");
                textField4 = new JTextField(34);
                textField4.setBackground(Color.BLACK);
                textField4.setForeground(Color.GREEN);
                panel2.add(label7, BorderLayout.EAST);
                panel2.add(textField4);
                label8 = new JLabel("PASSWORD   ");
                textField5 = new JTextField(34);
                textField5.setBackground(Color.BLACK);
                textField5.setForeground(Color.GREEN);
                panel2.add(label8, BorderLayout.EAST);
                panel2.add(textField5);
                label9 = new JLabel(" DOB                 ");
                textField6 = new JTextField(34);
                textField6.setBackground(Color.BLACK);
                textField6.setForeground(Color.GREEN);
                panel2.add(label9, BorderLayout.EAST);
                panel2.add(textField6);
                label10 = new JLabel("ADDRESS        ");
                textField7 = new JTextField(34);
                textField7.setBackground(Color.BLACK);
                textField6.setForeground(Color.GREEN);
                panel2.add(label10, BorderLayout.EAST);
                panel2.add(textField7);
                label11 = new JLabel("DEPARTMENT");
                textField8 = new JTextField(34);
                textField8.setBackground(Color.BLACK);
                textField8.setForeground(Color.GREEN);
                panel2.add(label11, BorderLayout.EAST);
                panel2.add(textField8);
                submit = new JButton("Submit");
                cancel2 = new JButton("Back");
                cancel = new JButton("Exit");
                cancel2.setForeground(Color.blue);
                cancel2.setBackground(Color.GREEN);
                YO();
                panel2.add(submit);
                panel2.add(cancel2);
                panel2.add(cancel);
                Color();
                frame1.add(panel2);
                frame1.setVisible(true);
            } else {
                System.exit(0);
            }
        }


        public void Color() {

            submit.setBackground(Color.GREEN);
            submit.setForeground(Color.BLUE);
            cancel.setBackground(Color.GREEN);
            cancel.setForeground(Color.BLUE);
            label4.setForeground(Color.GREEN);
            label5.setForeground(Color.GREEN);
            label6.setForeground(Color.GREEN);
            label7.setForeground(Color.GREEN);
            label8.setForeground(Color.GREEN);
            label9.setForeground(Color.GREEN);
            label10.setForeground(Color.GREEN);
            label11.setForeground(Color.GREEN);
        }

        public void YO() {

            submit.setActionCommand("submit");
            cancel2.setActionCommand("cancel2");
            cancel.setActionCommand("cancel");
            submit.addActionListener(new Action3());
            cancel2.addActionListener(new Action6());
            cancel.addActionListener(new Action3());
        }

    }

    class Action2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame1.getContentPane().removeAll();
            frame1.repaint();
            String command = e.getActionCommand();
            if (command.equals("Login2")) {
                Text1 = text_log.getText();//getting input from Usernam
                Text2 = text_pass.getText();//gettig input from Password
                panel3 = new JPanel();
                panel3.setBackground(Color.BLACK);
                head2 = new JLabel();
                head2.setText("                               Admin                                   ");
                Font myFont = new Font("Comic Sans MS", Font.PLAIN, 20);
                head2.setFont(myFont);
                head2.setForeground(Color.CYAN);
                panel3.add(head2);
                one = new JRadioButton("Home");
                one.setMnemonic(KeyEvent.VK_B);
                one.setBackground(Color.BLACK);
                one.setForeground(Color.GREEN);
                two = new JRadioButton("Staff");
                two.setMnemonic(KeyEvent.VK_B);
                two.setBackground(Color.BLACK);
                two.setForeground(Color.GREEN);
                three = new JRadioButton("Logistics");
                three.setMnemonic(KeyEvent.VK_B);
                three.setBackground(Color.BLACK);
                three.setForeground(Color.GREEN);
                four = new JRadioButton("Report");
                four.setMnemonic(KeyEvent.VK_B);
                four.setBackground(Color.BLACK);
                four.setForeground(Color.GREEN);
                logout = new JButton("Logout");
                logout.setBackground(Color.CYAN);
                logout.setForeground(Color.blue);
                call();
                panel3.add(one);
                panel3.add(two);
                panel3.add(three);
                panel3.add(four);
                panel3.add(logout);
                frame1.add(panel3);
                frame1.setVisible(true);
            }
        }

        public void call() {
            one.setActionCommand("Home");
            two.setActionCommand("Staff");
            three.setActionCommand("Logistics");
            four.setActionCommand("Report");
            logout.setActionCommand("Logout");
            one.addActionListener(new Action11());
            two.addActionListener(new Action9());
            //three.addActionListener(new Action7());
            //four.addActionListener(new Action7());
            logout.addActionListener(new Action7());
        }
    }

    class Action3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame1.getContentPane().removeAll();
            frame1.repaint();
            String command = e.getActionCommand();
            if (command.equals("submit")) {
                t3 = textField1.getText();//getting input from ID
                t4 = textField2.getText();//getting input from Type
                t5 = textField3.getText();//getting input from Name
                t6 = textField4.getText();//getting input from Username
                t7 = textField5.getText();//getting input from Password
                t8 = textField6.getText();//getting input from DOB
                t9 = textField7.getText();//getting input from Address
                t10 = textField8.getText();//getting input from Department
                panel4 = new JPanel();
                panel4.setBackground(Color.BLACK);
                head3 = new JLabel();
                head3.setText("YOU ARE SUCCESSFULLY REGISTERED!");
                Font myFont = new Font("Comic Sans MS", Font.PLAIN, 22);
                head3.setFont(myFont);
                head3.setForeground(Color.CYAN);
                B_Home = new JButton("Home");
                B_Home.setForeground(Color.BLUE);
                B_Home.setBackground(Color.GREEN);

                Exit1 = new JButton("Cancel");
                Exit1.setForeground(Color.BLUE);
                Exit1.setBackground(Color.GREEN);

                B_Home.setActionCommand("Home");
                B_Home.addActionListener(new Action5());

                Exit1.setActionCommand("Cancel");
                Exit1.addActionListener(new Action5());

                panel4.add(head3);
                panel4.add(B_Home);
                panel4.add(Exit1);
                frame1.add(panel4);
                frame1.setVisible(true);
            } else {
                System.exit(0);
            }
        }

    }

    class Action5 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame1.getContentPane().removeAll();
            frame1.repaint();
            String command = e.getActionCommand();
            if (command.equals("Home")) {
                frame1.setSize(500, 300);
                frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JPanel panel1 = new JPanel();
                JLabel label1 = new JLabel();
                label1.setText("Facility Management Services System");
                Font myFont = new Font("Comic Sans MS", Font.PLAIN, 27);
                label1.setFont(myFont);
                panel1.setBackground(Color.BLACK);
                label1.setForeground(Color.GREEN);
                panel1.add(label1);
                JButton Login = new JButton("Login");
                Login.setBackground(Color.GREEN);
                Login.setForeground(Color.BLUE);
                panel1.add(Login);
                JButton Register = new JButton("Register");
                Register.setBackground(Color.GREEN);
                Register.setForeground(Color.BLUE);
                panel1.add(Register);
                frame1.add(panel1);
                Exit = new JButton("Exit");
                Exit.setBackground(Color.GREEN);
                Exit.setForeground(Color.BLUE);
                panel1.add(Exit);
                frame1.add(panel1);
                frame1.setVisible(true);
                Login.setActionCommand("Login");
                Login.addActionListener(new Action1());

                Register.setActionCommand("Register");
                Register.addActionListener(new Action4());

                Exit.setActionCommand("Exit");
                Exit.addActionListener(new Action4());
            } else {
                System.exit(0);
            }
        }
    }

    class Action6 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame1.getContentPane().removeAll();
            frame1.repaint();
            String command = e.getActionCommand();
            if (command.equals("cancel2")) {
                frame1.setSize(500, 300);
                frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JPanel panel1 = new JPanel();
                JLabel label1 = new JLabel();
                label1.setText("Facility Management Services System");
                Font myFont = new Font("Comic Sans MS", Font.PLAIN, 27);
                label1.setFont(myFont);
                panel1.setBackground(Color.BLACK);
                label1.setForeground(Color.GREEN);
                panel1.add(label1);
                JButton Login = new JButton("Login");
                Login.setBackground(Color.GREEN);
                Login.setForeground(Color.BLUE);
                panel1.add(Login);
                JButton Register = new JButton("Register");
                Register.setBackground(Color.GREEN);
                Register.setForeground(Color.BLUE);
                panel1.add(Register);
                frame1.add(panel1);
                Exit = new JButton("Exit");
                Exit.setBackground(Color.GREEN);
                Exit.setForeground(Color.BLUE);
                panel1.add(Exit);
                frame1.add(panel1);
                frame1.setVisible(true);
                Login.setActionCommand("Login");
                Login.addActionListener(new Action1());

                Register.setActionCommand("Register");
                Register.addActionListener(new Action4());

                Exit.setActionCommand("Exit");
                Exit.addActionListener(new Action4());
            }
        }

    }

    class Action7 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame1.getContentPane().removeAll();
            frame1.repaint();
            String command = e.getActionCommand();
            if (command.equals("Logout")) {
                frame1.setSize(500, 300);
                frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JPanel panel10 = new JPanel();
                panel10.setBackground(Color.BLACK);
                JLabel label10 = new JLabel();
                label10.setForeground(Color.CYAN);
                label10.setText("YOU ARE SUCCESSFULLY LOGGED OUT!");
                Font myFont = new Font("Comic Sans MS", Font.PLAIN, 22);
                label10.setFont(myFont);
                JButton cancel3 = new JButton("Home");
                cancel3.setBackground(Color.GREEN);
                cancel3.setForeground(Color.blue);
                cancel3.setActionCommand("cancel3");
                cancel3.addActionListener(new Action8());
                JButton exit3 = new JButton("Exit");
                exit3.setBackground(Color.GREEN);
                exit3.setForeground(Color.blue);
                exit3.setActionCommand("exit3");
                exit3.addActionListener(new Action8());
                panel10.add(label10);
                panel10.add(cancel3);
                panel10.add(exit3);
                frame1.add(panel10);
                frame1.setVisible(true);
            }
        }

    }

    class Action8 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame1.getContentPane().removeAll();
            frame1.repaint();
            String command = e.getActionCommand();
            if (command.equals("cancel3")) {
                frame1.setSize(500, 300);
                frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JPanel panel1 = new JPanel();
                JLabel label1 = new JLabel();
                label1.setText("Facility Management Services System");
                Font myFont = new Font("Comic Sans MS", Font.PLAIN, 27);
                label1.setFont(myFont);
                panel1.setBackground(Color.BLACK);
                label1.setForeground(Color.GREEN);
                panel1.add(label1);
                JButton Login = new JButton("Login");
                Login.setBackground(Color.GREEN);
                Login.setForeground(Color.BLUE);
                panel1.add(Login);
                JButton Register = new JButton("Register");
                Register.setBackground(Color.GREEN);
                Register.setForeground(Color.BLUE);
                panel1.add(Register);
                frame1.add(panel1);
                Exit = new JButton("Exit");
                Exit.setBackground(Color.GREEN);
                Exit.setForeground(Color.BLUE);
                panel1.add(Exit);
                frame1.add(panel1);
                frame1.setVisible(true);
                Login.setActionCommand("Login");
                Login.addActionListener(new Action1());
                Register.setActionCommand("Register");
                Register.addActionListener(new Action4());
                Exit.setActionCommand("Exit");
                Exit.addActionListener(new Action4());
            } else {
                System.exit(0);
            }
        }

    }

    class Action9 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame1.getContentPane().removeAll();
            frame1.repaint();
            String command = e.getActionCommand();
            if (command.equals("Staff")) {
                frame1.setSize(500, 300);
                frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JPanel panel20 = new JPanel();
                panel20.setBackground(Color.BLACK);
                JLabel label20 = new JLabel();
                label20.setText("          Staff Stats          ");
                Font myFont = new Font("Comic Sans MS", Font.PLAIN, 38);
                label20.setFont(myFont);
                label20.setForeground(Color.GREEN);
                JRadioButton elec = new JRadioButton("Electricity");
                elec.setMnemonic(KeyEvent.VK_B);
                elec.setActionCommand("elec");
                elec.setBackground(Color.BLACK);
                elec.setForeground(Color.GREEN);
                JRadioButton hvac = new JRadioButton("HVAC");
                hvac.setMnemonic(KeyEvent.VK_B);
                hvac.setActionCommand("hvac");
                hvac.setBackground(Color.BLACK);
                hvac.setForeground(Color.GREEN);
                JRadioButton sec = new JRadioButton("Security");
                sec.setMnemonic(KeyEvent.VK_B);
                sec.setActionCommand("sec");
                sec.setBackground(Color.BLACK);
                sec.setForeground(Color.GREEN);
                JRadioButton hk = new JRadioButton("Housekeeping");
                hk.setMnemonic(KeyEvent.VK_B);
                hk.setActionCommand("hk");
                hk.setBackground(Color.BLACK);
                hk.setForeground(Color.GREEN);
                JRadioButton AV = new JRadioButton("Audio/Video");
                AV.setMnemonic(KeyEvent.VK_B);
                AV.setActionCommand("AV");
                AV.setBackground(Color.BLACK);
                AV.setForeground(Color.GREEN);
                name1 = new JLabel("Supervisor Name:");
                name1.setForeground(Color.GREEN);
                text1 = new JTextField(32);
                text1.setBackground(Color.BLACK);
                text1.setForeground(Color.GREEN);
                name2 = new JLabel("           Total Staff  :");
                name2.setForeground(Color.GREEN);
                text2 = new JTextField(32);
                text2.setBackground(Color.BLACK);
                text2.setForeground(Color.GREEN);
                name3 = new JLabel("Staff On Leave:    ");
                name3.setForeground(Color.GREEN);
                text3 = new JTextField(32);
                text3.setBackground(Color.BLACK);
                text3.setForeground(Color.GREEN);
                name4 = new JLabel("Staff Available:     ");
                name4.setForeground(Color.GREEN);
                text4 = new JTextField(32);
                text4.setBackground(Color.BLACK);
                text4.setForeground(Color.GREEN);
                panel20.add(label20);
                panel20.add(elec);
                panel20.add(hvac);
                panel20.add(sec);
                panel20.add(hk);
                panel20.add(AV);
                panel20.add(name1);
                panel20.add(text1);
                panel20.add(name2);
                panel20.add(text2);
                panel20.add(name3);
                panel20.add(text3);
                panel20.add(name4);
                panel20.add(text4);
                fi = new JButton("Back");
                fi.setBackground(Color.GREEN);
                fi.setForeground(Color.blue);
                fi.setActionCommand("fi");
                fi.addActionListener(new Action10());
                panel20.add(fi);
                frame1.add(panel20);
                frame1.setVisible(true);
            }

        }


    }

    class Action10 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame1.getContentPane().removeAll();
            frame1.repaint();
            String command = e.getActionCommand();
            if (command.equals("fi")) {
                Text1 = text_log.getText();//getting input from Username
                Text2 = text_pass.getText();//gettig input from Password
                panel3 = new JPanel();
                panel3.setBackground(Color.BLACK);
                head2 = new JLabel();
                head2.setText("                                   Admin                                ");
                Font myFont = new Font("Comic Sans MS", Font.PLAIN, 20);
                head2.setFont(myFont);
                head2.setForeground(Color.CYAN);
                panel3.add(head2);
                one = new JRadioButton("Home");
                one.setMnemonic(KeyEvent.VK_B);
                one.setBackground(Color.BLACK);
                one.setForeground(Color.GREEN);
                two = new JRadioButton("Staff");
                two.setMnemonic(KeyEvent.VK_B);
                two.setBackground(Color.BLACK);
                two.setForeground(Color.GREEN);
                three = new JRadioButton("Logistics");
                three.setMnemonic(KeyEvent.VK_B);
                three.setBackground(Color.BLACK);
                three.setForeground(Color.GREEN);
                four = new JRadioButton("Report");
                four.setMnemonic(KeyEvent.VK_B);
                four.setBackground(Color.BLACK);
                four.setForeground(Color.GREEN);
                logout = new JButton("Logout");
                logout.setBackground(Color.CYAN);
                logout.setForeground(Color.BLUE);
                call();
                panel3.add(one);
                panel3.add(two);
                panel3.add(three);
                panel3.add(four);
                panel3.add(logout);
                frame1.add(panel3);
                frame1.setVisible(true);
            }

        }

        public void call() {
            one.setActionCommand("Home");
            two.setActionCommand("Staff");
            three.setActionCommand("Logistics");
            four.setActionCommand("Report");
            logout.setActionCommand("Logout");
              one.addActionListener(new Action11());
            two.addActionListener(new Action9());
            //three.addActionListener(new Action7());
            //four.addActionListener(new Action7());
            logout.addActionListener(new Action7());
        }


    }

    class Action11 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame1.getContentPane().removeAll();
            frame1.repaint();
            String command = e.getActionCommand();
            if (command.equals("Home")) {
                frame1.setSize(500, 300);
                frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JPanel panel21 = new JPanel();
                panel21.setBackground(Color.BLACK);
                JLabel label21 = new JLabel("               Home              ");
                Font myFont = new Font("Comic Sans MS", Font.PLAIN, 38);
                label21.setFont(myFont);
                label21.setForeground(Color.GREEN);
                JRadioButton Req = new JRadioButton("Addition Request           ");
                Req.setMnemonic(KeyEvent.VK_B);
                Req.setActionCommand("Req");
                Req.setForeground(Color.GREEN);
                Req.setBackground(Color.BLACK);
                JRadioButton Lev = new JRadioButton("Leave Request            ");
                Lev.setMnemonic(KeyEvent.VK_B);
                Lev.setActionCommand("Lev");
                Lev.setForeground(Color.GREEN);
                Lev.setBackground(Color.BLACK);
                JButton Back1 = new JButton("Back");
                Back1.setActionCommand("Back");Back1.addActionListener(new Action12());
                Back1.setBackground(Color.green);
                Back1.setForeground(Color.blue);
                panel21.add(label21);
                panel21.add(Req);
                panel21.add(Lev);
                panel21.add(Back1);
                frame1.add(panel21);
                frame1.setVisible(true);
            }
        }


    }

    class Action12 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            frame1.getContentPane().removeAll();
            frame1.repaint();
            String command = e.getActionCommand();
            if (command.equals("Back")){
                Text1 = text_log.getText();//getting input from Usernam
                Text2 = text_pass.getText();//gettig input from Password
                panel3 = new JPanel();
                panel3.setBackground(Color.BLACK);
                head2 = new JLabel();
                head2.setText("                               Admin                                   ");
                Font myFont = new Font("Comic Sans MS", Font.PLAIN, 20);
                head2.setFont(myFont);
                head2.setForeground(Color.CYAN);
                panel3.add(head2);
                one = new JRadioButton("Home");
                one.setMnemonic(KeyEvent.VK_B);
                one.setBackground(Color.BLACK);
                one.setForeground(Color.GREEN);
                two = new JRadioButton("Staff");
                two.setMnemonic(KeyEvent.VK_B);
                two.setBackground(Color.BLACK);
                two.setForeground(Color.GREEN);
                three = new JRadioButton("Logistics");
                three.setMnemonic(KeyEvent.VK_B);
                three.setBackground(Color.BLACK);
                three.setForeground(Color.GREEN);
                four = new JRadioButton("Report");
                four.setMnemonic(KeyEvent.VK_B);
                four.setBackground(Color.BLACK);
                four.setForeground(Color.GREEN);
                logout = new JButton("Logout");
                logout.setBackground(Color.CYAN);
                logout.setForeground(Color.blue);
                call();
                panel3.add(one);
                panel3.add(two);
                panel3.add(three);
                panel3.add(four);
                panel3.add(logout);
                frame1.add(panel3);
                frame1.setVisible(true);
            }


        }
        public void call() {
            one.setActionCommand("Home");
            two.setActionCommand("Staff");
            three.setActionCommand("Logistics");
            four.setActionCommand("Report");
            logout.setActionCommand("Logout");
            one.addActionListener(new Action11());
            two.addActionListener(new Action9());
            //three.addActionListener(new Action7());
            //four.addActionListener(new Action7());
            logout.addActionListener(new Action7());
        }

    }
}


