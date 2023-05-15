public class No {
    private char info;
    private No proximo;

    public No (int i) {
        this.info = i;
        this.proximo = null;
    }

    public char getInfo() {
        return this.info;
    }
    public No getProximo () {
        return this.proximo;
    }

    public void setInfo (int i) {
        this.info = i;
    }
    public void setProximo (No proximo) {
        this.proximo = proximo;
    }
    @Override
    public String toString () {
        return "|" + this.info + "|->";
    }

    public int removeTodosX (int x) {}

    public int getTamanho(ListaSimples listaSimples){
        return listaSimples.tamanho;
    }
}