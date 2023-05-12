public class ListaDupla {
    private NoDuplo prim;
    private NoDuplo ult;
    private int tamanho;

    //vamos usar somente o construtor padrão

    //métodos de acesso
    public NoDuplo getPrim() {
        return this.prim;
    }
    public NoDuplo getUlt () {
        return this.ult;
    }
    public int getTamanho () {
        return this.tamanho;
    }
    //métodos modificadores
    public void setPrim(NoDuplo prim) {
        this.prim = prim;
    }
    public void setUlt(NoDuplo ult) {
        this.ult = ult;
    }
    public void setTamanho (int tamanho) {
        this.tamanho = tamanho;
    }
    //métodos específicos
    public boolean estaVazia () {
        return this.prim == null;
    }
    public void insereInicio (int info) {
        NoDuplo novo = new NoDuplo(info);
        if (this.estaVazia())
            setUlt(novo);
        else {
            novo.setProx(prim);
            prim.setAnt(novo);
        }
        setPrim(novo);
        setTamanho(getTamanho()+1);
    }
    public void insereFim (int info) {
        NoDuplo novo = new NoDuplo(info);
        if (this.estaVazia())
            setPrim(novo);
        else {
            novo.setAnt(ult);
            ult.setProx(novo);
        }
        setUlt(novo);
        setTamanho(getTamanho() + 1);
    }
    public int removeInicio () {
        int temp = prim.getInfo();
        if (tamanho == 1) {
            setPrim(null);
            setUlt(null);
        }
        else {
            setPrim(prim.getProx());
            prim.setAnt(null);
        }
        setTamanho(getTamanho() - 1);
        return temp;
    }
    public int removeFim () {
        int temp = ult.getInfo();
        if (tamanho == 1) {
            setPrim(null);
            setUlt(null);
        }
        else {
            setUlt(ult.getAnt());
            ult.setProx(null);
        }
        setTamanho(getTamanho() - 1);
        return temp;
    }
    @Override
    public String toString() {
        String msg = "lista: ";
        if (estaVazia()) {
            msg = msg + "vazia";
        }
        else {
            msg = msg + "//<-";
            NoDuplo aux = prim;
            while (aux != null) {
                msg = msg + aux + "-";
                aux = aux.getProx();
            }
            msg = msg + ">\\\\";
        }
        return msg;
    }
}