public class No {
    private int info;
    private No proximo;

    public No (int i) {
        this.info =  i;
        this.proximo = null;
    }

    public char getInfo() {
        return (char) this.info;
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

    public int removeTodosX (int x) {
        if (this.info == x) {
            return 0;
        }
            if (this.proximo == null) {
                return 0;
            }
                if (this.proximo.getInfo() == x) {
                    return 0;
                }
                if (this.proximo.getProximo() == null) {
                    return 0;
                }
                if (this.proximo.getProximo().getInfo() == x) {
                    return 0;
                }
                if (this.proximo.getProximo().getProximo() == null) {
                    return 0;
                }
                return x;
    }

    public int getTamanho(ListaSimples listaSimples){
        return listaSimples.tamanho;
    }
}