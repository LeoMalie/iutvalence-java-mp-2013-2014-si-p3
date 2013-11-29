package fr.iutvalence.java.mp.p3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * This class provides to get a GUI
 * @author maliel
 *
 */
@SuppressWarnings("serial")
public class GraphicDisplay extends JFrame implements Display
{
    private JLabel[][] labels;
    
    private JLabel score;
    
    public static final int SIZE_LAYOUT = 500;
    
    public void GraphicDisplay()
    {
        this.setTitle("CrashCar V1.0");
        this.setSize(SIZE_LAYOUT, SIZE_LAYOUT);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        GridLayout gl = new GridLayout(SIZE_LAYOUT, SIZE_LAYOUT);
        gl.preferredLayoutSize(this);
        
        JPanel panelZone = new JPanel();
        panelZone.setLayout(gl);

        
        
        JPanel pan = new JPanel();
        
        this.setContentPane(pan);               
        this.setVisible(true);
    }
    
    
}
