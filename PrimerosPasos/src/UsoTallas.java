import java.util.Scanner;

public class UsoTallas {

    //Declaracion de un tipo enum, los tipos enum se declaran fuera del metodo "main" y dentro de la clase
    //enum Tallas {Mini, Mediano, Grande, MuyGrande };
    //Llamando a un tipo enum desde un metodo

    enum Talla {
        
        //NO PERMITE INSTANCIAR OBJETOS.
        MINI("S"),MEDIANO("M"),GRANDE("L"),MUY_GRANDE("XL");
        
        private Talla(String abrev) {
            this.abrev = abrev;
        }

        public String getAbrev (){
            return abrev;
        }

        private String abrev;
        
    }

    public static void main(String[] args) {

        /* Tallas s = Tallas.Mini;
        Tallas m = Tallas.Mediano;
        Tallas l = Tallas.Grande;
        Tallas xl = Tallas.MuyGrande; */

        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe una talla: MINI; MEDIANO; GRANDE, MUY_GRANDE");
        String entradaDatos = entrada.next().toUpperCase();
        Talla tallas=Enum.valueOf(Talla.class, entradaDatos);
        System.out.println("Talla = " + tallas);
        System.out.println("Abreviatura de la talla: "+tallas.getAbrev());
        
    }

}
