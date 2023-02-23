package ejecutable;

import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args) {
        int a,b,c ;
        double p1,r,x1,x2;

        a= Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de a: "));
        b= Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de b: "));
        c= Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de c: "));
        
        p1=(Math.pow(b, 2))-(4*(a-c));
        r=Math.pow(p1,0.5 ) ;
        if (p1>=0)
        {
            x1=((-b)+r)/(2*a);
            JOptionPane.showMessageDialog(null, "El valor de x1 es "+x1);
            x2=((-b)-r)/(2*a);
            JOptionPane.showMessageDialog(null, "El valor de x2 es "+x2);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El Resultado es imaginario");

        }


    }
}
