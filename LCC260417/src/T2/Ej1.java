
package T2;

import java.applet.Applet;
import java.awt.Graphics;

public class Ej1 extends Applet {

    public void init() {
        resize(1360,720);
    }
    
    public void paint(Graphics g){
        int r, cx, cy, cxArc, cyArc, itera=1, cambio_a=0, i, rAux;
        double ang,x=0,y;
        int rArc[]=new int[10];
        rAux=r=100;
        cx=cy=200;
        cxArc=cx-r+(r/8);
        cyArc=cy-r+(r/8);
       
        for(i=0;i<=8;i++)
        {
            rArc[i]=rAux*2;
            rAux = rAux - (rAux/8);
        }
 //       rArc=2*r;
        
      //  g.drawArc(cxArc, cyArc, rArc, rArc, 0, 180);
      //  g.clearRect(0,0,1000,500);                    // Limpia el camino recorrido , se delcara igual que un rectangulo.
        for(ang=Math.PI; itera<=8; ang+=0.01)           // 2*Math.PI = 2pi , o sea, la grafica completa
        {
            g.clearRect(0,0,1400,500);
            g.drawArc(cxArc, cyArc, rArc[0], rArc[0], 0, 180);
            g.drawArc(cxArc + rArc[0], cyArc + rArc[0]/16, rArc[1], rArc[1], 180, 180);
            g.drawArc(cxArc + rArc[0] + rArc[1], cyArc + (rArc[0]+rArc[1])/16, rArc[2], rArc[2], 0, 180);
            g.drawArc(cxArc + rArc[0] + rArc[1] + rArc[2], cyArc + (rArc[0]+rArc[1]+rArc[2])/16, rArc[3], rArc[3], 180, 180);
            g.drawArc(cxArc + rArc[0] + rArc[1] + rArc[2] + rArc[3], cyArc + (rArc[0]+rArc[1]+rArc[2]+rArc[3])/16, rArc[4], rArc[4], 0, 180);
            g.drawArc(cxArc + rArc[0] + rArc[1] + rArc[2] + rArc[3] + rArc[4], cyArc + (rArc[0]+rArc[1]+rArc[2]+rArc[3]+rArc[4])/16, rArc[5], rArc[5], 180, 180);
            g.drawArc(cxArc + rArc[0] + rArc[1] + rArc[2] + rArc[3] + rArc[4] + rArc[5], cyArc + (rArc[0]+rArc[1]+rArc[2]+rArc[3]+rArc[4]+rArc[5])/16, rArc[6], rArc[6], 0, 180);
            g.drawArc(cxArc + rArc[0] + rArc[1] + rArc[2] + rArc[3] + rArc[4] + rArc[5] + rArc[6], cyArc + (rArc[0]+rArc[1]+rArc[2]+rArc[3]+rArc[4]+rArc[5]+rArc[6])/16, rArc[7], rArc[7], 180, 180);                    
            
            if ( ang<=Math.PI*2 && cambio_a==0 )
            {   
                x=r*Math.cos(ang) + cx;
                y=r*Math.sin(ang) + cy;
                g.drawOval((int)x, (int)y, 24, 24);
                pausa(3);
            }
            else
            {
                if(cambio_a==0)
                {   
                    cx=cx + r + ( r - (r/8));           // Nueva ubicación del siguiente arco
                    g.drawRect(cx,cy,6,6);              // Creo origen del ciguiente arco
                    r = r - (r/8);                      // Nuevo radio del siguiente arco
                    itera= itera + 1;                   // Numero de arcos actuales
                    cambio_a=1;                         // Posicion de cambio
                    ang=3*Math.PI/2;
                }
            }
            
            if ( ang<=5*Math.PI/2 && cambio_a==1 )
            {
                x=r*Math.sin(ang) + cx;
                y=r*Math.cos(ang) + cy;
                g.drawOval((int)x, (int)y, 24, 24);
                pausa(3);
            }
            else
            {
                if(cambio_a==1)
                {
                    cx=cx + r + ( r - (r/8));           // Nueva ubicación del siguiente arco
//                  g.drawRect(cx,cy,6,6);              // Crea origen del siguiente arco
                    r = r - (r/8);                      // Nuevo radio del siguiente arco
                    itera= itera + 1;                   // Numero de arcos actuales
                    cambio_a=0;                         // Posicion de cambio
                    ang=Math.PI;
                }
            }
        }
    }
    
        // Funcion Pausa
    public void pausa(int n){
        try{
            Thread.sleep(n);
        }catch(Exception e){}
    }
}
