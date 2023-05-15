import java.util.ArrayList;
import java.util.List;

public class tarefa {
    public static void main(String[] args) {
        List<String> entradas = new ArrayList<>();
        entradas.add("C ABC123");  // Carro chega
        entradas.add("C DEF456");  // Carro chega
        entradas.add("p GHI788");  // Carro chega
        entradas.add("P ABC123");  // Carro parte
        entradas.add("C JKL012");  // Carro chega
        entradas.add("P DEF456");  // Carro parte
        entradas.add("P JKL012");  // Carro parte
        entradas.add("F");         // Finalizar

        simulateParking(entradas);
    }

    public static void simulateParking(List<String> entradas) {
        List<String> estacionamento = new ArrayList<>();

        for (String entrada : entradas) {
            if (entrada.equals("F")) {
                System.out.println("Finalizou");
            }

            char tipo = entrada.charAt(0);
            String placa = entrada.substring(2);

            if (tipo == 'C') {
                if (estacionamento.size() < 12) {
                    estacionamento.add(placa);
                    System.out.println("Carro " + placa + " estacionado.");
                } else {
                    System.out.println("Estacionamento cheio. Carro " + placa + " aguardando vaga.");
                }
            } else if (tipo == 'P') {
                int index = estacionamento.indexOf(placa);

                if (index != -1) {
                    int deslocamentos = estacionamento.size() - index;
                    estacionamento.remove(index);
                    System.out.println("Carro " + placa + " saiu do estacionamento. Deslocamentos: " + deslocamentos);
                } else {
                    System.out.println("Carro " + placa + " não encontrado no estacionamento.");
                }
            }
        }
    }
}