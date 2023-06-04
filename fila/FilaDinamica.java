package fila;

public class FilaDinamica {
    class No{
        private int info; // informacao dentro do nó
        private No prox;

        public No(int i){
            info = i;
            prox = null;
        }

        public int getInfo() {
            return info;
        }

        public No getProx() {
            return prox;
        }

        public void setInfo(int i) {
            info = i;
        }

        public void setProx(No ref) {
            prox = ref;
        }

        @Override 
        public String toString (){
            return "|" + info + "|->";
        }
        
    }
    private No prim; // no com o primeiro numero da fila
    private No ult; // no com o ultimo membro da fila
    private int tamanho; // tamanho da fila
    // construtor padrão só;

    public boolean estaVazia(){
        return tamanho == 0;
    }

    public void enfilera(int i){ // colocar novo valor da fila
        No novo = new No(i); // novo no para o valor que está entrando na fila
        if(estaVazia()) // se a fila esta vazia
            prim = novo; // o novo valor entra como sendo o primeiro
        else 
            ult.setProx(novo); // senao o novo valor entra logo após o ultimo valor da fila
        ult = novo; // agora o ultimo valor é o q entrou 
        tamanho++; // tamanho aumenta em 1
    }

    public int desenfilera(){ // tirar o primeiro valor da fila PRIMEIRO A ENTRAR É O PRIMEIRO A SAIR
        int i = prim.getInfo(); // pega a informação do primeiro numero da fila e atribui a i
        tamanho--; // retira 1 do tamanho
        prim = prim.getProx(); // agora o que vem após o primeiro se torna o primeiro 
        if(prim ==null){  //se nao ao tem valor no primeiro 
            ult = null; // entao nao tem valor no ultimo
        }
        return i; // retorna o primeiro 
    }

    @Override
    public String toString(){
        String s = "fila: ";
        if(estaVazia()) s+= "vazia";
        else{
            No runner = prim;
            while(runner!=null){
                s+= runner + " ";
                runner = runner.getProx();
            }
        }
        return s;

    }

    public int acharPosicao(int i){
        if (estaVazia()){ //se a fila esta vazia ele retorna 0
            return 0;
        }
        else{
            int posicao = 1; // int i por enquanto é 1
            while(prim.prox != null && prim.info != i){ //enquanto o proximo numero em relacao ao primeiro é diferente de null e o primeiro é diferente do numero que queremos
                prim = prim.prox; // o primeiro se torna o proximo 
                posicao++; // a posicao anda 1
            }
            if(prim.info == i){ //se o primeiro é o q queremos
                return posicao; // retorna a posicao dele
            }
            return -1; // se ele nao está na lista retorna -1
        }
    }

    public void furaFila(int info){
        if(estaVazia()){
            enfilera(info);
        }
        else{
            No novo = new No(info);
            novo.prox = prim;
            prim = novo;
            tamanho ++;
        }
    }
}


