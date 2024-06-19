public class ArrayBidireccionales2 {
    public static void main(String[] args) {

        int [][] matriz = {
            {15, 21, 18, 8, 15},
            {10, 52, 17, 19, 7},
            {19, 2, 19, 17, 7},
            {92, 13, 13, 32, 41}
        };

        for (int[] fila : matriz) {
            System.out.println();
            for (int columna : fila) {
                System.out.print(columna + " ");
                
            }
        }
    }

}
