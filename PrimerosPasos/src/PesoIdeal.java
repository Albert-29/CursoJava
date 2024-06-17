
import javax.swing.JOptionPane;

public class PesoIdeal {
    public static void main(String[] args) {
        String genero = "";

        do {
            genero = JOptionPane.showInputDialog("Introduce tu genero(H/M)");
        } while (genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);

        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce altura en cm: "));
        int peso = 0;

        if (genero.equalsIgnoreCase("H")) {
            peso=altura-110;
        }
        else if (genero.equalsIgnoreCase("M")) {
            peso=altura-120;
            
        }
        System.out.println("Tu peso ideal es  " + peso + " Kilos");
    }

}
