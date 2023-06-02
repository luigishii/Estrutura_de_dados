package arvore;




import java.util.Random;


public class TesteArvoreBinariaBusca {
    public static void main(String[] args) {
        Random r = new Random(); // atribui um valor aleatório a r
        ArvoreBinariaDeBusca abb = new ArvoreBinariaDeBusca(); // abb assume o valor de ArvoreBinariaDeBusca atribuindo a ela um novo valor
        for(int i=1; i<=10; i++){ // comecando em i=1 , enquanto i<=10 valores , adiciona 1 a i; 
            int n = r.nextInt(50); // n assume o valor de um r tem um raio de até 50
            System.out.print(n + " ");
            abb.insere(n); // abb usa o metodo de inserir para inserir o valor n na lista  
        }
        
        System.out.println("\n \n" + abb.exibeEmOrdem()); // printa a lista ja ordenada
    }
}
