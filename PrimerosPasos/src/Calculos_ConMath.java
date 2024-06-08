public class Calculos_ConMath {
    public static void main(String[] args) {
        
        //int resultado = Math.sqrt(9.0);
        //double resultado = Math.sqrt(9);

       // float num1 = 5.88F;
       // int resultado = Math.round(num1);
       // System.out.println(resultado);

        double num1 = 5.87;
        int resultado = (int)Math.round(num1);
        System.out.println(resultado);

        double base = 5;
        double exponente = 3;

        int resultado1 =(int) Math.pow(base,exponente);
        System.out.println("EL resultado de " + base + " elevado a " + exponente + " es " + resultado1);


    }

}
