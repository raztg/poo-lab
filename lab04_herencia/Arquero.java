package Java.lab04;

public class Arquero extends Personaje {
    private int precision;
    private int flechasDisponibles;

    public Arquero(String nombre, int nivel, int puntosVida, int precision, int flechasDisponibles) {
        super(nombre, nivel, puntosVida);
        this.precision = precision;
        this.flechasDisponibles = flechasDisponibles;
    }

    public int getPrecision() {
        return this.precision;
    }

    public int getFlechasDisponibles() {
        return this.flechasDisponibles;
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(this.getNombre() + " dispara una flecha con precisión de " + this.getPrecision() + ".");
    }

    @Override
    public void defender() {
        super.defender();
        System.out.println(this.getNombre() + " intenta esquivar.");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}