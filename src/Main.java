import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int dimension;
                while (true) {
                    System.out.print("Ingrese la dimensión de la matriz (impar entre 3 y 15): ");
                    dimension = scanner.nextInt();

                    if (dimension >= 3 && dimension <= 15 && dimension % 2 != 0) {
                        break;
                    } else {
                        System.out.println("Dimensión inválida. Intente nuevamente.");
                    }
                }
                int[][] matriz = new int[dimension][dimension];
                Random random = new Random();
                for (int i = 0; i < dimension; i++) {
                    int value;
                    while (true) {
                        System.out.print("Ingrese un valor entero no nulo entre 10 y 99 para la posición [" + (dimension - 1) + "][" + i + "]: ");
                        value = scanner.nextInt();
                        if (value >= 10 && value <= 99) {
                            break;
                        } else {
                            System.out.println("Valor inválido. Intente nuevamente.");
                        }
                    }
                    matriz[dimension - 1][i] = value;
                }

                for (int i = 0; i < dimension - 1; i++) {
                    for (int j = 0; j < dimension; j++) {
                        matriz[i][j] = 10 + random.nextInt(90);
                    }
                }

                for (int i = 0; i < dimension; i++) {
                    for (int j = 0; j < dimension; j++) {
                        System.out.print(matriz[i][j] + " ");
                    }
                    
                }
                System.out.println("Dimensión válida ingresada: " + dimension);

                int[] valores = Funciones.obtenerValores(matriz);
                System.out.println("Valores obtenidos:");
                for (int valor : valores) {
                    System.out.print(valor + " ");
                }
                Funciones.ordenarBurbuja(valores);
                System.out.println("\nValores ordenados:");
                for (int valor : valores) {
                    System.out.print(valor + " ");
                }
                
    }
}
