
package T2;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Event;
import java.awt.Graphics;

public class Ej3 extends Applet {

    int f=0;
    Button b;
    
    public void init() {
        resize(1360,720);
        setLayout(null);
        b=new Button("Giro");
        
        add(b);
        b.setBounds(565,40,100,30);
    }
    
    public void paint(Graphics g){
        int r,cx,cy;
        double x,y,ang;
        r=100;
        cx=600;
        cy=290;
        
        if ( f==1 )
        {
            for(ang=0;ang<=2*Math.PI;ang+=0.01)
            {
                g.clearRect(0,0,1370,750);                          // Limpia el camino recorrido , se delcara igual que un rectangulo.
                g.fillOval(cx - (r/16) , cy - (r/16), 30, 30);
                // Ciruclo #1
                x = r*Math.sin(ang + Math.PI/2) + cx;
                y = r*Math.cos(ang + Math.PI/2) + cy;
                g.drawOval((int)x, (int)y, 30, 30);
                // Ciruclo #2
                x = (r+(r/2))*Math.cos(ang) + cx;
                y = (r+(r/2))*Math.sin(ang) + cy;
                g.drawOval((int)x, (int)y, 30, 30);
                // Ciruclo #3
                x = (r*2)*Math.sin(ang + Math.PI/2) + cx;
                y = (r*2)*Math.cos(ang + Math.PI/2) + cy;
                g.drawOval((int)x, (int)y, 30, 30);
                pausa(5);
            }
        }
    }
    
    // Funcion Pausa
    public void pausa(int n){
        try{
            Thread.sleep(n);
        }catch(Exception e){
            
        }
    }
    
    public boolean action(Event evt, Object arg){
        if (arg=="Giro")
        {   
            if(f==0){   f=1;    }else{  f=0;    }
        }
        repaint();
        return true;
    }

}
