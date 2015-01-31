import javax.swing.*;
        
public class Sumas {
        
    public static void main(String[] args) {
        
        int n1, n2, suma;
        String txt="Numero 1", txt2="Numero 2", txt3="Resultado";
        
        n1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número que desea sumar"));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número que desea sumar"));
        
        suma= n1+n2;
        
         JOptionPane.showMessageDialog(null,"La suma es:\n"+txt+"= "+n1+"\n"+txt2+"= "+n2+"\n"+txt3+"= "+suma);

            
        
        
    }
}
