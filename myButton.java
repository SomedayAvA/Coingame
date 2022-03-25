import javax.swing.JButton;

public class myButton extends JButton {
    public int locat=0;
    public int time=0;
    private JButton button;

    public myButton(int i)
    {
        button=new JButton();
        locat=i;
        time = 1;
    }
}
