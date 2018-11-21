import java.awt.*;

public class TestFlowLayout {
    public static void main(String args[]) {
        Frame f = new Frame("Flow Layout");
        Button b1 = new Button("OK");
        Button b2 = new Button("Open");
        Button b3 = new Button("Close");
        f.setLayout(new FlowLayout());
        f.add(b1); f.add(b2); f.add(b3);
        f.setSize(100, 100);
        f.setVisible(true);
    }
}