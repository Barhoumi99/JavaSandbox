import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    public Panel() {
        this.setSize(500, 500);
        this.setBackground(new Color(0x404040));
    }
    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        g2D.setStroke(new BasicStroke(2));
        g2D.drawLine(250, 0, 250, 500);
        g2D.drawLine(0, 250, 500, 250);
        g2D.setStroke(new BasicStroke(1));
        g2D.setPaint(new Color(0xaaaaaa));
        for(int i = 0; i <= 500; i += 50) {
            g2D.drawLine(i, 0, i, 500);
            g2D.drawLine(0, i, 500, i);
        }
        g2D.setPaint(new Color(0x222222));
        Point p1 = new Point();
        g2D.fillOval(250 + 50 * (int)p1.getX(), 250 - 50 * (int)p1.getY(), 6, 6);

    }
}
