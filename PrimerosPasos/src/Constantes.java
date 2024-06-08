public class Constantes {

    public static void main(String[] args) {
        //int c = 5;
        //c=7;
        /*
         * Inicializacion de las variables en una sola linea.
         */
        int operador1, operador2, resultado1;
        operador1 = 8;
        operador2 = 7;
        resultado1 = operador1 + operador2;
        System.out.println(resultado1);

        /*
         * Inicializando las constantes con la palabra reservada
         * final al inico de la sentencia.
         */
        final int c;
        c=7;

        final double apulgadas = 2.54;

        double centimetros = 6;

        double resultado = centimetros/apulgadas;
 
        System.out.println("En "+ centimetros + " cm hay " + resultado + " pulgadas");
        
    }

}
