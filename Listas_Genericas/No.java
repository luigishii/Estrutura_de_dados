package Listas_Genericas;

public class No<T> {
    private T info;
    private No prox;

    public No(T info){
        this.info = info;
        this.prox = null;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public No<T> getProx() {
        return prox;
    }

    public void setProx(No<T> prox) {
        this.prox = prox;
    }
    
}
