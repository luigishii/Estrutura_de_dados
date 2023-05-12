public class Pilha {
    private char[] dados;
    private int topo=0;
    public Pilha (int capacidade) {
        dados = new char[capacidade];
    }
    public boolean estaVazia() {
        return topo == 0;
    }
    public boolean estaCheia() {
        return topo == dados.length;
    }
    public void push (char s) {
        dados[topo++] = s;
    }
    public char pop () {
        return dados[--topo];
    }
    public int busca (char s) {
        int i, pos;
        for (i=topo, pos=1; i>0; i--, pos++) {
            if (dados[i-1] == s)
                return pos;
        }
        return -1;
    }
    public char consultaTopo () {
        return dados[topo-1];
    }
}