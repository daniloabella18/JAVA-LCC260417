
package Ejemplos;

import java.applet.Applet;
import java.awt.Graphics;

public class Rotacion extends Applet {

    public void init() {
        resize(1360,720);
    }
    
    public void paint(Graphics g){
        int r,cx,cy;
        double ang;
        r=100;
        cx=cy=200;
        
        for(ang=0;ang<=2*Math.PI;ang+=0.01)
        {
            g.clearRect(0,0,500,500);               // Limpia el camino recorrido , se delcara igual que un rectangulo.
            double x=r*Math.cos(ang) + cx;
            double y=r*Math.sin(ang) + cy;
            g.drawRect((int)x, (int)y, 30, 30);
            pausa(5);
        }
    }
    // Funcion Pausa
    public void pausa(int n){
        try{
            Thread.sleep(n);
        }catch(Exception e){
            
        }
    }

}
