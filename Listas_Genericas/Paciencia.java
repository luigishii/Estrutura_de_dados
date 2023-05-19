package Listas_Genericas;

public class Paciencia {
    public static void main(String[] args) {
        ListaComCabeca<Carta> jogo = new ListaComCabeca<>();

        jogo.insereInicio(new Carta(2, "Copas"));
        jogo.insereInicio(new Carta(12, "Ouros"));
        jogo.insereInicio(new Carta(1, "Paus"));
        jogo.insereInicio(new Carta(7, "Espadas"));

        System.out.println(jogo);


        System.out.println(jogo.removeInicio() + " foi retirado");
        System.out.println(jogo);
    }
}
