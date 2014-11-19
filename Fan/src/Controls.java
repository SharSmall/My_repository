import java.awt.event.ActionListener;
import javax.swing.*;

public class Controls extends JButton {

    Controls(String s, ActionListener l) {
        setText(s);
        addActionListener(l);
    }
}
