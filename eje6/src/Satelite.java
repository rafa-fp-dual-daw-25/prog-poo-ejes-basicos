public class Satelite {
    private double meridiano;
    private double paralelo;
    private double distancia_tierra;

    public Satelite(double meridiano, double paralelo, double distancia_tierra) {
        this.meridiano = meridiano;
        this.paralelo = paralelo;
        this.distancia_tierra = distancia_tierra;
    }

    public Satelite() {
        this.meridiano = this.paralelo = this.distancia_tierra = 0;
    }

    public void setPosicion(double m, double p, double d) {
        meridiano = m;
        paralelo = p;
        distancia_tierra = d;
    }

    public void printPosicion() {
        System.out.println("El satélite se encuentra en el paralelo" + paralelo + ", Meridiano" + meridiano + " a una distancia de la tierra de" + distancia_tierra + " Kilómetros.");
    }

    public void variaAltura(double desplazamiento) {
        if (desplazamiento != 0) {
            this.distancia_tierra += desplazamiento;
        } else {
            System.out.println("No hay desplazamiento.");
        }
    }
}