package Pergunta8;

public class NumeroC {

    public Integer c(int a, int b){

        StringBuilder construcaoDeC = new StringBuilder();

        char[] numerosDeA = Integer.valueOf(a).toString().toCharArray();
        char[] numerosDeB = Integer.valueOf(b).toString().toCharArray();

        int construcaoDeNumeros = numerosDeA.length >= numerosDeB.length ? numerosDeA.length : numerosDeB.length;

        for (int i = 0; i < construcaoDeNumeros; i++) {

            if (numerosDeA.length > i) {
                construcaoDeC.append(numerosDeA[i]);
            }

            if (numerosDeB.length > i) {
                construcaoDeC.append(numerosDeB[i]);
            }
        }

        Integer intercalar = Integer.valueOf(construcaoDeC.toString());

        if (intercalar > 1000000) {
            return -1;
        }

        return intercalar;
    }

    public static void main(String[] args) {
        NumeroC nc = new NumeroC();
        System.out.println(nc.c(641, 76));
    }
}
