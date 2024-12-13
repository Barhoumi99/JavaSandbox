
package learning_swing;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * A small app that I made after I learned about Buttons and ActionListeners
 * It's basically to buttons - On & OFF - that change the state of a lightbulb
*/

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Button offButton = new Button("OFF");
        offButton.setMnemonic('x');
        offButton.setBounds(130, 10, 120, 40);
        offButton.setEnabled(false);
        offButton.setBackground(new Color(0x707070));


        Button onButton = new Button("ON");
        onButton.setMnemonic('o');
        onButton.setBounds(260, 10, 120, 40);
        onButton.setBackground(new Color(0x4080f0));

        JLabel lightbulb = new JLabel("💡", SwingConstants.CENTER);
        lightbulb.setOpaque(true);
        lightbulb.setBackground(new Color(0x303030));
        lightbulb.setBounds(200, 250, 100, 100);
        lightbulb.setForeground(new Color(0x777777));
        lightbulb.setFont(new Font("Segoe UI Emoji", Font.BOLD, 50));

        offButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                offButton.setEnabled(false);
                offButton.setBackground(new Color(0x707070));

                onButton.setEnabled(true);
                onButton.setBackground(new Color(0x4080f0));

                lightbulb.setBackground(new Color(0x303030));

            }
        });
        onButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onButton.setEnabled(false);
                onButton.setBackground(new Color(0x707070));

                offButton.setEnabled(true);
                offButton.setBackground(new Color(0x4080f0));
                lightbulb.setBackground(new Color(0xd0d040));
            }
        });

        frame.add(offButton);
        frame.add(onButton);
        frame.add(lightbulb);
        frame.setVisible(true);
    }

}