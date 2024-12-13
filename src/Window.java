import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    public Window() {
        this.setTitle("Math Draw");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        this.setPreferredSize(new Dimension(500, 500));
    }
}
