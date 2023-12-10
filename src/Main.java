import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 6, 3, 7, 4, 10, 9};
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o número que procura na base de dados: ");
        int alvo = sc.nextInt();
        int resultado = pesquisaLinear(array, alvo);
        if (resultado == -1)
            System.out.println("Elemento não encontrado.");
        else
            System.out.println("Elemento encontrado na posição: " + resultado + ".");
    }

    static int pesquisaLinear(int[] arr, int target) {
        int position = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                position = i; // Guarda a posição do elemento se for encontrado.
            }
        }
        return position; // Retorna a posição do elemento.
    }
}
