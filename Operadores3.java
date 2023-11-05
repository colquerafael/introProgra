//Operadores de incremento y decremento

public class Operadores3{
    public static void main(String[] args){
        int x = 5;
        
        x++; //para incrementar en 1 (le suma 1 más)
        x--; //para decrementar en 1 (le resta 1 menos)
        
        int a = 5, b;
        b = a++;    /* (este es SUFIJO despues de la variable.)Aqui estamos haciendo la asignacion de b a 'a'
        es decir a vale 5 por lo tanto b valdria 5, DESPUES incrementamos 1 mas. Primero asignamos el valor, 
        despues incrementamos*/
        
        //en este caso seria asi
        b = ++a; //PREFIJO = antes de la variable(PRIMERO aumentamos el valor de 'a' y despues asignamos a 'b') lo mismo con lo de la resta. 
        
        System.out.print(x);
        
    }
}