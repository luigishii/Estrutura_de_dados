import java.util.Random;
public class TesteDupla {
    public static void main (String args[]) {
        ListaDupla l = new ListaDupla();
        Random random = new Random();
        do {
            if (random.nextInt(2) == 0) { // inserir
                if (random.nextInt() == 0) { // início
                    l.insereInicio(random.nextInt(10));
                }
                else { // fim
                    l.insereFim(random.nextInt(10));
                }
            }
            else if (!l.estaVazia()) {// remover
                if (random.nextInt() == 0) { // início
                    System.out.println (l.removeInicio() + " saiu do inicio");
                }
                else { // fim
                    System.out.println (l.removeFim() + " saiu do fim");
                }
            }
            System.out.println (l);
        } while (!l.estaVazia());
    }
}

// um método para 
//devolver o tamanho da lista
//remover um elemento de uma posição pos
//verificar se um elemento aparece ou não na lista
//remover um elemento espscífico da lista
//consultar primeiro
//consultar último

//novos métodos para as duas listas:
//inverter uma lista
//a partir de uma lista gerar outras duas: uma de pares, uma de ímpares
//a partir de duas listas, criar um única, mesclando seus elementos
