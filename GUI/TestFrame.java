import java.awt.*;
public class TestFrame {
    public static void main(String[] args) {
        Frame f = new Frame("My First Frame");
        f.setLocation(300,300);
        f.setSize(270,100);
        f.setBackground(Color.blue);
        f.setResizable(false);
        f.setVisible(true);
    }
}