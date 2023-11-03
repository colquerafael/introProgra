//ENTRADA Y SALIDA DE DATOS CON JOPTIONPANE.

import javax.swing.JOptionPane; //importamos la clase primero, para ventanas emergentes.
public class EntradaSalidaDeDatosConJOptionPane{
    public static void main(String []args){
        
        String cadena;
        int entero;
        char letra;
        double decimal;
        
        cadena = JOptionPane.showInputDialog("Digite una cadena: ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero: ")); //INTEGER para que el string sea un entero
        letra = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal: "));
        
        JOptionPane.showMessageDialog(null,"La cadena es; "+ cadena);
        JOptionPane.showMessageDialog(null,"El entero es; "+ entero);
        JOptionPane.showMessageDialog(null,"La letra es; "+ letra);
        JOptionPane.showMessageDialog(null,"El decimal es; "+ decimal);
        
        //JOPTIONPANE es para una interfaz mucho mas grafica y creativa
        
    }
}