
import java.util.Scanner;

public class EntradaDatosConsola {
    public static void main(String[] args) {
        //El IDE te addvierte que puede existir una perdidad de datos al no tratar con una excepcion la instancia de Scanner

        Scanner datos = new Scanner(System.in);// Se crea la instancia de la clase Scanner
        
        System.out.println("Ingrese su nombre, por favor: "); //Mensaje mostrado por consola
        String nombreUsuario = datos.nextLine(); // En esta linea de codigo estamos guardando el nombre de usuario (String) que ingresamos gracias al metodo del objeto nextLine();
        System.out.println("Introduce edad, por favor"); //Mensaje mostrado por consola
        int edad = datos.nextInt();// En esta linea de codigo estamos guardando la edad (Int) que ingresamos gracias al metodo del objeto nextInt();

        System.out.println("Hola " + nombreUsuario + " el anio que viene tendras " + (edad+1) + " anios"); //Mostrando el resultado por medio de la consola, los parentesis que agrupan la edad+1 estamos sumando a la edad +1
    }

}
