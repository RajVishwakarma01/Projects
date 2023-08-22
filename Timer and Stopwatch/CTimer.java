import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CTimer {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Timer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        frame.add(panel);

        JLabel timerLabel = new JLabel("Timer: 0");
        panel.add(timerLabel);

        Timer timer = new Timer(1000, new ActionListener() {
            int seconds = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                seconds++;
                timerLabel.setText("Timer: " + seconds);
            }
        });

        JButton startButton = new JButton("Start");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.start();
            }
        });

        JButton stopButton = new JButton("Stop");
        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.stop();
            }
        });

        panel.add(startButton);
        panel.add(stopButton);

        frame.setVisible(true);
    }
}
