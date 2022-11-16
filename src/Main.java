public class Main {
    public static void main(String[] args) {

        double interes = 0.5 ;
        int capital = 10000;
        int periodo = 4;

        double monto = (capital * interes) * periodo;

//        System.out.println("El monto a abonar es " + monto);



        int entero;
        float flotante = 15.5f;

         entero = (int) flotante;

         float resultado1 = flotante - entero;

        System.out.println("Dato float = " + resultado1);
        System.out.println("Dato entero = " + entero);
    }
}