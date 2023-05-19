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
        NoBin novo = new NoBin(i);
        if(raiz == null){
            raiz = novo;
        }
        else{
            insereRec(raiz, novo);
        }
    }

    private void insereRec(NoBin atual, NoBin novo){
        if(novo.getInfo() <= atual.getInfo()){
            if(atual.getEsq()==null){
                atual.setEsq(novo);
            }
            else{
                insereRec(atual.getEsq(), novo);
            }
        }
        else{
            if(atual.getDir()==null){
                atual.setDir(novo);
            }
            else{
                insereRec(atual.getDir(), novo);
            }
        }
    }
    
    public String exibeEmOrdem(){

        if(raiz == null) return "árvore vazia";

        else{
            return exibeEmOrdemRec(raiz);
        }
    }

    private String exibeEmOrdemRec(NoBin atual){
        if(atual != null){
            return exibeEmOrdemRec(atual.getEsq()) + (atual.getInfo()) + exibeEmOrdemRec(atual.getDir());
        }       
        else{
            return " ";
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

    public int contaNosPosOrdem(){
        if(raiz == null) {
            return 0;
        }
        else {
            return 0;
        }
    }
    public int contaNosPosOrdemRec(NoBin atual){
        if(atual != null){
            return contaNosPosOrdemRec(atual.getEsq()) + (contaNosPosOrdemRec(atual.getDir())) + 1;
        }
        else{
            return 0;
        }
    }
}
