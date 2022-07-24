public class Main {
    public static void main(String[] args) {

        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        // short s2 = 40000; retorna um erro, pq está ultrapassando o limite de dados

        // int i1 = -10000000000000000; é muito abaixo do que um número inteiro
        // pode suportar
        int i2 = 28500;

        long l1 = 100000000000000000L;
        long l2 = 200400500505550000L;
        // Se retirar o L retornará erro, se usar o L no final você declara

        // float f1 = 4.5; sem o f no final, o java identifica como double
        float f2 = 10.65F; // esse possui o f no final

        double d1 = 85.69; // já infere que é double
        double d2 = 99.84d; // d maiusculo ou minusculo

        char c1 = 'W';
        // char c2 = 'Tw'; retorna erro
        char c3 = '\u0057'; // código unicode de um caractere, nesse caso
        // esse código é igual a 'W';

        String st1 = "Fulano"; // tem que usar ""
        String st2 = "Cicrano";
        String st3 = "Fulano Cicrano Beltrano 123";

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(bo1);
        System.out.println(bo2);



    }
}