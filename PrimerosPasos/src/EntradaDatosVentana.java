import javax.swing.*;

public class EntradaDatosVentana {
    public static void main(String[] args) {
        //Guardado el dato que se ingresara atraves de la ventana creada por medio de la instruccion JOptionPane.showInputDialog() en la variable nombreUsuario
        String nombreUsuario = JOptionPane.showInputDialog("Introduce tu nombre, por favor");

        //int edad = JOptionPane.showInputDialog("Introduce tu edad");
        String edad = JOptionPane.showInputDialog("Introduce tu edad");
        //Se guarda en otra variable y se convierte la variable edad, que se ingreso por medio de la ventana
        //Utilizando en este caso para un dato tipo int, el metodo parseInt(edad)
        int edadUsuario = Integer.parseInt(edad);
        edadUsuario++;

        System.out.println("Hola " + nombreUsuario + " el anio que viene tendras " + edadUsuario + " anios ");

    }

}
