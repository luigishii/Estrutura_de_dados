public class ListaSimples {
    private No primeiro;
    //por clareza
    public ListaSimples () {
        setPrimeiro(null);
    }
    //métodos de acesso
    public No getPrimeiro() {
        return this.primeiro;
    }
    public void setPrimeiro (No primeiro) {
        this.primeiro = primeiro;
    }
    public boolean estaVazia() {
        return this.primeiro == null;
    }
    public void insereInicio (int i) {
        No novo = new No(i);
        if (!this.estaVazia()) {
            novo.setProximo(this.primeiro);
        }
        setPrimeiro(novo);
    }
    @Override
    public String toString () {
        //String msg = "lista: ";
        String msg = "";
        if (this.estaVazia()) {
            msg = msg + "vazia";
        }
        else {
            No aux = this.primeiro;
            while (aux != null) { //busca final da lista
                msg = msg + aux + " ";
                aux = aux.getProximo();
            }
            msg = msg + "//";
        }
        return msg;
    }
    public void insereFim (int i) {
        No novo = new No(i);
        if (this.estaVazia()) {
            setPrimeiro(novo);
        }
        else {
            No aux = getPrimeiro();
            while (aux.getProximo() != null) { //busca último da lista
                aux = aux.getProximo();
            }
            aux.setProximo(novo);
        }
    }
    public int removeInicio () {
        int copia = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        return copia;
    }
    public int removeFim() {
        int copia;
        if (primeiro.getProximo() == null) { //a lista tem um único elemento
            copia = primeiro.getInfo();
            setPrimeiro(null); //esvaziando a lista
        }
        else { // a lista tem pelo menos 2 elementos
            No aux = this.primeiro;
            while (aux.getProximo().getProximo() != null) { // busca penúltimo, arrrgh
                aux = aux.getProximo();
            }
            copia = aux.getProximo().getInfo();
            aux.setProximo(null);
        }
        return copia;
    }
    public int tamanhoLista () {}
    public boolean buscaX (int x) {}
    public void insereNaPosicao (int i, int pos) {}
    public int removeDaPosicao (int pos) {}
    public boolean removePrimeiroX (int x) {}
    public int removeTodosX (int x) {}

    //implementar nova lista simplesmente ligada, acrescentando o atributo
    //tamanhoDaLista

}
