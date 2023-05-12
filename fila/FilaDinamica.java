public class FilaDinamica {
    class No{
        private int info;
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
    private No prim;
    private No ult;
    private int tamanho;
    // construtor padrão só;

    public boolean estaVazia(){
        return tamanho == 0;
    }

    public void enfilera(int i){
        No novo = new No(i);
        if(estaVazia())
            prim = novo;
        else
            ult.setProx(novo);
        ult = novo;
        tamanho++;
    }
}
