import java.util.Scanner;  //importamos esta libreria de Java para poder usar la clase Scanner.

public class EntradaDatos{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in); //instanciar este scanner con "NEW" (Para guardar datos)
        
        int numero; 
        System.out.print("Digite un numero: ");
        numero = entrada.nextInt(); //Para guardar en nuestra variable.
        
        System.out.print("El numero es: "+ numero);
        
        String cadena;
        System.out.print("Escriba una cadena");
        cadena = entrada.nextLine();  //NEXTLINE para guardar cadenas con espacios dentro.
        
        System.out.print("El cadena es: "+ cadena);
        
        char letra;
        System.out.print("Escriba una letra: ");
        letra = entrada.nextLine() .charAt(0);  //CHARAT (0) para que lea solamente un solo caracter.
        
        System.out.print("El cadena es: "+ letra);
        
    }
}