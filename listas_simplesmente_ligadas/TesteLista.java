public class TesteLista {
    public static void main(String[] args) {
        ListaSimples l = new ListaSimples();
        System.out.println("lista inicializada\n" + l);
        for (int i=1; i<=10; i++) {
            l.insereInicio(i);
        }
        System.out.println("\nlista depois das insercoes de inicio:\n" + l);
        for (int i = 10; i<=50; i+=10) {
            l.insereFim(i);
        }
        System.out.println("\nlista depois das insercoes de fim:\n" + l);

        if (!l.estaVazia()) {
            System.out.println(l.removeInicio() + " foi removido do inicio");
            System.out.println("lista depois da remocao de inicio: " + l);
        }

        if (!l.estaVazia()) {
            System.out.println(l.removeFim() + " foi removido do final");
            System.out.println("lista de pois da remocao de fim: " + l);
        }
    }
}
