import java.util.Random;
import java.util.Scanner;
import java.util.Date;
class Main {  
  
  static void exibeVetor (String msg, int[] v) {
    System.out.println("\n" + msg);
    for (int i=0; i < v.length; i++)
        System.out.print(v[i] + " ");
    System.out.println();
  }

  static void geraVetor (int[] v) {
    Random random = new Random();
    for (int i=0; i < v.length; i++)
        v[i] = random.nextInt(v.length * 10);
  }

  static void bubbleSort (int[] v) {
    for (int i=1; i < v.length; i++)
        for (int j=0; j < v.length - i; j++)
            if (v[j] > v[j+1]) {
                int aux = v[j];
                v[j] = v[j+1];
                v[j+1] = aux;
            }
  }

  static int[] buscaSimples (int[] v, int x) {
    //instancia um vetor com 2 posições:
    //a primeira é o i, a segunda é o contador
    int[] result = new int[2];
    result[1] = 0;
    for (int i=0; i<v.length; i++) {
        result[1]++;
        if (v[i] == x) {
            result[0] = i;
            return result;
        }
    }
    result[0] = -1;
    return result;
  }

  static int buscaBinaria (int[] v, int x) {
    int ini = 0, fim = v.length-1;
    while (ini <= fim) {
        int meio = (ini + fim) / 2;
        if (x == v[meio])
            return meio;
        if (x > v[meio])
            ini = meio + 1;
        else
            fim = meio - 1;
    }
    return -1;
  }

  public static void main(String args[]) { 
    int n, x=0;
    int[] result;
    Scanner scanner = new Scanner(System.in);
    do {
        System.out.print ("\ndigite o tamanho do vetor para teste: ");
        n = scanner.nextInt();
        if (n > 0) {
            System.out.print ("digite o valor para busca: ");
            x = scanner.nextInt();
        }
        int[] v = new int[n];
        geraVetor(v);
        result = buscaSimples(v, x);
        //exibeVetor("vetor gerado", v);
        if (result[0] == -1) 
            System.out.println (x + " nao encontrado no vetor pela simples");
        else
            System.out.println (x + " encontrado na posicao " + result[0] + " pela busca simples");
        System.out.println ("Foram realizadas " + result[1] + " iteracoes");
        /*
        long ini = new Date().getTime();
        bubbleSort(v);
        long fim = new Date().getTime();
        pos = buscaBinaria(v, x);
        //exibeVetor("vetor ordenado pelo bubble", v);
        System.out.println ("tempo: " + (fim-ini) + " milissegundos");
        if (pos == -1) 
            System.out.println (x + " nao encontrado no vetor pela binaria");
        else
            System.out.println (x + " encontrado na posicao " + pos + " pela busca binaria");
        */
    } while (n>0);
    scanner.close();
  } 
}