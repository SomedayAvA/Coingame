import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.crypto.spec.IvParameterSpec;
import javax.swing.*;
/*
 * Created by JFormDesigner on Sun Mar 20 16:38:01 CST 2022
 */

/**
 * @author Tianyi Wang && Zhenhua Ren
 */
public class game extends JFrame {
    public game() {
        initComponents();
    }

    public int[] location = new int[12];
    public int[] num = new int[12];

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY
        // //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Tianyi Wang
        panel1 = new JPanel();
        button1 = new myButton(1);
        //System.out.println(((myButton) button1).locat);
        panel2 = new JPanel();
        button2 = new myButton(2);
        panel3 = new JPanel();
        button3 = new myButton(3);
        panel4 = new JPanel();
        button4 = new myButton(4);
        panel5 = new JPanel();
        button5 = new myButton(5);
        panel6 = new JPanel();
        button6 = new myButton(6);
        panel7 = new JPanel();
        button7 = new myButton(7);
        panel8 = new JPanel();
        button8 = new myButton(8);
        panel9 = new JPanel();
        button9 = new myButton(9);
        panel10 = new JPanel();
        button10 = new myButton(10);
        panel11 = new JPanel();
        button11 = new myButton(11);
        panel12 = new JPanel();
        button12 = new myButton(12);
        setTitle("Game");
        Random r = new Random();

        for (int i = 0; i < 12; i++) {
            location[i] = r.nextInt(2);
            if (location[i] == 1) {
                num[i] = i + 1;
            } else {
                num[i] = 0;
            }

        }

