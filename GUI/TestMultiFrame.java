import java.awt.*;

public class TestMultiFrame {
    public static void main(String[] args) {
        MyFrame f1 = 
            new MyFrame(100, 100, 300, 300, Color.BLUE);
        MyFrame f2 = 
            new MyFrame(400, 100, 300, 300, Color.YELLOW);
        MyFrame f3 = 
            new MyFrame(100, 400, 300, 300, Color.GREEN);
        MyFrame f4 =
            new MyFrame(400, 400, 300, 300, Color.MAGENTA);
    }
}

class MyFrame extends Frame {
    static int id = 0;
    MyFrame(int x, int y, int w, int h, Color color) {
        super("MyFrame" + (++id));
        setBackground(color);
        setLayout(null);
        setBounds(x, y, w, h);
        setVisible(true);
    }
}