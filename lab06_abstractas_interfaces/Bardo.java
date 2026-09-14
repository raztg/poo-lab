package Java.lab06;

public class Bardo extends Personaje implements Sanador {
    private int poderCurar;
    private int poderMelodia;

    public Bardo(String nombre, int nivel, int puntosVida, int poderCurar, int poderMelodia) {
        super(nombre, nivel, puntosVida);
        this.poderCurar = poderCurar;
        this.poderMelodia = poderMelodia;
    }

    public int getPoderCurar() {
        return poderCurar;
    }

    public int getPoderMelodia() {
        return poderMelodia;
    }

    public int calcularDamage() {
        return this.getNivel() * this.getPoderMelodia();
    }

    public void atacar() {
        System.out.println(this.nombre + " ataca con música.");
    }

    public void curarAliado(Personaje aliado) {
        aliado.puntosVida += poderCurar;
        System.out.println(this.nombre + " toca una melodía curativa.");
        System.out.println(aliado.nombre + " ha sido curado. (+" + poderCurar + ")");
    }
}