import java.util.Arrays;
import java.util.LinkedList;

public class FernandinhoBeiraCorrego {
    public static void main(String[] args) {
        int[] vetor = new int[1000];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 19999) - 9999;
        }

        System.out.println("Vetor: " + Arrays.toString(vetor));

        LinkedList<Integer> lista = new LinkedList<>();

        for (int num : vetor) {
            inserirNaOrdem(lista, num);
        }

        System.out.println("Lista em ordem crescente: " + lista);

        System.out.print("Lista em ordem decrescente: ");
        for (int i = lista.size() - 1; i >= 0; i--) {
            System.out.print(lista.get(i) + " ");
        }
        System.out.println();

        removerPrimos(lista);

        System.out.println("Lista após remover primos: " + lista);
    }

    private static void inserirNaOrdem(LinkedList<Integer> lista, int num) {
        int index = 0;
        while (index < lista.size() && lista.get(index) < num) {
            index++;
        }
        lista.add(index, num);
    }

    private static void removerPrimos(LinkedList<Integer> lista) {
        lista.removeIf(FernandinhoBeiraCorrego::isPrimo);
    }

    private static boolean isPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
