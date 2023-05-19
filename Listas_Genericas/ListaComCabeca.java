package Listas_Genericas;

public class ListaComCabeca<T> {
    private No<T> cabecaLista;

    public ListaComCabeca() {
        cabecaLista = new No<T>(null);
    }

    public void insereInicio(T info) {
        No<T> novo = new No<T>(info);
        novo.setProx(cabecaLista.getProx());
        cabecaLista.setProx(novo);
    }

    public T removeInicio() {
        T aux = null;
        if(cabecaLista.getProx() != null){
            aux = cabecaLista.getProx().getInfo();
            cabecaLista.setProx(cabecaLista.getProx().getProx());
        }
        return aux;
    }

    @Override
    public String toString() {
        String s = "lista: ";
        if(cabecaLista.getProx() == null)
            s+= "vazia";
        else{
            No<T> runner = cabecaLista.getProx();
            while(runner != null){
                s+= runner;
                runner = runner.getProx();
            }
        }
        return s;
    }

    
}