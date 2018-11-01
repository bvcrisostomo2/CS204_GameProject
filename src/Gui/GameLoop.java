package Gui;

import BridgeCrossing.BridgeCrossingGUI;
import DijkstraGame.Challenge;
import Knapsack.KnapsackChallenge;
import java.applet.Applet;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;

import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;


public class GameLoop extends Applet implements Runnable, KeyListener{
    public boolean isPresentKumo = false;
    public boolean isPresentKumoT = false;
    public boolean isPresentWendigo = false;
    public boolean isPresentIvar = true;
    public boolean key = false;
    public int x,y;
    public Random rand = new Random();
    public Image offscreen;
    public Graphics d;
    public boolean up,down,left,right;
    public BufferedImage background,backgroundColor,
            foreground,btmWall,topWall,topDoor,botDoor,floor,
            wallsTop,dividers,border,floorMat,bridge,
            
            table,treats,kumoBridge,
            
            walkLeftIdle,walkLeftMoving1,walkLeftMoving2,
            walkRightIdle,walkRightMoving1,walkRightMoving2,
            walkDownIdle,walkDownMoving1,walkDownMoving2,
            walkUpIdle,walkUpMoving1,walkUpMoving2,
            w2,w3,w4,
            
            test,
            
            person,kumoIdle,wendigoIdle; 
    public int counterLeft;
    public int counterRight;
    public int counterDown;
    public int counterUp;
    private Component frame;
    public void run() {
        //Spawn Point
        x = 353;
        y = 257;
        
        try {
            background = ImageIO.read(this.getClass().getResource("img/background2.png"));
            backgroundColor = ImageIO.read(this.getClass().getResource("img/water.png"));
            
            border = ImageIO.read(this.getClass().getResource("img/border.png"));
            btmWall = ImageIO.read(this.getClass().getResource("img/bottom of wall many.png"));
            topWall = ImageIO.read(this.getClass().getResource("img/top of wall many.png"));
            topDoor = ImageIO.read(this.getClass().getResource("img/top door.png"));
            botDoor = ImageIO.read(this.getClass().getResource("img/bottom door.png"));
            table = ImageIO.read(this.getClass().getResource("img/table.png"));
            floorMat = ImageIO.read(this.getClass().getResource("img/FloorMatExit.png"));
            bridge = ImageIO.read(this.getClass().getResource("img/bridge.png"));
            floor = ImageIO.read(this.getClass().getResource("img/floor_1.png"));
            dividers = ImageIO.read(this.getClass().getResource("img/dividers.png"));
            wallsTop = ImageIO.read(this.getClass().getResource("img/PaderTOP.png"));
            
            treats = ImageIO.read(this.getClass().getResource("img/treats.png"));
            
            kumoIdle = ImageIO.read(this.getClass().getResource("img/kumo.png"));
            kumoBridge = ImageIO.read(this.getClass().getResource("img/kumo.png"));
            
            
            wendigoIdle = ImageIO.read(this.getClass().getResource("img/wendigo.png"));
            
            test = ImageIO.read(this.getClass().getResource("img/threeCharIdle.png"));
            
            
            walkLeftIdle = ImageIO.read(this.getClass().getResource("img/walk_left_idle.png"));
            walkLeftMoving1 = ImageIO.read(this.getClass().getResource("img/walk_left_moving1.png"));
            walkLeftMoving2 = ImageIO.read(this.getClass().getResource("img/walk_left_moving2.png"));
            
            walkRightIdle = ImageIO.read(this.getClass().getResource("img/walk_right_idle.png"));
            walkRightMoving1 = ImageIO.read(this.getClass().getResource("img/walk_right_moving1.png"));
            walkRightMoving2 = ImageIO.read(this.getClass().getResource("img/walk_right_moving2.png"));
            
            walkDownIdle = ImageIO.read(this.getClass().getResource("img/walk_down_idle.png"));
            walkDownMoving1 = ImageIO.read(this.getClass().getResource("img/walk_down_moving1.png"));
            walkDownMoving2 = ImageIO.read(this.getClass().getResource("img/walk_down_moving2.png"));
            
            walkUpIdle = ImageIO.read(this.getClass().getResource("img/walk_up_idle.png"));
            walkUpMoving1 = ImageIO.read(this.getClass().getResource("img/walk_up_moving1.png"));
            walkUpMoving2 = ImageIO.read(this.getClass().getResource("img/walk_up_moving2.png"));
        } catch (IOException ex) {
            Logger.getLogger(GameLoop.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        person = walkDownIdle;
        
        int fps=0;
        int counterFps=0;
        while(true){
            counterFps++;
            if (counterFps==100){
            fps = rand.nextInt(120);
    //      System.out.println(fps+"fps 1ms packet loss: 0%");
            counterFps=0;
            }

            

            //Walk Left Sprite Animation
            counterLeft++;
            if (counterLeft>=15){
                counterLeft = 0;
            }
            if (counterLeft <= 5 && left == true){
                person = walkLeftIdle;
            }
            if (counterLeft >=5 && counterLeft <=10 && left == true){
                person = walkLeftMoving1;
            }
            if (counterLeft <=10 && counterLeft <=5 && left == true){
                person = walkLeftIdle;
            }
            if (counterLeft >= 10 && counterLeft <=15 && left == true){
                person = walkLeftMoving2;
            }
            //Walk Right Sprite Animation
            counterRight++;
            if (counterRight>=15){
                counterRight = 0;
            }
            if (counterRight <= 5 && right == true){
                person = walkRightIdle;
            }
            if (counterRight >=5 && counterRight <=10 && right == true){
                person = walkRightMoving1;
            }
            if (counterRight <=10 && counterRight <=5 && right == true){
                person = walkRightIdle;
            }
            if (counterRight >= 10 && counterRight <=15 && right == true){
                person = walkRightMoving2;
            }
            
            //Walk Right Sprite Animation
            counterDown++;
            if (counterDown>=15){
                counterDown = 0;
            }
            if (counterDown <= 5 && down == true){
                person = walkDownIdle;
            }
            if (counterDown >=5 && counterDown <=10 && down == true){
                person = walkDownMoving1;
            }
            if (counterDown <=10 && counterDown <=5 && down == true){
                person = walkDownIdle;
            }
            if (counterDown >= 10 && counterDown <=15 && down == true){
                person = walkDownMoving2;
            }
            
            counterUp++;
            if (counterUp>=15){
                counterUp = 0;
            }
            if (counterUp <= 5 && up == true){
                person = walkUpIdle;
            }
            if (counterUp >=5 && counterUp <=10 && up == true){
                person = walkUpMoving1;
            }
            if (counterUp <=10 && counterUp <=5 && up == true){
                person = walkUpIdle;
            }
            if (counterUp >= 10 && counterUp <=15 && up == true){
                person = walkUpMoving2;
            }
            //Actual Movement of Position of Sprite
            if(left == true){
                x--; 
            }
            if(right == true){
                x++; 
            }
            if(up == true){
                y--; 
            }
            if(down == true){
                y++; 
            }
            
          //BOUNDS NA MAY EVENTS//BRIDGE
            if(x>=639 && y>230 && y<300){
                x=590;
                up = false;
                down = false;
                left = false;
                 //INSERT BRIDGE CROSSING HERE
                if (isPresentKumoT && isPresentKumo && isPresentWendigo && isPresentIvar){
                    BridgeCrossingGUI bc = new BridgeCrossingGUI();
                    bc.setVisible(true);
                    key = true;
                }else
                    JOptionPane.showMessageDialog(frame, "Incomplete Characters! Make sure to save others first before heading to the bridge");
                
                right = false;
                right = false;
                right = false;
                
            }
          //LEFT EXIT DOOR  
            if(x<=50 && y>230 && y<300){
                x=150;
                up = false;
                down = false;
                left = false;
                 //INSERT BRIDGE CROSSING HERE
                 if (key){
                    KnapsackChallenge c = new KnapsackChallenge();
                    c.setVisible(true);
                    
                }else{
                    JOptionPane.showMessageDialog(frame, "You don't have the key, get the key from the bridge!");
                }
                right = false;
                right = false;
                right = false;
                
            }
            //KUMO
             if(x<=150 && y>10 && y<50){
                x=210;
                up = false;
                down = false;
                left = false;
                Challenge c1 = new Challenge("K");
                c1.setVisible(true);
                isPresentKumo = true;
                right = false;
                right = false;
                right = false;
                
            }
            
             //Kumo's Treats
            if (x>=480 && x<=530 && y<=40){
                x=470;
                up = false;
                down = false;
                left = false;
                Challenge c2 = new Challenge("KT");
                c2.setVisible(true);
                isPresentKumoT = true;
                right = false;
                right = false;
                right = false;
            }
            
            //Wendigo's Treats
            if (x<=160 && x>=100 && y>=300 && y<=400){
                y=290;
                x=130;
                up = false;
                down = false;
                left = false;
                Challenge c3 = new Challenge("W");
                c3.setVisible(true);
                isPresentWendigo = true;
                right = false;
                right = false;
                right = false;
            }
         
            
            //BOUNDS
            //X bounderies of walking area
            if(x>=639){
                x=639;  
            }
            
            if(x<=0){
                x=0;  
            }
            
            
            //Y bounderies
            if(y<=30){
                y=30;  
            }
            if(y>=430){
                y=430;  
            }
            
            
            
            
            //Upper Wall Corridor
            if(y==180){
                y=183;  
            }
            if(y==130){
                y=129;  
            }
            
            //Upper Wall Divider
            if(x==340 && y<170){
                x=339;
            }
            if(x==360 && y<170){
                x=361;
            }
            
            //Door to Kumo from corridor
            if(x>230 && x<270 && y==182){
                y=110;  
            }
            
            //Door to corridor from kumo
            if(x>230 && x<270 && y==120){
                y=190;  
            }
            
            
            //Door to Kumo's Treats from corridor
            if(x>490 && x<530 && y==182){
                y=110;  
            }
            //Door to corridor from Kumo's Treats
            if(x>490 && x<530 && y==120){
                y=190;  
            }
            
          
            
            
            
            
                
            
            
            repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    
    public void keyTyped(KeyEvent e) {
        
    }

    //Button Mapping
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode()==37){
            left = true;
        }
        if (e.getKeyCode()==38){
            up = true;
        }
        if (e.getKeyCode()==39){
            right = true;
        }
        if (e.getKeyCode()==40){
            down = true;
        }
    }

    
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode()==37){
            left = false;
        }
        if (e.getKeyCode()==38){
            up = false;
        }
        if (e.getKeyCode()==39){
            right = false;
        }
        if (e.getKeyCode()==40){
            down = false;
        }
    }
    
}
