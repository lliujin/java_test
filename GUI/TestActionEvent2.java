import java.awt.*;
import java.awt.event.*;

public class TestActionEvent2 {
    public static void main(String args[]) {
        Frame f = new Frame("Test");
        Button b1 = new Button("Start");
        Button b2 = new Button("Stop");
        Monitor2 bm = new Monitor2();
        b1.addActionListener(bm);
        b2.addActionListener(bm);
        b2.setActionCommand("Game Over");
        f.add(b1, BorderLayout.NORTH);
        f.add(b2, BorderLayout.CENTER);
        f.pack();
        f.setVisible(true);
    }
}

class Monitor2 implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("a button has been pressed" +
        "the relative info is:\n " + e.getActionCommand());
    }
}