import java.awt.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Thu Mar 24 14:04:12 CST 2022
 */



/**
 * @author Tianyi Zhang
 */
public class Rule extends JFrame {
    public Rule() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Tianyi Zhang
        label1 = new JLabel();
        textArea2 = new JTextArea();

        //======== this ========
        setVisible(true);
        setTitle("Rule");
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("Rule");
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label1.setBackground(new Color(0, 153, 153));
        label1.setForeground(new Color(0, 255, 102));
        label1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 48));
        label1.setDisplayedMnemonicIndex(0);
        label1.setOpaque(true);
        contentPane.add(label1);
        label1.setBounds(0, 0, 545, 95);

        //---- textArea2 ----
        textArea2.setText("There are 12 coins. You can only flip one heads at a time, and you can decide if you want to flip any left side of the coin as well (heads to tails or tails to heads) after the coin is flipped. Whoever flips the last heads coin wins.");
        textArea2.setLineWrap(true);
        textArea2.setEditable(false);
        textArea2.setFont(new Font("Constantia", Font.PLAIN, 27));
        textArea2.setBackground(Color.cyan);
        textArea2.setForeground(new Color(0, 204, 0));
        contentPane.add(textArea2);
        textArea2.setBounds(0, 95, 545, 215);

        contentPane.setPreferredSize(new Dimension(545, 300));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Tianyi Zhang
    private JLabel label1;
    private JTextArea textArea2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
