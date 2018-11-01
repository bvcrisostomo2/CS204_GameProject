package Gui;


import java.awt.*;
import javax.swing.*;
import BridgeCrossing.BridgeCrossingGUI;
import Gui.GameDraft;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public final class Gui extends javax.swing.JFrame {
    //PANEL AND FRAME
    private JFrame frame;
    private JPanel panel;
    
    //BUTTONS
    private JButton button1;
    private JButton button2;
    
    //LABELS
    private JLabel label1;
    
    
    public Gui(){
        createGui();
    
    
    }
    
    public void createGui(){
    //FRAME CREATION
        frame = new JFrame("CS 204");
        frame.setVisible(true);
        frame.setSize(200,200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(false);
        
        
    //PANEL CREATION
        panel = new JPanel(new GridBagLayout());
        //panel.setBackground(Color.yellow);
        
    //BUTTONS,LABELS,FIELDS CREATION
        button1 = new JButton("INFO");
        button2 = new JButton("Start");
        label1 = new JLabel("Label 1");
        
        
        
        
    //ACTION LISTENERS
        
        button1.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null, "CS 204 PROJECT");
            
            }
        });
        
        
        button2.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e){
            //new BridgeCrossingGUI().setVisible(true);
            //new GameDraft().setVisible(true);
            
            //frame.setVisible(false);
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
