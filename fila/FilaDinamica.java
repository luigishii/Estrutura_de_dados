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
}
