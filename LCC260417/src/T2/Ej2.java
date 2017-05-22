
package T2;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Event;
import java.awt.Graphics;

public class Ej2 extends Applet {

    int f=0;
    Button b;
    
    public void init() {
        resize(1360,720);
        setLayout(null);
        b=new Button("Activar");
        
        add(b);
        b.setBounds(565,40,100,30);
    }
    
    public void paint(Graphics g){
        int a,cx,cy,d,c,z,rect=4;
        double x, xAux=0;
        a=30;
        z=220;
        d=360;
        c=70;
        cx=260;
        cy=250;
 
        if ( f==1 )
        {
//--------------/ Rectangulos /--------------------------//  
                // Rectangulo #1
                g.drawRect(cx + d , cy, c, z);
                
                // Rectangulo #2
                g.drawRect(cx + d + c + 2 , cy, c, z);
                
                // Rectangulo #3
                g.drawRect(cx + d + c*2 + 4, cy, c, z);
                
                // Rectangulo #4
                g.drawRect(cx + d + c*3 + 6, cy, c, z);
                
            for( rect=4; rect >= 1; rect= rect-1 )
            {
//--------------/ Pelota /--------------------------// 
                
                // Del. Rectangulo #1
                if( rect==4)
                {   
                    for( x=0; (cx - (a/2) + x) <= (cx + d - a); x+= 0.8 )
                    {   //Pelota Mov.
                        g.clearRect(cx - (a/2) , cy - (a/2), d + (a/2), z);
                        g.fillOval((int) (cx - (a/2) + x), cy + ( (z/2) - (a/2) ), a, a); 
                        xAux=x;
                        pausa(1);
                    }
                    // Borrar rectangulo
                    g.clearRect(cx + d , cy, c + 2, z + 2);
                    
                    for( x=xAux; x >= 0; x-= 0.8 )
                    {   //Pelota Mov.
                        g.clearRect(cx - (a/2) , cy - (a/2), d + (a/2), z);
                        g.fillOval((int) (cx - (a/2) + x), cy + ( (z/2) - (a/2) ), a, a); 
                        pausa(1);
                    } 
                }
                
                // Del. Rectangulo #2
                if( rect==3)
                {   
                    for( x=0; (cx - (a/2) + x) <= (cx + d + c - a); x+= 0.8 )
                    {   //Pelota Mov.
                        g.clearRect(cx - (a/2) , cy - (a/2), d + (a/2) + c, z);
                        g.fillOval((int) (cx - (a/2) + x), cy + ( (z/2) - (a/2) ), a, a); 
                        xAux=x;
                        pausa(1);
                    }
                    // Borrar rectangulo
                    g.clearRect(cx + d + c , cy, c + 4, z + 4);
                    
                    for( x=xAux; x >= 0; x-= 0.8 )
                    {   //Pelota Mov.
                        g.clearRect(cx - (a/2) , cy - (a/2), d + (a/2) + c, z);
                        g.fillOval((int) (cx - (a/2) + x), cy + ( (z/2) - (a/2) ), a, a); 
                        pausa(1);
                    } 
                }                            
                                
                // Del. Rectangulo #3
                if( rect==2)
                {   
                    for( x=0; (cx - (a/2) + x) <= (cx + d + c*2 - a); x+= 0.8 )
                    {   //Pelota Mov.
                        g.clearRect(cx - (a/2) , cy - (a/2), d + (a/2) + c*2, z);
                        g.fillOval((int) (cx - (a/2) + x), cy + ( (z/2) - (a/2) ), a, a); 
                        xAux=x;
                        pausa(1);
                    }
                    // Borrar rectangulo
                    g.clearRect(cx + d + c*2 , cy, c + 6, z + 6);
                    
                    for( x=xAux; x >= 0; x-= 0.8 )
                    {   //Pelota Mov.
                        g.clearRect(cx - (a/2) , cy - (a/2), d + (a/2) + c*2, z);
                        g.fillOval((int) (cx - (a/2) + x), cy + ( (z/2) - (a/2) ), a, a); 
                        pausa(1);
                    } 
                }  
                
                // Del. Rectangulo #4
                if( rect==1)
                {   
                    for( x=0; (cx - (a/2) + x) <= (cx + d + c*3 - a); x+= 0.8 )
                    {   //Pelota Mov.
                        g.clearRect(cx - (a/2) , cy - (a/2), d + (a/2) + c*3, z);
                        g.fillOval((int) (cx - (a/2) + x), cy + ( (z/2) - (a/2) ), a, a); 
                        xAux=x;
                        pausa(1);
                    }
                    // Borrar rectangulo
                    g.clearRect(cx + d + c*3 , cy, c + 8, z + 8);
                    
                    for( x=xAux; x >= 0; x-= 0.8 )
                    {   //Pelota Mov.
                        g.clearRect(cx - (a/2) , cy - (a/2), d + (a/2) + c*3, z);
                        g.fillOval((int) (cx - (a/2) + x), cy + ( (z/2) - (a/2) ), a, a); 
                        pausa(1);
                    } 
                } 
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
        if (arg=="Activar")
        {   
            if(f==0){   f=1;    }else{  f=0;    }
        }
        repaint();
        return true;
    }

}
