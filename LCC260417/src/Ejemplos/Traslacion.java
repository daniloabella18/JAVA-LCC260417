
package Ejemplos;

import java.applet.Applet;
import java.awt.Graphics;

public class Traslacion extends Applet {

    public void init() {
        resize(1360,720);
    }

    public void paint(Graphics g){
        for(int i=0; i<200; i++ ){
            g.clearRect(0, 0, 500, 500);
            g.drawRect(i, 10, 20, 20);
            g.drawRect(10, i, 20, 20);
            g.drawRect(i, i, 20, 20);
            pausa(20);
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
