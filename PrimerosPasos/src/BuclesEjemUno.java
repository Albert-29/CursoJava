
import javax.swing.JOptionPane;

public class BuclesEjemUno {

    public static void main(String[] args) {
        String clave = "Alberto";
        String password = "";

        while (clave.equals(password) == false) {
            password = JOptionPane.showInputDialog("Introduce la contraseña: ");

            if (clave.equals(password)==false) {
                System.out.println("Contraseña incorrecta. ");
                
            }
            
        }

        System.out.println("Contraseña correcta. Acceso permitido");

    }

}
