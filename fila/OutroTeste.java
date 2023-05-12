import java.util.Random;

public class OutroTeste {
    public static void main(String[] args) {
        Random r = new Random();
        FilaEstatica f = new FilaEstatica(12);
        if(r.nextInt(2) ==0 ){//enfileirar
            if(!f.estaCheia())
            f.enfilera(r.nextInt(10));
        }
        else{ //desenfileira
            if(!f.estaVazia())
            System.out.println(f.desenfilera() + " foi atendido");
        }
        System.out.println(f);
        System.out.println(f.oVetor());
    }    
}