        // ======== this ========
        panel1.setBackground(new Color(255, 204, 0));
        panel2.setBackground(new Color(255, 204, 0));
        panel3.setBackground(new Color(255, 204, 0));
        panel4.setBackground(new Color(255, 204, 0));
        panel5.setBackground(new Color(255, 204, 0));
        panel6.setBackground(new Color(255, 204, 0));
        panel7.setBackground(new Color(255, 204, 0));
        panel8.setBackground(new Color(255, 204, 0));
        panel9.setBackground(new Color(255, 204, 0));
        panel10.setBackground(new Color(255, 204, 0));
        panel11.setBackground(new Color(255, 204, 0));
        panel12.setBackground(new Color(255, 204, 0));
        setVisible(true);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        // ======== panel1 ========
        {
            panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                @Override
                public void propertyChange(java.beans.PropertyChangeEvent e) {
                    if ("bord\u0065r".equals(e.getPropertyName()))
                        throw new RuntimeException();
                }
            });
            panel1.setLayout(null);

            // ---- button1 ----
            button1.addActionListener(new button1Listner());
            panel1.add(button1);
            button1.setBounds(new Rectangle(new Point(40, 105), button1.getPreferredSize()));
        }
        contentPane.add(panel1);
        panel1.setBounds(0, 0, 150, 300);

        // ======== panel2 ========
        {
            panel2.setLayout(null);
            button2.addActionListener(new button2Listner());
            panel2.add(button2);
            button2.setBounds(new Rectangle(new Point(40, 105), button2.getPreferredSize()));
        }
        contentPane.add(panel2);
        panel2.setBounds(150, 0, 150, 300);

        // ======== panel3 ========
        {
            panel3.setLayout(null);
            button3.addActionListener(new button3Listner());
            panel3.add(button3);
            button3.setBounds(new Rectangle(new Point(40, 105), button3.getPreferredSize()));
        }
        contentPane.add(panel3);
        panel3.setBounds(300, 0, 150, 300);

        // ======== panel4 ========
        {
            panel4.setLayout(null);
            button4.addActionListener(new button4Listner());
            panel4.add(button4);
            button4.setBounds(new Rectangle(new Point(40, 105), button4.getPreferredSize()));
        }
        contentPane.add(panel4);
        panel4.setBounds(450, 0, 150, 300);

        // ======== panel5 ========
        {
            panel5.setLayout(null);
            button5.addActionListener(new button5Listner());
            panel5.add(button5);
            button5.setBounds(new Rectangle(new Point(40, 105), button5.getPreferredSize()));
        }
        contentPane.add(panel5);
        panel5.setBounds(600, 0, 150, 300);

        // ======== panel6 ========
        {
            panel6.setLayout(null);
            button6.addActionListener(new button6Listner());
            panel6.add(button6);
            button6.setBounds(new Rectangle(new Point(40, 105), button6.getPreferredSize()));
        }
        contentPane.add(panel6);
        panel6.setBounds(750, 0, 150, 300);

        // ======== panel7 ========
        {
            panel7.setLayout(null);
            button7.addActionListener(new button7Listner());
            panel7.add(button7);
            button7.setBounds(new Rectangle(new Point(40, 105), button7.getPreferredSize()));
        }
        contentPane.add(panel7);
        panel7.setBounds(900, 0, 150, 300);

        // ======== panel8 ========
        {
            panel8.setLayout(null);
            button8.addActionListener(new button8Listner());
            panel8.add(button8);
            button8.setBounds(new Rectangle(new Point(40, 105), button8.getPreferredSize()));
        }
        contentPane.add(panel8);
        panel8.setBounds(1050, 0, 150, 300);

        // ======== panel9 ========
        {
            panel9.setLayout(null);
            button9.addActionListener(new button9Listner());
            panel9.add(button9);
            button9.setBounds(new Rectangle(new Point(40, 105), button9.getPreferredSize()));
        }
        contentPane.add(panel9);
        panel9.setBounds(1200, 0, 150, 300);

        // ======== panel10 ========
        {
            panel10.setLayout(null);
            button10.addActionListener(new button10Listner());
            panel10.add(button10);
            button10.setBounds(new Rectangle(new Point(40, 105), button10.getPreferredSize()));
        }
        contentPane.add(panel10);
        panel10.setBounds(1350, 0, 150, 300);

        // ======== panel11 ========
        {
            panel11.setLayout(null);
            button11.addActionListener(new button11Listner());
            panel11.add(button11);
            button11.setBounds(new Rectangle(new Point(40, 105), button11.getPreferredSize()));
        }
        contentPane.add(panel11);
        panel11.setBounds(1500, 0, 150, 300);

        // ======== panel12 ========
        {
            panel12.setLayout(null);
            button12.addActionListener(new button12Listner());
            panel12.add(button12);
            button12.setBounds(new Rectangle(new Point(40, 105), button12.getPreferredSize()));
        }
        contentPane.add(panel12);
        panel12.setBounds(1650, 0, 150, 300);
        button1.setIcon(new ImageIcon("src/"+location[0]+".png"));
        button1.setBounds(0,70,150,150);
        button2.setIcon(new ImageIcon("src/"+location[1]+".png"));
        button2.setBounds(0,70,150,150);
        button3.setIcon(new ImageIcon("src/"+location[2]+".png"));
        button3.setBounds(0,70,150,150);
        button4.setIcon(new ImageIcon("src/"+location[3]+".png"));
        button4.setBounds(0,70,150,150);
        button5.setIcon(new ImageIcon("src/"+location[4]+".png"));
        button5.setBounds(0,70,150,150);
        button6.setIcon(new ImageIcon("src/"+location[5]+".png"));
        button6.setBounds(0,70,150,150);
        button7.setIcon(new ImageIcon("src/"+location[6]+".png"));
        button7.setBounds(0,70,150,150);
        button8.setIcon(new ImageIcon("src/"+location[7]+".png"));
        button8.setBounds(0,70,150,150);
        button9.setIcon(new ImageIcon("src/"+location[8]+".png"));
        button9.setBounds(0,70,150,150);
        button10.setIcon(new ImageIcon("src/"+location[9]+".png"));
        button10.setBounds(0,70,150,150);
        button11.setIcon(new ImageIcon("src/"+location[10]+".png"));
        button11.setBounds(0,70,150,150);
        button12.setIcon(new ImageIcon("src/"+location[11]+".png"));
        button12.setBounds(0,70,150,150);
        contentPane.setPreferredSize(new Dimension(1800, 300));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Tianyi Zhang
    private JPanel panel1;
    private JButton button1;
    private JPanel panel2;
    private JButton button2;
    private JPanel panel3;
    private JButton button3;
    private JPanel panel4;
    private JButton button4;
    private JPanel panel5;
    private JButton button5;
    private JPanel panel6;
    private JButton button6;
    private JPanel panel7;
    private JButton button7;
    private JPanel panel8;
    private JButton button8;
    private JPanel panel9;
    private JButton button9;
    private JPanel panel10;
    private JButton button10;
    private JPanel panel11;
    private JButton button11;
    private JPanel panel12;
    private JButton button12;
    public int signal;
    public int attribute = 3;


