import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class car extends Applet implements ActionListener
{
  Button b1,b2;
   int i=0;
  public void init()
  {
    //setLayout(new FlowLayout());
    b1=new Button("Start");
    b2=new Button("stop");
    
    add(b1);add(b2);
  b1.addActionListener(this);
  b2.addActionListener(this);
  
  }
  public void paint(Graphics g)
  {  
    
    g.drawRect(100+i,100,150,80);
    g.fillArc(120+i,180,30,30,0,360);
    g.fillArc(180+i,180,30,30,0,360);
   
  }
  public void actionPerformed(ActionEvent ae)
   {
     if(ae.getSource()==b1)
     {
       
       i=i+30;
       repaint();
     }
   
    if(ae.getSource()==b2)
     {
       
       stop();
     }
   }
}
/* <applet code="car" ,width="300",height="400">;
  </applet>
*/