import java.util.Random;

public class MaisUmTeste {
    public static void main(String[] args) {
        Random r = new Random();
        FilaDinamica f = new FilaDinamica();
        do{
            if(r.nextInt(2) == 0 ){//enfileirar
                f.enfilera(r.nextInt(10));
            }
            else{ //desenfileira
                if(!f.estaVazia())
                System.out.println(f.desenfilera() + " foi atendido");
            }
            System.out.println(f);
        }  while(!f.estaVazia());
    }
}
