public class Main {
    public static void main(String[] args) {
        MovimientoParabolico movimiento = new MovimientoParabolico();
        double velocidad = 20;
        double angulo = Math.toRadians(45);
        double totalTrayectoria = movimiento.velocidadYAngulo(velocidad, angulo);
        System.out.println("Total trayectoria es: " + totalTrayectoria);
    }
}