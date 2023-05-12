public class No {
    private char info;
    private No proximo;

    public No (char info) {
        this.info = info;
        this.proximo = null;
    }

    public char getInfo() {
        return this.info;
    }
    public No getProximo () {
        return this.proximo;
    }

    public void setInfo (char info) {
        this.info = info;
    }
    public void setProximo (No proximo) {
        this.proximo = proximo;
    }
    @Override
    public String toString () {
        return "|" + this.info + "|->";
    }
}