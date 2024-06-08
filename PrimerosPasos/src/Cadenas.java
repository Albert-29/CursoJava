public class Cadenas {

    public static void main(String[] args) {
        
        String nombre = "Alberto";
        System.out.println("Mi nombre es: " + nombre);

        System.out.println("Mi nombre tiene " + nombre.length() + " letras.");

        System.out.println("La primera letra de "+ nombre + " es " + nombre.charAt(0));

        int ultimaLetra;
        ultimaLetra = nombre.length();
        System.out.println("La ultima letra es la " + nombre.charAt(ultimaLetra-1));

    }

}
