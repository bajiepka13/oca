package programmingPatterns.angelsdevils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {

    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    private void go() {
        frame = new JFrame();
        JButton button = new JButton("Should i do it?");
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());
        frame.getContentPane().add(BorderLayout.CENTER, button);
    }

}

class AngelListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Don't do it! You might regret it!");
    }
}

class DevilListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Come on! Do it!");
    }
}