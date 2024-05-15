package operadores;

public class Ternario {

    public static void main (String[] args) {
        int a, b;
    
        a = 5;
        b = 6;

        // uso do operador ternario - objetivando abreviação da estrutura if/else
        int resultado = a==b ? 1 : 0 ;
    
        //  Exemplo de condicional utilizando uma estrutura if/else
        // if(a==b)
        //     resultado = "verdadeiro";
        // else
        //     resultado = "falso";
        
        System.out.println(resultado);
    }
    
}
