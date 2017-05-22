
package Ejemplos;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;

public class Botontexto extends Applet {

    Button a,b;
    int f=0;
    public void init() {
        setLayout(null);
        a=new Button("Cuadrado");
        b=new Button("Circulo");
        // Poner lo objetos en el visor
        add(a);
        add(b);
        a.setBounds(100, 100, 100, 30);
        a.setBackground(Color.red);
        
        b.setBounds(100, 150, 100, 30);
        b.setBackground(Color.blue);
        b.setForeground(Color.WHITE);
    }

    public void paint(Graphics g){
        int x=(int)(Math.random()*300); // Distancia máxima en ej X.
        int y=(int)(Math.random()*300); // Distancia máxima en ej Y.
        int R=(int)(Math.random()*256); // 256 colores
        int G=(int)(Math.random()*256);
        int B=(int)(Math.random()*256);
        
        g.setColor(new Color(R,G,B));
        if (f==1){
            g.drawRect(x,y,40,40);
            f=0;
        }
        if (f==2){
            g.fillOval(x,y,40,40);
            f=0;
        }
    }
    
    public boolean action(Event evt, Object arg){
        if (arg=="Cuadrado") f=1;
        if (arg=="Circulo")  f=2;
        repaint();
        return true;
    }
}
