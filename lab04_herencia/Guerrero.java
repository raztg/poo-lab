package Java.lab04;

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
    public String toString() {
        return super.toString();
    }
}