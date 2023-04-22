package JuegoCraps;

import javax.swing.*;
import java.awt.*;

/**
 *
 *
 *
 *
 *
 */

public class Headers extends JLabel {

    public Headers(String title, Color colorBackground){

        this.setText(title);
        this.setBackground(colorBackground);
        this.setForeground(new Color(255,255,255));
        this.setFont(new Font(Font.DIALOG,Font.BOLD,20));
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setVerticalAlignment(JLabel.CENTER);
        this.setOpaque(true);


    }
}