
package Ejemplos;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.TextField;

public class CuadroTexto extends Applet {

    TextField a,b,c;
    public void init() {
        resize(1360,720);
        a=new TextField(10);
        b=new TextField(10);
        c=new TextField(10);
        setLayout(null);                    // Se eleimina la estructura por defecto del cuadro de texto para personalizarla.
        // Poner lo objetos en el visor
        add(a);
        add(b);
        add(c);
        a.setBounds(100,100,100,20);         // Se personaliza la estructura del cuadro de texto.
        a.setBackground(Color.yellow);  // Pone color de fondo en el cuadro de texto.
        a.setForeground(Color.blue);       // Color letra
        
        b.setBounds(220,100,100,20);         // Se personaliza la estructura del cuadro de texto.
        b.setBackground(Color.yellow);  // Pone color de fondo en el cuadro de texto.
        b.setForeground(Color.blue);       // Color letra
        
        c.setBounds(340,100,100,20);         // Se personaliza la estructura del cuadro de texto.
        c.setBackground(Color.yellow);  // Pone color de fondo en el cuadro de texto.
        c.setForeground(Color.blue);       // Color letra
    }

    //  Guarda lo escrito en "s" y lo muestra en la consola abajo.
    public void paint(Graphics g){
        String s=a.getText();
        System.out.println(s);
    }
    
    public boolean action(Event evt, Object arg){
        repaint();
        return true;
    }
}
