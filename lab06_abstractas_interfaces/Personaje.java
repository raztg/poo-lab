package Java.lab06;

public abstract class Personaje {
    protected String nombre;
    protected int nivel;
    protected int puntosVida;
    protected boolean vivo;

    public Personaje(String nombre, int nivel, int puntosVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
        this.vivo = true;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void recibirDamage(int damage) {
        puntosVida -= damage;
        if (puntosVida <= 0) {
            puntosVida = 0;
            vivo = false;
        }
        System.out.println(nombre + " recibe " + damage + " de daño. Vida: " + puntosVida);
        if (!vivo) {
            System.out.println(nombre + " ha sido derrotado.");
        }
    }

    public abstract int calcularDamage();

    public abstract void atacar();

    @Override
    public String toString() {
        String out = vivo ? "Sí" : "No";
        return "Nombre: " + nombre + " | Nivel: " + nivel + " | Vida: " + puntosVida + " | Vivo: " + out;
    }
}