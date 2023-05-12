import java.util.Scanner;
public class Parenteses {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print ("digite sua expressao: ");
        String expressao = scanner.next();
        Pilha p = new Pilha();
        int i=0;
        boolean erro = false;
        while (i<expressao.length() && !erro){
            char c = expressao.charAt(i);
            if (c == '(') 
                p.push(c);
            else if (c == ')') {
                if (!p.estaVazia()) 
                    p.pop();
                else 
                    erro = true;
            }
            i++;
        } 
        if (p.estaVazia() && !erro)
            System.out.println("tudo certo");
        else 
            System.out.println ("oh oh");
        scanner.close();
    }
}