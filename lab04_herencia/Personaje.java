package Java.lab04;

public class Personaje implements Combatiente {
    private String nombre;
    private int nivel;
    private int puntosVida;
    private boolean vivo;

    public Personaje(String nombre, int nivel, int puntosVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
        this.vivo = true;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getNivel() {
        return this.nivel;
    }

    public int getPuntosVida() {
        return this.puntosVida;
    }

    public boolean getVivo() {
        return this.vivo;
    }

    public void damage(int damage) {
        this.puntosVida -= damage;
        if (this.puntosVida <= 0) {
            this.puntosVida = 0;
        }
        System.out.println(this.getNombre() + " recibe " + damage + " puntos de daño. Vida restante: " + this.getPuntosVida());
        if (this.puntosVida == 0 && this.vivo == true) {
            this.vivo = false;
            System.out.println(this.getNombre() + " ha sido derrotado.");
        }
    }

    public void atacar() {
        System.out.println(this.getNombre() + " ataca con un golpe básico.");
    }

    public void defender() {
        System.out.println(this.getNombre() + " se pone en guardia.");
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + " | Nivel: " + this.getNivel() + " | Vida: " + this.getPuntosVida() + " | Vivo: " + this.getVivo();
    }
}