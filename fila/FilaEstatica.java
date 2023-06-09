package fila;

import java.util.LinkedList;
import java.util.Queue;

public class FilaEstatica {
    private int[] dados; //valores no vetor
    private int tamanho,
    prim,
    ult; //tamanho do vetor, primeiro e ultimo valor
    public FilaEstatica() {
        dados = new int[10]; //vetor tem 10 valores
        prim = 0;
        ult = 0;
        tamanho = 0;
    }
    public FilaEstatica(int capacidade) {
        dados = new int[capacidade]; //dá outro valor à capacidade do vetor
        prim = 0;
        ult = 0;
        tamanho = 0;
    }
    public boolean estaVazia() {
        return tamanho == 0; // se a lista está vazia ele retorna 0
    }
    public boolean estaCheia() {
        return tamanho == dados.length; //se a lista está cheia retorna o tamanho dos dados
    }
    int proxima(int pos) {
        return (pos + 1) % dados.length; //proxima retorna o valor da posicao mais 1
    }
    public void enfilera(int i) {
        dados[ult] = i; //a ultima posicao do vetor com o tamanho dado pelos dados é igual a i agora
        ult = proxima(ult); // o ultimo agora é o proximo ao ultimo ( o que foi inserido)
        tamanho++; // tamanho do vetor aumenta em 1
    }
    public int desenfilera() {
        int i = dados[prim];  // i é o valor que esta na primeira posicao do vetor de acordo com os dados
        prim = proxima(prim); // primeiro agora é o proximo a ele e o primeiro sai
        tamanho--; // tamanho diminui em 1
        return i; // retorna o vetor
    }

    public static Queue<Integer> mergeQueues(
        Queue<Integer> dados1,
        Queue<Integer> dados2
    ) {
        Queue<Integer> resultado = new LinkedList<Integer>();

        while (
            !((FilaEstatica)dados1).estaVazia() || !((FilaEstatica)dados2).estaVazia()
        ) {
            if (!((FilaEstatica)dados1).estaVazia()) {
                resultado.offer(dados2.poll());
            }
            if (!((FilaEstatica)dados2).estaVazia()) {
                resultado.offer(dados2.poll());
            }
        }
        return resultado;
    }

    @Override public String toString() {
        String s = "fila: ";
        if (estaVazia()) {
            s += "esta vazia";
        } else {
            int i = prim;
            do {
                s += dados[i] + " ";
                i = proxima(i);
            } while (i != ult);
        }
        return s;
    }
    public String oVetor() {
        String s = "";
        if (estaVazia()) 
            for (int i = 0; i < dados.length; i++) 
                s += "_ ";
            else if (estaCheia()) 
                for (int i = 0; i < dados.length; i++) 
                    s += dados[i] + " ";
    else if (prim < ult) {
            for (int i = 0; i < prim; i++) 
                s += "_ ";
            for (int i = prim; i < ult; i++) 
                s += dados[i] + " ";
            for (int i = ult; i < dados.length; i++) 
                s += "_";
            }
        else { //prim > ult}
            for (int i = 0; i < ult; i++) 
                s += dados[i] + " ";
            for (int i = ult; i < prim; i++) 
                s += "_ ";
            for (int i = prim; i < dados.length; i++) 
                s += dados[i] + " ";
            }
        return s;
    }

    public int posicaoDeX(int x) {
        int posicaoVetor = prim;
        int posicao = 1;
        while (posicao <= tamanho) {
            if (x == dados[posicaoVetor]) {
                return posicao;
            }
            posicaoVetor = proxima(posicaoVetor);
            posicao++;
        }
        return -1;
    }
}
