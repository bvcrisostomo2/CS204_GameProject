package Gui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamePageGUI {
    //PANEL AND FRAME
    private JFrame frame;
    private JPanel panel;
    
    //BUTTONS
    private JButton button1;
    private JButton button2;
    
    //LABELS
    private JLabel label1;
    
    public GamePageGUI(){
        createGui();
    
    }
    
    public void createGui(){
    //FRAME CREATION
        frame = new JFrame("CS 204");
        frame.setVisible(true);
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        
    //PANEL CREATION
        panel = new JPanel(new GridBagLayout());
        //panel.setBackground(Color.yellow);
        
    //BUTTONS,LABELS,FIELDS CREATION
        button1 = new JButton("Info");
        button2 = new JButton("Open Bridge Crossing");
        label1 = new JLabel("Label 1");
        
        
        
        
    //ACTION LISTENERS
        
        button1.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null, "ITS WORKING");
            }
        });
    
        
    
    
    
    //LAYOUT
        GridBagConstraints gbc = new GridBagConstraints();
        
        gbc.gridx= 0;
        gbc.gridy= 0;
        panel.add(button1,gbc);
        
        
        
        gbc.gridx= 1;
        gbc.gridy= 0;
        panel.add(button2,gbc);
        
        
        frame.add(panel);
    }
}
