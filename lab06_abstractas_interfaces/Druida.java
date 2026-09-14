package Java.lab06;

public class Druida extends Personaje implements Hechicero, Sanador {
    private int mana;
    private int poderCurar;
    private int poderNaturaleza;

    public Druida(String nombre, int nivel, int puntosVida, int mana, int poderCurar, int poderNaturaleza) {
        super(nombre, nivel, puntosVida);
        this.mana = mana;
        this.poderCurar = poderCurar;
        this.poderNaturaleza = poderNaturaleza;
    }

    public int getMana() {
        return mana;
    }

    public int getPoderCurar() {
        return poderCurar;
    }

    public int getPoderNaturaleza() {
        return poderNaturaleza;
    }

    public int calcularDamage() {
        return this.getNivel() * this.getPoderNaturaleza() / 2;
    }

    public void atacar() {
        System.out.println(this.nombre + " ataca con las fuerzas de la naturaleza.");
    }

    public void lanzarHechizo() {
        System.out.println(this.nombre + " lanza un hechizo de naturaleza.");
    }

    public void curarAliado(Personaje aliado) {
        aliado.puntosVida += poderCurar;
        System.out.println(this.nombre + " lanza un hechizo de curación.");
        System.out.println(aliado.nombre + " ha sido curado. (+" + poderCurar + ")");
    }
}