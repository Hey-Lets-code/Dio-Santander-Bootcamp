public class Main {
    public static void main(String[] args) {

        int i;
        int I; // case sensitive
        // int 1a;  não podem começar com números;
        int _1a; // má prática;
        int $aq; // má prática;

        i = 5;
        I= 10;
        $aq = 7;

        final int j = 10; // valor fixo
        // j = 15; // erro, não posso mudar o valor da constante
        int quantidadeProduto =50; // camel case
        int QuantidadeProduto; // não segue a boa prática
        final int NUMERO_TENTATIVAS = 5; // constantes devem seguir essa boa prática
        final int numeroTentativas = 5; // Não é boa prática
        int QUANTIDADE_OPCOES = 25; // Não é boa prática
        int qtdProd; // falta expressividade;

        System.out.println(i);
        System.out.println(I);
        // System.out.println(_1a);
        System.out.println($aq);

        System.out.println("Hello world!");
    }
}