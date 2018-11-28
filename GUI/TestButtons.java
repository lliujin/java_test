import java.awt.*;

public class TestButtons {
    public static void main(String args[]) {
        Frame f = new Frame("Java Frame");
        f.setBounds(100,100,300,200);
        f.setBackground(new Color(204,204,255));
        f.setLayout(new GridLayout(2,1));
        Panel p1 = new Panel(new BorderLayout());
        Panel p2 = new Panel(new BorderLayout());
        Panel p11 = new Panel(new GridLayout(2,1));
        Panel p21 = new Panel(new GridLayout(2,2));
        p1.add(p11, BorderLayout.CENTER);
        p2.add(p21, BorderLayout.CENTER);
        p1.add(new Button("Button"),BorderLayout.WEST);
        p1.add(new Button("Button"),BorderLayout.EAST);
        p11.add(new Button("Button"));
        p11.add(new Button("Button"));
        p2.add(new Button("Button"),BorderLayout.WEST);
        p2.add(new Button("Button"),BorderLayout.EAST);
        for(int i=1; i<=4; i++) {
            p21.add(new Button("Button"));
        }
        f.add(p1); f.add(p2);
        f.setVisible(true);
    }
}