import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ControlPad extends JPanel{

    ControlPad(ActionListener l) {
         setLayout(new GridLayout(1,3));
            
         add(new Controls("On/Off",l));
         add(new Controls("Slow",l));
         add(new Controls("Medium",l));
         add(new Controls("Fast",l));

    }
}

