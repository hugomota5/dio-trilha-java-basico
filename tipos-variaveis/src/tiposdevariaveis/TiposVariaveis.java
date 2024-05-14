package tiposdevariaveis;
public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // utilizar "." para separar as casas decimais - convenção americana
        double salarioMinimo = 1640.33;
        // 
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; //se começar com zero, talvez tenha que colocar o tipo 
        long cpf = 9875465112332L; //se começar com zero, talvez tenha que colocar o tipo 
        float pi = 3.14F; // acrescentar o F no final para força o tipo float
        double salario = 1275.33;
        // 
        short numeroCurto =1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        // 
        int numero = 5;
        // alterando variável
        numero = 10;

        System.out.println(numero);

        // valor do pi usando constante
        final double VALOR_DE_PI = 3.14; // UTILIZANDO EM NOME DE VARIÁVEL EM CAIXA ALTA POR CONVENÇÃO


    }
}
