import java.awt.*;
import java.awt.event.*;

public class TestWindowClose {
    public static void main(String[] args) {
        new MyFrame5("MyFrame");
    }
}

class MyFrame5 extends Frame {
    MyFrame5(String s) {
        super(s);
        setLayout(null);
        setBounds(300,300,400,300);
        setBackground(new Color(204,204,255));
        setVisible(true);
        //addWindowListener(new MyWindowMonitor());
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                setVisible(false);
                System.exit(-1);
            }
        });
    }
    
    /*
    class MyWindowMonitor extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            setVisible(false);
            System.exit(0);
        }
    }
    */
}