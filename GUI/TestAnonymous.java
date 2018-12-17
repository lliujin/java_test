import java.awt.*;
import java.awt.event.*;

public class TestAnonymous {
    Frame f = new Frame("Test");
    TextField tf = new TextField(10);
    Button b = new Button("start");
    
    TestAnonymous() {
        f.add(b, "North");
        f.add(tf, "South");
        
        b.addActionListener(new ActionListener() {
            private int i = 0;
            public void actionPerformed(ActionEvent e) {
                tf.setText(e.getActionCommand() + ++i);
            }
        });
        
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        f.pack();
        f.setVisible(true);
    }
    
    public static void main(String[] args) {
        new TestAnonymous();
    }
}