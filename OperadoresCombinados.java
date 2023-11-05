//Operadores aritmeticos combinados con asignacion.

public class OperadoresCombinados{
    public static void main(String []args){
        int numero = 10;
        
        //numero = numero + 5;    //puede ser lo mismo que abajo
        numero += 5;
        numero -= 5;    //resta
        numero /= 5;    //division 
        //ahorramos mucho codigo.
        
        System.out.print("El numero es: "+ numero);
        
    }
}