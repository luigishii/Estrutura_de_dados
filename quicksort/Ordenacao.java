import java.util.Scanner;
import java.util.Random;
import java.util.Date;
public class Ordenacao {
    static void geraVetor (int[] v) {
        Random random = new Random();
        for (int i=0; i < v.length; i++) 
            v[i] = random.nextInt(10*v.length);
    }
    static void exibeVetor (String msg, int[] v) {
        System.out.println("\n" + msg);
        for (int i=0; i<v.length; i++) 
            System.out.print (v[i] + " ");
        System.out.println();
    }
    static void bubbleSort(int[] v) {
        for (int i=1; i < v.length; i++) {
            for (int j=0; j < v.length - i; j++) {
                if (v[j] > v[j+1]) {
                    int temp = v[j];
                    v[j] = v[j+1];
                    v[j+1] = temp;
                }
            }
        }
    }

    public static int partition(int v[], int p, int r){ //p = primeiro e r = ultimo 
        int pivo = v[r]; // ultimo elemento do vetor é o pivo
        int i = p-1;
        for(int j=p;j<r; j++){ //repetição que começa em p e vai até r-1(penultimo)
            if(v[j] < pivo) { //se o elemento atual for < que o pivô
                i++; // i anda;
                int aux = v[i]; 
                v[i] = v[j];
                v[j] = aux;
            }
        }
        i++; 
        int aux = v[i];
        v[i] = v[r];
        v[r] = aux;
        return i; 
    }

    public static void quick (int[] v, int p, int r){
        System.out.println("p = " + p + ", r =" + r);
        if (p < r){ //se p < r
            int q = partition(v, p, r); //chama a funcao partition para dividir o vetor em dois vetores usando o ultimo valor do vetor como pivô
            System.out.println("q = " + q); 
            quick(v, p, q-1); //antes do pivô
            quick(v, q+1, r); // depois do pivô
        }
    }
    
    public static void main (String[] args) {
        int v[], n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print ("\ndigite o tamanho do vetor: ");
            n = scanner.nextInt();
            if (n > 0) {
               v = new int[n];
               geraVetor(v);
               long ini = new Date().getTime();
               quick(v,0, v.length-1);
               long fim = new Date().getTime();
               System.out.println("quick 1a vez demorou " + (fim-ini) + "ms");
            }
        } while (n>0);
        scanner.close();
    }
}