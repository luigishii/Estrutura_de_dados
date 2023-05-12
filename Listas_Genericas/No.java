package Listas_Genericas;

public class No<T> {
    private T info;
    private No prox;

    public No(T info){
        this.info = info;
        this.prox = null;
    }
}
