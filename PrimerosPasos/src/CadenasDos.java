public class CadenasDos {
    public static void main(String[] args) {
        
        String frase = "Hoy es un buen dia para aprender a programar en java";

        String fraseResumen = frase.substring(0,24) + "irnos a la playa y olvidarnos de todo..."
        + frase.substring(24,52);

        System.out.println(fraseResumen);
    }

}
