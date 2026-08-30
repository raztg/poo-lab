package Java.lab04;

public class Mago extends Personaje {
    private int mana;
    private int nivelMagia;

    public Mago(String nombre, int nivel, int puntosVida, int mana, int nivelMagia) {
        super(nombre, nivel, puntosVida);
        this.mana = mana;
        this.nivelMagia = nivelMagia;
    }

    public int getMana() {
        return this.mana;
    }

    public int getNivelMagia() {
        return this.nivelMagia;
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(this.getNombre() + " lanza un hechizo causando " + (this.getMana() * this.getNivelMagia()) + " de daño.");
    }

    @Override
    public void defender() {
        super.defender();
        System.out.println(this.getNombre() + " bloquea con un escudo de magia.");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}