import java.util.Random;
import java.util.Scanner;

class BinariaModificada {  
  
  static void exibeVetor (String msg, int[] v) {
    System.out.println("\n" + msg);
    for (int i=0; i < v.length; i++)
        System.out.print(v[i] + " ");
    System.out.println();
  }

  static void geraVetor (int[] v) {
    Random random = new Random();
    for (int i=0; i < v.length; i++)
        v[i] = random.nextInt(10);
  }

//modificar a busca simples para devolver a lista de posições que o x aparece
  static int[] buscaSimplesModificada (int[] v, int x) {
    int[] posicoes = new int[v.length+1];
    int j=0;
    for (int i=0; i<v.length; i++) {
        if (v[i] == x) {
            posicoes[++j] = i;
        }
    }
    posicoes[0]=j;
    return posicoes;
  }
  public static void main(String args[]) { 
    int n, x=0;
    int[] result;
    Scanner scanner = new Scanner(System.in);
    do {
        System.out.print ("\ndigite o tamanho do vetor para teste: ");
        n = scanner.nextInt();
        if (n > 0) {
            int[] v = new int[n];
            geraVetor(v);
            exibeVetor("vetor:", v);
            System.out.print ("digite o valor para busca: ");
            x = scanner.nextInt();result = buscaSimplesModificada(v, x);
            for (int i=1; i<=result[0]; i++) {
                System.out.print (result[i] + " ");
            }
        }
      } while (n>0);
    scanner.close();
  } 
}