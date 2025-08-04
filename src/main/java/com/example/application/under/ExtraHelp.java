package com.example.application.under;




import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
/**
 * Generate a help object
 * Not in use for these version
 *
 * @author Erik Andreas Vold -  erikvold84@gmail.com
 */
public class ExtraHelp extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private JLabel over;
    private JScrollPane scrollPane_Help;
    private JTextArea  textArea_Help;
    private JPanel panelHelp;

    int xvalue = 50;
    int yvalue = 40;
    int ystep  = 20;

    ExtraHelp() {


        JFrame fra = new JFrame("Help");
        fra.setDefaultCloseOperation(1);
        //   fra.setIconImage(Toolkit.getDefaultToolkit().getImage(Welding.class.getResource("/images/logo.png")));
        fra.setBackground(Color.WHITE);
        fra.getContentPane().setBackground(Color.WHITE);
        setSize(800,800);
        setLayout(null);
        setVisible(true);

        panelHelp = new JPanel();

        over=new JLabel("Help info for welding ");
        over.setBounds(xvalue - ystep,10,200,20);
        add(over);
        JLabel bilde = new JLabel("");
        Image img = new ImageIcon(this.getClass().getResource("/images/Snag_d734eff.png")).getImage();
        bilde.setIcon(new ImageIcon(img));
        bilde.setBounds(350, 20, 600, 40);
        this.panelHelp.add(bilde);
        scrollPane_Help = new JScrollPane();
        scrollPane_Help.setBounds(20, 60, 120, 180);
        panelHelp.add(scrollPane_Help);

        textArea_Help = new JTextArea();
        textArea_Help.setToolTipText("her");
        scrollPane_Help.setViewportView(textArea_Help);
    }
}






