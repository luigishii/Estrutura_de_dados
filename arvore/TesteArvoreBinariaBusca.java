package arvore;



import java.util.Random;

public class TesteArvoreBinariaBusca {
    public static void main(String[] args) {
        Random r = new Random();
        ArvoreBinariaDeBusca abb = new ArvoreBinariaDeBusca();
        for(int i=1; i<=10; i++){
            int n = r.nextInt(50);
            System.out.print(n + " ");
            abb.insere(n);
        }
        
        System.out.println("\n \n" + abb.exibePosOrdem());
    }
}
