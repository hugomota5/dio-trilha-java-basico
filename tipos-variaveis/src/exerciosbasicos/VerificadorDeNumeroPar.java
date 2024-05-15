package exerciosbasicos;
// exercicio03 - Crie um método que verifique se um número é par ou ímpar e imprima o resultado.
public class VerificadorDeNumeroPar {
    
    public static void main(String[] args) {
        
        int numeroInicial = 7;
        int numeroFinal = numeroInicial % 2;
        if (numeroFinal == 0)
            System.out.println("O número " + numeroInicial + " é par!");
        else
            System.out.println("O número " + numeroInicial + " é impar!");
    }
}
