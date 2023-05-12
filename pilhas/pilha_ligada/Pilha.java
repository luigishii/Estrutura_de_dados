public class Pilha {
    private No primeiro;
    //por clareza
    public Pilha () {
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
    public void push (char i) {
        No novo = new No(i);
        if (!this.estaVazia()) {
            novo.setProximo(this.primeiro);
        }
        setPrimeiro(novo);
    }

    public int pop () {
        char copia = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        return copia;
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
    
    public char consultaTopo () {
        return primeiro.getInfo();
    }

    public int busca (char i) {
        No aux = primeiro;
        int pos = 1;
        while (aux != null) {
            if (aux.getInfo() == i)
                return pos;
            pos++;
            aux = aux.getProximo();
        }
        return -1;
    }
}
