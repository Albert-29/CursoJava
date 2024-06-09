/*
 * En esta clase podemos ver como truncar los decimales de un numero muy grande 
 * Utilizando el metodo printf() que recibe dos parametros.
 * 1. El parametro de formato que se define como "%1.2f" (ejemplo)
 * 2. El numero o variable a la que se le aplicara el formato precedido
 * Utilizamos el paquete javax, la clase swing, esto nos permite utilizar las ventanas de JOptionPane
 * se reviso la conversion de datos tipo String a double 
 */


import javax.swing.JOptionPane;

public class EntradaNumeros {

    public static void main(String[] args) {
        double numero = 10000.0;

        System.out.println(numero/3);
        System.out.printf("%1.2f", numero/3);

        String num1 = JOptionPane.showInputDialog("Introduce un numero ");
        double num2 = Double.parseDouble(num1);

        System.out.println("La raiz de " + num2 + " es ");
        System.out.printf("%1.4f", Math.sqrt(num2));
        



    }
}
