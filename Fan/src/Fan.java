import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Fan extends JFrame {

    Blades blades;
    int displace;
    Timer timer;
    boolean on;
    int speed = 50;

    Fan() {
        setLayout(new BorderLayout());
        ControlPad controlpad = new ControlPad(new ButtonListener());
        add(controlpad, BorderLayout.SOUTH);
        blades = new Blades();
        add(blades, BorderLayout.CENTER);
        timer = new Timer(speed, new TimerListener());

    }

    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.setTitle("NYCCT FAN");
        fan.setSize(500, 500);
        fan.setLocationRelativeTo(null);
        fan.setDefaultCloseOperation(EXIT_ON_CLOSE);
        fan.setVisible(true);

    }

    class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (!on) {

                if (!e.getActionCommand().equals("On/Off")) {
                } else {
                    timer.start();
                    on = true;
                }
            } else if (e.getActionCommand().equals("Slow")) {
                timer.setDelay(40);
            } else if (e.getActionCommand().equals("Medium")) {
                timer.setDelay(10);
            } else if (e.getActionCommand().equals("Fast")) {
                timer.setDelay(1);
            } else {
                timer.stop();
                on = false;
            }
        }
    }

    class Blades extends JPanel {

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            int w = getWidth();
            int h = getHeight();
            int noOfBlades = 4;

            g.setColor(Color.black);
            g.fillOval(20, 20, w - 40, h - 40);
            g.setColor(Color.MAGENTA);

            for (int i = 0; i < noOfBlades; i++) {
                g.fillArc(20, 20, w - 40, h - 40,
                        (int) (i * 360. / noOfBlades + displace),
                        (int) (360. / (noOfBlades * 2)));
            }
        }
    }

    class TimerListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            displace++;
            blades.repaint();
        }

    }
}
