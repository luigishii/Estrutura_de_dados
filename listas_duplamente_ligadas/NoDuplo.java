public class NoDuplo {
    private int info;
    private NoDuplo ant;
    private NoDuplo prox;

    public NoDuplo (int info) {
        this.info = info;
    }
    //métodos de acesso
    public int getInfo() {
        return this.info;
    }
    public NoDuplo getAnt() {
        return this.ant;
    }
    public NoDuplo getProx() {
        return this.prox;
    }
    //métodos modificadores
    public void setInfo(int info) {
        this.info = info;
    }
    public void setAnt(NoDuplo ant) {
        this.ant = ant;
    }
    public void setProx(NoDuplo prox) {
        this.prox = prox;
    }
    @Override
    public String toString () {
        return "|" + info + "|";
    }
}