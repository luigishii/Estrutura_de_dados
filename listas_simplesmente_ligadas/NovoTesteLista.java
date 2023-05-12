import java.util.Random;
public class NovoTesteLista {
    public static void main(String[] args) {
        Random r = new Random();
        ListaSimples l = new ListaSimples();
        do {
            if (r.nextInt(2) == 0) { //inserção na lista
                if (r.nextInt(2) == 0) {//inserção de início
                    l.insereInicio(r.nextInt(10));
                }
                else {//inserção de fim
                    l.insereFim(r.nextInt(10));
                }
            }
            else { //remoção na lista
                if (!l.estaVazia()) {
                    if (r.nextInt(2) == 0) { //remoção de início
                        l.removeInicio();
                    }
                    else { //remoção de fim
                        l.removeFim();
                    }
                }
            }
            System.out.println(l);
        } while (!l.estaVazia());
    }
}
