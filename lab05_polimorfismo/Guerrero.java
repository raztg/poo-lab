package Java.lab05;

public class Guerrero extends Personaje {
    private int fuerza;
    private String armadura;

    public Guerrero(String nombre, int nivel, int puntosVida, int fuerza, String armadura) {
        super(nombre, nivel, puntosVida);
        this.fuerza = fuerza;
        this.armadura = armadura;
    }

    public int getFuerza() {
        return this.fuerza;
    }

    public String getArmadura() {
        return this.armadura;
    }

    public void entrenar() {
        this.fuerza += 5;
        System.out.println("La fuerza de " + this.getNombre() + " sube a " + this.fuerza + " al entrenar.");
    }

    public void entrenar(int sesiones) {
        this.fuerza += 5 * sesiones;
        System.out.println("La fuerza de " + this.getNombre() + " sube a " + this.fuerza + " después de " + sesiones + " sesiones de entrenamiento.");
    }

    public void entrenar(int sesiones, boolean intensivo) {
        if (intensivo) {
            this.fuerza += 5 * sesiones * 2;
            System.out.println("La fuerza de " + this.getNombre() + " sube demasiado a " + this.fuerza + " después de " + sesiones + " sesiones de entrenamiento.");
        }
        else {
            this.fuerza += 5 * sesiones;
            System.out.println("La fuerza de " + this.getNombre() + " sube a " + this.fuerza + " después de " + sesiones + " sesiones de entrenamiento.");
        }
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(this.getNombre() + " golpea con su espada causando " + this.getFuerza() + " de daño.");
    }

    @Override
    public void defender() {
        super.defender();
        System.out.println(this.getNombre() + " bloquea con su armadura de " + this.getArmadura() + ".");
    }

    @Override
    public int calcularDamage() {
        return this.getNivel() * this.getFuerza();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}