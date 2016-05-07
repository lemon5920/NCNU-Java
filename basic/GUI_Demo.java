import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class GUI_Demo extends JFrame implements ActionListener {
    //override actionlistener's method
    JLabel label;
    int count = 0;
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if(s.equals("+1")) {
            count++;
        } else if(s.equals("-1")) {
            count--;
        } 
        label.setText(Integer.toString(count));
        //
        System.out.println(count); 
    }
    public GUI_Demo() {
        //"this" means "this ibject"
        //set size
        this.setSize(500, 500);
        label = new JLabel("0", JLabel.CENTER);
        label.setFont(new Font(Font.MONOSPACED, Font.BOLD, 200));
        this.add(label, BorderLayout.CENTER); 
        JButton plus = new JButton("+1");
        plus.addActionListener(this);
        this.add(plus, BorderLayout.WEST); 
        JButton minus = new JButton("-1");
        minus.addActionListener(this);
        this.add(minus, BorderLayout.EAST); 
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] argv) {
        new GUI_Demo();
    }
}