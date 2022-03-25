import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.plaf.*;
/*
 * Created by JFormDesigner on Sun Mar 20 10:11:54 CST 2022
 */



/**
 * @author Tianyi Wang
 */
public class StartFrame extends JFrame {
    public StartFrame() {
        initComponents();
    }

    private void ok(ActionEvent e) {
        new game();
    }

    private void Exit(ActionEvent e) {
        System.exit(0);
    }

    private void button5(ActionEvent e) {
        new game();
        this.dispose();
    }

    private void button6(ActionEvent e) {
        new Rule();
    }

    private void button4(ActionEvent e) {
        System.exit(0);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Tianyi Zhang
        label1 = new JLabel();
        panel1 = new JPanel();
        button5 = new JButton();
        button6 = new JButton();
        button4 = new JButton();

        //======== this ========
        setVisible(true);
        setTitle("Menu");
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(2, 2));

        //---- label1 ----
        label1.setText(" Coin Game  ");
        label1.setBackground(new Color(255, 255, 51));
        label1.setForeground(new Color(255, 0, 204));
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label1.setFont(new Font("Microsoft Uighur", Font.BOLD | Font.ITALIC, 90));
        label1.setDisplayedMnemonicIndex(0);
        label1.setOpaque(true);
        contentPane.add(label1);

        //======== panel1 ========
        {
            panel1.setBackground(new Color(255, 204, 0));
            panel1.setLayout(new GridLayout(1, 3));

            //---- button5 ----
            button5.setText("Start");
            button5.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 36));
            button5.setBackground(Color.blue);
            button5.setForeground(new Color(214, 214, 214));
            button5.addActionListener(e -> button5(e));
            panel1.add(button5);

            //---- button6 ----
            button6.setText("Rule");
            button6.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 36));
            button6.setBackground(Color.blue);
            button6.setForeground(new Color(214, 214, 214));
            button6.addActionListener(e -> button6(e));
            panel1.add(button6);

            //---- button4 ----
            button4.setText("Exit");
            button4.setBackground(Color.blue);
            button4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 36));
            button4.setForeground(new Color(214, 214, 214));
            button4.addActionListener(e -> button4(e));
            panel1.add(button4);
        }
        contentPane.add(panel1);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Tianyi Zhang
    private JLabel label1;
    private JPanel panel1;
    private JButton button5;
    private JButton button6;
    private JButton button4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args) {
        new StartFrame();
    }
}

