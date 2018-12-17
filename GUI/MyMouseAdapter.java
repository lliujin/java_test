import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class MyMouseAdapter {
    public static void main(String[] args) {
        new MyFrame4("drawing...");
    }
}

class MyFrame4 extends Frame {
    ArrayList<Point> points = null;
    
    MyFrame4(String s) {
        super(s);
        points = new ArrayList<Point>();
        setLayout(null);
        setBounds(300,300,400,300);
        setBackground(new Color(204,204,255));
        setVisible(true);
        addMouseListener(new Monitor2());
    }
    
    public void paint(Graphics g) {
        Iterator<Point> i = points.iterator();
        while(i.hasNext()) {
            Point p = (Point)i.next();
            g.setColor(Color.blue);
            g.fillOval(p.x,p.y,10,10);
        }
    }
    
    public void addPoint(Point p) {
        points.add(p);
    }
}

class Monitor2 extends MouseAdapter {
    public void mousePressed(MouseEvent e) {
        MyFrame4 f = (MyFrame4)e.getSource();
        f.addPoint(new Point(e.getX(),e.getY()));
        f.repaint();
    }
}