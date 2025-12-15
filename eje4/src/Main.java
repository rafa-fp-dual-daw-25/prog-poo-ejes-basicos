public class Main {
    public static void main(String[] args) {
        Finanzas finanzas1 = new Finanzas();
        System.out.println("--- Test con Tasa de Cambio por Defecto (1.36) ---");

        double dolares1 = 100.0;
        double eurosCalculados1 = finanzas1.dolaresToEuros(dolares1);
        System.out.printf("1. $%.2f dólares son: %.2f euros%n", dolares1, eurosCalculados1);

        double euros1 = 50.0;
        double dolaresCalculados1 = finanzas1.eurosToDolares(euros1);
        System.out.printf("2. %.2f euros son: $%.2f dólares%n", euros1, dolaresCalculados1);

        System.out.println("-----------------------------------------------------");

        double nuevaTasa = 1.10;
        Finanzas finanzas2 = new Finanzas(nuevaTasa);
        System.out.printf("--- Test con Tasa de Cambio Personalizada (%.2f) ---%n", nuevaTasa);

        double dolares2 = 121.0;
        double eurosCalculados2 = finanzas2.dolaresToEuros(dolares2);
        System.out.printf("3. $%.2f dólares son: %.2f euros%n", dolares2, eurosCalculados2);

        double euros2 = 75.0;
        double dolaresCalculados2 = finanzas2.eurosToDolares(euros2);
        System.out.printf("4. %.2f euros son: $%.2f dólares%n", euros2, dolaresCalculados2);

        System.out.println("-----------------------------------------------------");
    }
}
