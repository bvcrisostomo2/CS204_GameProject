package Gui;
import java.applet.Applet;
import java.awt.Graphics;
import javax.swing.JFrame;

public class GameDraft extends GameLoop{
    public Thread th;
    public void GameDraft(){
        init();
        setVisible(true);
       
    }
    
    public void init(){
        setSize(854,480);
        th = new Thread(this);
        th.start();
        offscreen = createImage(854,480);
        d = offscreen.getGraphics();
        addKeyListener(this);
        
        
        
    }
    
    public void paint(Graphics g){
        d.clearRect(0, 0, 854, 480);
        //Background
        d.drawImage(backgroundColor,0,0,this);
        d.drawImage(floor,0,0,this);
        
        //d.drawImage(background,0,0,this);
        
        
        
        d.drawImage(wallsTop,0,0,this);
        
        d.drawImage(btmWall,0,0,this);
        d.drawImage(botDoor,0,0,this);
        d.drawImage(table,500,30,this);
        if(isPresentKumoT==false){
        d.drawImage(treats,515,30,this);
        }
        d.drawImage(floorMat,0,0,this);
        //Character
        
        if(isPresentKumo==false){
            d.drawImage(kumoIdle,120,50,this);
        }else{
            d.drawImage(kumoIdle,600,200,this);
        }
        
        if(isPresentWendigo==false){
            d.drawImage(wendigoIdle,120,325,this);
        }
        else{
            d.drawImage(wendigoIdle,600,270,this);
        }
        
        
        
        d.drawImage(bridge,0,0,this);
        d.drawImage(person,x,y,this);
        
        //Sa baba ng tao
        
        d.drawImage(topWall,0,0,this);
        d.drawImage(dividers,0,0,this);
        d.drawImage(topDoor,0,2,this);
        d.drawImage(border,0,0,this);
         
        //d.drawOval(x, y, 20, 20);
        g.drawImage(offscreen,0,0,this);
    }
    
    public void update(Graphics g){
        paint(g);
    }
}
