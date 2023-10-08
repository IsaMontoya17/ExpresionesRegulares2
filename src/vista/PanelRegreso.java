package vista;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.SwingConstants;

public class PanelRegreso extends JPanel {

    /**
     * Create the panel.
     */
    public PanelRegreso() {
        setBackground(new Color(255, 234, 244));
        setLayout(new BorderLayout(0, 0));

        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 234, 244));
        add(panel, BorderLayout.CENTER);
        panel.setLayout(new GridLayout(1, 1, 0, 0));

        JLabel lblNewLabel = new JLabel();
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(lblNewLabel);
    }
    
}//CIERRE DE LA CLASE
