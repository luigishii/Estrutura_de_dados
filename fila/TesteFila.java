package fila;

import java.util.Random;

public class TesteFila {
    
    public static void main(String[] args) {
        FilaEstatica f = new FilaEstatica();
        System.out.println(f);
        Random r = new Random();
        while (!f.estaCheia()) {
            f.enfilera(r.nextInt(0, 9));
            System.out.println(f);
        }
        while(!f.estaVazia()) {
            System.out.println(f.desenfilera() + " foi atendido");
        }
    }

}
