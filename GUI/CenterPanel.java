import java.awt.*;

public class CenterPanel {
    public static void main(String[] args) {
        new MyFrame3("FrameWithPanel", 100, 100, 400, 300);
    }
}

class MyFrame3 extends Frame {
    MyFrame3(String s, int x, int y, int w, int h) {
        super(s);
        Panel p = new Panel(null);
        setLayout(null);
        p.setBounds(w/4, h/4, w/2, h/2);
        p.setBackground(Color.yellow);
        setBackground(Color.blue);
        setBounds(x, y, w, h);
        add(p);
        setVisible(true);
    }
}