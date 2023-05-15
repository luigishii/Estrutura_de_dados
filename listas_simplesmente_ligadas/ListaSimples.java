public class ListaSimples {
    private No primeiro;
    int tamanho;
    //por clareza
    public ListaSimples () {
        setPrimeiro(null);
    }
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
    public int busca (int x) {
        int encontrado = 0;
        No aux = this.primeiro;
        return encontrado;   
    }
    public boolean buscaX (int x) {
        No aux = this.primeiro;
        while (aux != null) { //busca x na lista
            if (aux.getInfo() == x) {
                return true;
            }
            else{
                aux = aux.getProximo();
                }
        }
        return false;

    }
    public void insereNaPosicao (int i, int pos) {
        if (i > tamanho) {
            System.out.println("Posição inválida");
        }
        else {
            No aux = this.primeiro;
            if (i == 1) { //inserindo primeiro
                No novo = new No(pos);
                novo.setProximo(aux);
                this.setPrimeiro(novo);
            }
        }
    }
    public int removeDaPosicao (int pos) {
        if (pos > tamanho) {
            System.out.println("Posição inválida");
        }
        else{
            No aux = this.primeiro;
            if (pos == 1) { //removendo primeiro
                No novo = aux.getProximo();
                this.setPrimeiro(novo);
                return aux.getInfo();
            }
            else{
                No novo = aux.getProximo();
                No aux2 = aux.getProximo();
                while (aux2 != null) { //removendo o nó após o primeiro
                    if (aux2.getInfo() == pos) {
                        aux.setProximo(aux2.getProximo());
                        return aux2.getInfo();
                    }
                }
            }
        }
        return pos;
    }
    public boolean removePrimeiroX (int x) {
        if (this.tamanho == 0) { //lista vazia
            return false;
        }
        else {
            No aux = this.primeiro;
            if (aux.getInfo() == x) { //removendo o primeiro
                No novo = aux.getProximo();
                this.setPrimeiro(novo);
                return true;
            }
            else {
                No aux2 = aux.getProximo();
                while (aux2 != null) { //removendo o nó após o primeiro
                    if (aux2.getInfo() == x) {
                        aux.setProximo(aux2.getProximo());
                        return true;
                    }
                    aux = aux2;
                    aux2 = aux2.getProximo();
                }
            }    
        }
        return false;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    

}
