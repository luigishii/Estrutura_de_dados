package arvore;

public class ArvoreBinariaDeBusca {
    private class NoBin { // NoBin = Nó Binário
        private int info;
        private NoBin esq;
        private NoBin dir;

        public NoBin(int info) {
            this.info = info;
        }

        public int getInfo() {
            return info;
        }

        public void setInfo(int info) {
            this.info = info;
        }

        public NoBin getEsq() {
            return esq;
        }

        public void setEsq(NoBin esq) {
            this.esq = esq;
        }

        public NoBin getDir() {
            return dir;
        }

        public void setDir(NoBin dir) {
            this.dir = dir;
        }

        @Override
        public String toString() {
            return "[info " + info + "]";
        }
        
    }

    private NoBin raiz;

    //só o construtor padrão
    
    public void insere(int i){
        NoBin novo = new NoBin(i); //disponibiliza um novo nó para carregar o número
        if(raiz == null){ //se a raiz está vazia 
            raiz = novo; //coloca o valor que está no nó(novo) no lugar da raiz
        }
        else{
            insereRec(raiz, novo); //o novo valor é colocado na Direita ou na esquerda de acordo com o valor da raiz
        }
    }

    private void insereRec(NoBin atual, NoBin novo){
        if(novo.getInfo() <= atual.getInfo()){ //se o novo valor for <= ao valor atual(raiz)
            if(atual.getEsq()==null){   //se o valor à esquerda da raiz está vazia
                atual.setEsq(novo); // coloca o novo valor na esquerda
            }
            else{
                insereRec(atual.getEsq(), novo); //se o valor à esquerda da raiz está cheio, repete o método e o aplica denovo
            }
        }
        else{ //se o novo valor for > que o valor atual(raiz)
            if(atual.getDir()==null){ //se nao tem nenhum numero à direita da raiz
                atual.setDir(novo); // coloca o novo valor na direita da raiz
            }
            else{ //se existe algum número na direita da raiz
                insereRec(atual.getDir(), novo); //se o valor à direita da raiz está cheio, repete o método e o aplica denovo
            }
        }
    }
    
    public String exibeEmOrdem(){

        if(raiz == null) return "árvore vazia"; // se nao tem raiz é pq a arvore esta vazia

        else{ // existe um valor na raiz
            return exibeEmOrdemRec(raiz); 
        }
    }

    private String exibeEmOrdemRec(NoBin atual){ // recebe o valor da raiz
        if(atual != null){ // se há valor na raiz
            return exibeEmOrdemRec(atual.getEsq()) + (atual.getInfo()) + exibeEmOrdemRec(atual.getDir()); //retorna todos os numeros a esquerda da raiz + a  raiz + todos os numeros a direita da raiz
        }       
        else{
            return " "; // se não há valor na raiz retorna um espaço vazio
       }
    }
    
    public String exibePosOrdem(){

        if(raiz == null) return "árvore vazia";

        else{
            return exibePosOrdem(raiz);
        }
    }

    private String exibePosOrdem(NoBin atual){
        if(atual != null){
            return exibePosOrdem(atual.getEsq()) + exibePosOrdem(atual.getDir()) + (atual.getInfo());
        }       
        else{
            return " ";
       }
    }

    public int contaNosPosOrdem(){ // metodo para contar os nós 
        if(raiz == null) {// se não há valor na raiz 
            return 0; //retorna 0
        }
        else { // se há valor na raiz
            return contaNosPosOrdemRec(raiz);
        }
    }
    public int contaNosPosOrdemRec(NoBin atual){
        if(atual != null){ // se há valor na raiz
            return contaNosPosOrdemRec(atual.getEsq()) + (contaNosPosOrdemRec(atual.getDir())) + 1; //retorna o numero de nós a esquerda da raiz mais o numero de nós à direita da raiz + 1
        }
        else{ // se não há valor na raiz 
            return 0; //retorna 0
        }
    }
}
