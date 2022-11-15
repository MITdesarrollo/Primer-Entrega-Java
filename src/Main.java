public class Main {
    public static void main(String[] args) {

        double interes = 0.5 ;
        int capital = 10000;
        int periodo = 4;

        double monto = (capital * interes) * periodo;

//        System.out.println("El monto a abonar es " + monto);

        int entero = 15;
        double flotante = 15.5;

        double resultado1 = flotante - entero;
        double resultado2= entero%flotante;
        System.out.println("Dato float = " + resultado1);
        System.out.println("Dato entero = " + resultado2);
    }
}