public class button1Listner implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            usual(0,button1);
    }
}
    public class button2Listner implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            usual(1,button2);
        }
    }
    public class button3Listner implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            usual(2,button3);
        }
    }
    public class button4Listner implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            usual(3,button4);
        }
    }
    public class button5Listner implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            usual(4,button5);
        }
    }
    public class button6Listner implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            usual(5,button6);
        }
    }
    public class button7Listner implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            usual(6,button7);
        }
    }
    public class button8Listner implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            usual(7,button8);
        }
    }
    public class button9Listner implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            usual(8,button9);
        }
    }
    public class button10Listner implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            usual(9,button10);
        }
    }
    public class button11Listner implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            usual(10,button11);
        }
    }
    public class button12Listner implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            usual(11,button12);
        }
    }

public void usual(int x,JButton button)
{
    System.out.println(((myButton)button1).time);
    if(((myButton)button).time == 1){
        if(location[x]==0)
        {
            JOptionPane.showMessageDialog(null, "it's back", "it's back", JOptionPane.ERROR_MESSAGE);
        }
        else if(location[x]==1)
        {

            location[x]=0;
            button.setIcon(new ImageIcon("src/"+location[x]+".png"));
            judgefunction(1);
            num[x]=0;
            Object[] options ={ "continue", "end" };
            int m = JOptionPane.showOptionDialog(null, "continue or end?", "Title",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if(m==0)
            {
                changetime(button);
                signal=x;
            }
            else if(m==1)
            {
                JOptionPane.showMessageDialog(null, "then,it's computer's turn, just wait a minute and continue");
                computerOption();
            }

        }
    }
    else if(((myButton)button).time==2)
    {
        if(signal > x)
        {
            attribute=location[x];
            location[x]=location[x]^1;
            if(attribute==0)
            {
                num[x]=x+1;
            }
            else if(attribute==1)
            {
                num[x]=0;
                judgefunction(1);
            }

            button.setIcon(new ImageIcon("src/"+location[x]+".png"));
            changetime(button);
            JOptionPane.showMessageDialog(null, "then,it's computer's turn, just wait a minute and continue");
            computerOption();

        }
        else if(signal <= x)
        {
            JOptionPane.showMessageDialog(null, "you should choose the left", "error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
    public void changetime(JButton button)
    {

        if(((myButton)button).time==1)
        {
            ((myButton)button1).time=2;
            ((myButton)button2).time=2;
            ((myButton)button3).time=2;
            ((myButton)button4).time=2;
            ((myButton)button5).time=2;
            ((myButton)button6).time=2;
            ((myButton)button7).time=2;
            ((myButton)button8).time=2;
            ((myButton)button9).time=2;
            ((myButton)button10).time=2;
            ((myButton)button11).time=2;
            ((myButton)button12).time=2;
        }
        else if(((myButton)button).time==2)
        {
            ((myButton)button1).time=0;
            ((myButton)button2).time=0;
            ((myButton)button3).time=0;
            ((myButton)button4).time=0;
            ((myButton)button5).time=0;
            ((myButton)button6).time=0;
            ((myButton)button7).time=0;
            ((myButton)button8).time=0;
            ((myButton)button9).time=0;
            ((myButton)button10).time=0;
            ((myButton)button11).time=0;
            ((myButton)button12).time=0;
        }
    
    }

    public void computerOption() {
        int[] b = new int[12];
        int q = 0;
        while(q<12)
        {
            b[q]=location[q];
            q++;
        }
        ((myButton)button1).time=1;
        ((myButton)button2).time=1;
        ((myButton)button3).time=1;
        ((myButton)button4).time=1;
        ((myButton)button5).time=1;
        ((myButton)button6).time=1;
        ((myButton)button7).time=1;
        ((myButton)button8).time=1;
        ((myButton)button9).time=1;
        ((myButton)button10).time=1;
        ((myButton)button11).time=1;
        ((myButton)button12).time=1;
        int xor = 0;
        for (int i = 0; i < 12; i++) {
            xor = xor ^ num[i];
        }
        if (xor == 0) {
            Random p = new Random();
            int rand = p.nextInt(12) ;
            while (location[rand] != 1) {
                rand = p.nextInt(12) ;
            }
            System.out.println(rand);
            attribute=location[rand];
            location[rand]=location[rand]^1;
            set();
            num[rand] = 0;
            //JOptionPane.showMessageDialog(null,"location"+(rand+1)+"from"+(location[rand]^1)+"to"+location[rand]);

        }
        else if (xor != 0)
        {
            if (xor <= 12) {
                if (location[xor - 1] == 1)
                {
                    attribute=location[xor-1];
                    location[xor-1]=location[xor-1]^1;
                    set();
                    //JOptionPane.showMessageDialog(null,"location"+xor+"from"+(location[xor-1]^1)+"to"+location[xor]);
                    num[xor - 1] = 0;
                    judgefunction(0);
                }
                else
                {
                    int t = 0;
                    while (t < 12)
                    {
                        if (t != 11)
                        {
                            if (location[t] == 1)
                            {
                                num[t] = 0;
                                int yihuo = 0;
                                for (int i = 0; i < 12; i++) {
                                    yihuo = yihuo ^ num[i];
                                }
                                if (yihuo - 1 < t)
                                {

                                    location[t]=location[t]^1;
                                    attribute=location[yihuo - 1];
                                    location[yihuo - 1]=location[yihuo - 1]^1;
                                    set();
                                    //JOptionPane.showMessageDialog(null,"location"+yihuo+"from"+(location[yihuo-1]^1)+"to"+location[yihuo-1]);
                                    if (attribute == 0) {
                                        num[yihuo - 1] = yihuo;
                                    } else if (attribute == 1) {
                                        num[yihuo - 1] = 0;
                                        judgefunction(0);
                                    }
                                    break;
                                }
                                else if (yihuo - 1 >= t)
                                {
                                    num[t] = t + 1;
                                    t = t + 1;
                                }
                            }
                            else if (location[t] == 0)
                            {
                                t = t + 1;
                            }
                        }
                        else if (t == 11)
                        {
                            if (location[t] == 1) {
                                num[t] = 0;
                                int yihuo = 0;
                                for (int i = 0; i < 12; i++) {
                                    yihuo = yihuo ^ num[i];
                                }
                                if (yihuo - 1 < t) {
                                    location[t]=location[t]^1;
                                    attribute=location[yihuo - 1];
                                    location[yihuo - 1]=location[yihuo - 1]^1;
                                    set();
                                    //JOptionPane.showMessageDialog(null,"location "+yihuo+"from"+(location[yihuo-1]^1)+" to "+location[yihuo-1]);
                                    if (attribute == 0) {
                                        num[yihuo - 1] = yihuo;
                                    } else if (attribute == 1) {
                                        num[yihuo - 1] = 0;
                                        judgefunction(0);
                                    }
                                    break;
                                } else if (yihuo - 1 >= t) {
                                    Random p = new Random();
                                    int rand = p.nextInt(12) ;
                                    while (location[rand] != 1) {
                                        rand = p.nextInt(12) ;
                                    }
                                    System.out.println(rand);
                                    attribute=location[rand];
                                    location[rand]=location[rand]^1;
                                    set();
                                    //JOptionPane.showMessageDialog(null,"location"+(rand+1)+"from"+(location[rand]^1)+"to"+location[rand]);
                                    num[rand] = 0;
                                    break;
                                }
                            } else if (location[t] == 0) {
                                Random p = new Random();
                                int rand = p.nextInt(12) ;
                                while (location[rand] != 1) {
                                    rand = p.nextInt(12) ;
                                }
                                System.out.println(rand);
                                attribute=location[rand];
                                location[rand]=location[rand]^1;
                                set();
                                //JOptionPane.showMessageDialog(null,"location"+(rand+1)+"from"+(location[rand]^1)+"to"+location[rand]);
                                num[rand] = 0;
                                break;
                            }

                        }
                    }
                }
            }
            else if (xor > 12) {
                int t = 0;
                while (t < 12) {
                    if (t != 11) {
                        if (location[t] == 1) {
                            num[t] = 0;
                            int yihuo = 0;
                            for (int i = 0; i < 12; i++) {
                                yihuo = yihuo ^ num[i];
                            }
                            if (yihuo - 1 < t) {
                                location[t]=location[t]^1;
                                attribute=location[yihuo - 1];
                                location[yihuo - 1]=location[yihuo - 1]^1;
                                set();
                                //JOptionPane.showMessageDialog(null,"location"+yihuo+"from"+(location[yihuo-1]^1)+"to"+location[yihuo-1]);
                                if (attribute == 0) {
                                    num[yihuo - 1] = yihuo;
                                } else if (attribute == 1) {
                                    num[yihuo - 1] = 0;
                                    judgefunction(0);
                                }
                                break;
                            } else if (yihuo - 1 >= t) {
                                num[t] = t + 1;
                                t = t + 1;
                            }
                        } else if (location[t] == 0) {
                            t = t + 1;
                        }
                    } else if (t == 11) {
                        if (location[t] == 1) {
                            num[t] = 0;
                            int yihuo = 0;
                            for (int i = 0; i < 12; i++) {
                                yihuo = yihuo ^ num[i];
                            }
                            if (yihuo - 1 < t) {
                                location[t]=location[t]^1;
                                attribute=location[yihuo - 1];
                                location[yihuo - 1]=location[yihuo - 1]^1;
                                set();
                                //JOptionPane.showMessageDialog(null,"location"+yihuo+"from"+(location[yihuo-1]^1)+"to"+location[yihuo-1]);
                                if (attribute == 0) {
                                    num[yihuo - 1] = yihuo;
                                } else if (attribute == 1) {
                                    num[yihuo - 1] = 0;
                                    judgefunction(0);
                                }
                                break;
                            } else if (yihuo - 1 >= t) {
                                Random p = new Random();
                                int rand = p.nextInt(12) ;
                                while (location[rand] != 1) {
                                    rand = p.nextInt(12) ;
                                }
                                System.out.println(rand);
                                attribute=location[rand];
                                location[rand]=location[rand]^1;
                                set();
                                //JOptionPane.showMessageDialog(null,"location"+(rand+1)+"from"+(location[rand]^1)+"to"+location[rand]);
                                num[rand] = 0;
                                break;
                            }
                        } else if (location[t] == 0) {
                            Random p = new Random();
                            int rand = p.nextInt(12) ;
                            while (location[rand] != 1) {
                                rand = p.nextInt(12) ;
                            }
                            System.out.println(rand);
                            attribute=location[rand];
                            location[rand]=location[rand]^1;
                            set();
                            //JOptionPane.showMessageDialog(null,"location"+(rand+1)+"from"+(location[rand]^1)+"to"+location[rand]);
                            num[rand] = 0;
                            break;
                        }

                    }
                }
            }
        }
        q=0;
        int[] c = new int[3];
        int count = 0;
        while(q<12)
        {
            if(b[q]!=location[q])
            {
                c[count]=q+1;
                count++;
            }
            q++;
        }
        if (count==1&&b[c[0]-1]==1)
        {
            JOptionPane.showMessageDialog(null,"Coin "+c[0]+" from head to tail");
        }
        else if(count==2&&b[c[0]-1]==1&&b[c[1]-1]==1)
        {
            JOptionPane.showMessageDialog(null,"Coin "+c[1]+" from head to tail and Coin "+c[0]+" from head to tail");
        }
        else if(count==2&&b[c[0]-1]==0&&b[c[1]-1]==1)
        {
            JOptionPane.showMessageDialog(null,"Coin" +c[1]+" from head to tail and Coin "+c[0]+" from tail to head");
        }

    }

    public void judgefunction(int x)
    {
        int total=0;
        for(int i =0;i<12;i++) 
       {
            if(location[i]==0)
            {
                total=1;
            }
            else{
                total=0;
                break;
            }
       }
       if(total==1)
       {
           if(x==1)
           {
                JOptionPane.showMessageDialog(null, "The game ends, you won");
                System.exit(3);
           }
           else if(x==0)
           {
                JOptionPane.showMessageDialog(null, "The game ends, computer won");
                System.exit(3);
           }

       }
    }
    public void set()
    {
        button1.setIcon(new ImageIcon("src/"+location[0]+".png"));
        button2.setIcon(new ImageIcon("src/"+location[1]+".png"));
        button3.setIcon(new ImageIcon("src/"+location[2]+".png"));
        button4.setIcon(new ImageIcon("src/"+location[3]+".png"));
        button5.setIcon(new ImageIcon("src/"+location[4]+".png"));
        button6.setIcon(new ImageIcon("src/"+location[5]+".png"));
        button7.setIcon(new ImageIcon("src/"+location[6]+".png"));
        button8.setIcon(new ImageIcon("src/"+location[7]+".png"));
        button9.setIcon(new ImageIcon("src/"+location[8]+".png"));
        button10.setIcon(new ImageIcon("src/"+location[9]+".png"));
        button11.setIcon(new ImageIcon("src/"+location[10]+".png"));
        button12.setIcon(new ImageIcon("src/"+location[11]+".png"));
    }
 // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args) {
         new game();
    }
}
