
package Ejemplos;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.TextField;

public class BotonCuadro extends Applet {

    int f=0;
    Button a;
    TextField b;
    public void init() {
        resize(1360,720);
        setLayout(null);
        b=new TextField(10);
        a=new Button("Cuadrado");
        
        add(a);
        add(b);
        a.setBounds(100,100,100,30);
        b.setBounds(100,50,100,30);
    }
    
    public void paint(Graphics g){
        int x,y,R,G,B;
        if (f==1)
        {
            a.setVisible(false);                    // Dice si muestra o no el botton, ( True ) , ( False )
            int n=Integer.parseInt(b.getText());    // Transforma en entero "b" y lo guarda en "n".
        
         for ( int i=0; i<n; i++)
            {
                x=(int) (Math.random()*400);
                y=(int) (Math.random()*400);
                R=(int) (Math.random()*256);
                G=(int) (Math.random()*256);
                B=(int) (Math.random()*256);
                g.setColor(new Color(R,G,B));
                g.fillRect(x, y, 40, 40);
            }
        }
    }
    
    public boolean action(Event evt, Object arg){
        if (arg=="Cuadrado")
        {   
            f=1;
        }
        repaint();
        return true;
    }

}
