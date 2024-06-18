
import javax.swing.JOptionPane;

public class UsoArrays2 {
    public static void main(String[] args) {
        
        String [] paises = new String[8];
        
        for (int i = 0; i < 8; i++) {
            paises[i] = JOptionPane.showInputDialog("Introduce país " + (i+1));
            
        }

        /*paises[0] = "Mexico";
        paises[1] = "Peru";
        paises[2] = "Colombia";
        paises[3] = "Brazil";
        paises[4] = "Canada";
        paises[5] = "Francia";
        paises[6] = "Argentina";
        paises[7] = "Ecuador";

        /* for (int i = 0; i < paises.length; i++) {
            System.out.println("Pais " + (i+1) + " " + paises[i]);
            
        } */

        //String [] paises = {"España","Mexico","Colombia","Peru","Argentina", "Ecuador", "Venezuela"};

        for (String pais : paises) {
            
            System.out.println("Pais " + pais);
        }

    }

}
