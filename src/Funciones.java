public class Funciones {
    public static int[] obtenerValores(int[][] matriz) {

        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[] valoresCentrales = new int[9];
        
        int centroFila = filas / 2;
        int centroColumna = columnas / 2;
        
        valoresCentrales[0] = matriz[centroFila][centroColumna];
        valoresCentrales[1] = matriz[centroFila][centroColumna - 1];
        valoresCentrales[2] = matriz[centroFila][centroColumna + 1];
        valoresCentrales[3] = matriz[centroFila - 1][centroColumna];
        valoresCentrales[4] = matriz[centroFila - 1][centroColumna - 1];
        valoresCentrales[5] = matriz[centroFila - 1][centroColumna + 1];
        valoresCentrales[6] = matriz[centroFila + 1][centroColumna];
        valoresCentrales[7] = matriz[centroFila + 1][centroColumna - 1];
        valoresCentrales[8] = matriz[centroFila + 1][centroColumna + 1];

        
        return valoresCentrales;

    }
    public static void ordenarBurbuja(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}