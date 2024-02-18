
public class MovimientoParabolico {
    public double velocidad;
    public double angulo;
    final double GRAVEDAD = 9.81;

    public double velocidadYAngulo(double velocidad, double angulo) {
        double velocidadInicial = this.velocidad = velocidad;
        double anguloSalida = this.angulo = angulo;
        return reproducirTotalTrayectoria(velocidadInicial, anguloSalida);
    }

    public double reproducirTotalTrayectoria(double velocidadInicial, double anguloSalida) {
        return Math.pow(velocidadInicial, 2) * Math.sin(2 * anguloSalida) / this.GRAVEDAD;
    }
}