package T2;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ej5 extends Applet {

    public void init() {
        resize(1366,768);
    }
    
    private double i = 0;
 
    public int getGrados() {
        return (int) i;
    }
 
    public void setGrados(int grados) {
        this.i = grados;
        repaint();
    }
 
    public void paint(Graphics g) {
        
        int cx,cy,r,a;
        double rad;
        
        AffineTransform at = new AffineTransform();
        cx=600;
        cy=360;
        a=200;
        
        for ( i=0 ; i<300 ; i = i + 0.001 )
        {
            g.clearRect(0,0,1370,750);  

            at.rotate(-0.001, cx, cy);                      //se asigna el angulo y centro de rotacion
            ((Graphics2D) g).setTransform(at);
            
            
//---------/ Circulo interior /--------------------------//

            // Círculo superior interior (blanco) - lado izquierdo
            g.setColor(Color.black);
            g.fillArc(cx - a, cy - a, a*2, a*2, 90, 180);
        
            // Círculo inferior interior (blanco) - lado derecho
            g.setColor(Color.white);
            g.fillArc(cx - a, cy - a, a*2, a*2, -90, 180);

//---------/ Circulo exterior /--------------------------//

            // Círculo der. exterior (blanco)
            g.setColor(Color.black);
            g.fillArc(cx-(a/2), cy, a, a, -90, 180);
            
            // Círculo izq. exterior (negro)
            g.setColor(Color.white);
            g.fillArc(cx-(a/2), cy-a, a, a, 90, 180);
            
//---------/ Circulo interior opuesto /--------------------------//        
      
//      Círculo izquierdo interior ( blanco en negro )
        g.setColor(Color.black);
        g.fillArc(cx - (a/8), cy - ( (a/2) + (a/8) ) , a/4, a/4, 0, 360);
        
//      Círculo izquierdo interior ( negro en blanco )
        g.setColor(Color.white);
        g.fillArc(cx - (a/8), cy + ( (a/2) - (a/8) ) , a/4, a/4, 0, 360);
          
        pausa(1);
        }     
    }
    
       public static void main(String ad[])
    {

        JFrame jp1 = new JFrame();
        Ej5 a=new Ej5 ();
        jp1.getContentPane().add(a, BorderLayout.CENTER);
        jp1.setSize(new Dimension(1366,768));
        jp1.setVisible(true);

    }
       
        // Funcion Pausa
    public void pausa(int n){
        try{
            Thread.sleep(n);
        }catch(Exception e){
            
        }
    }
    
}
    
