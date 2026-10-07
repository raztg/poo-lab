

public class Nigromante extends Personaje implements Hechicero {
    private int mana;
    private int poderOscuridad;

    public Nigromante(String nombre, int nivel, int puntosVida, int mana, int poderOscuridad) {
        super(nombre, nivel, puntosVida);
        this.mana = mana;
        this.poderOscuridad = poderOscuridad;
    }

    public int getMana() {
        return mana;
    }

    public int getPoderOscuridad() {
        return poderOscuridad;
    }

    public int calcularDamage() {
        return this.getNivel() * this.getPoderOscuridad() * 2;
    }

    public void atacar() throws RpgException {
        if (!isVivo()) {
            throw new PersonajeDerrotadoException(getNombre());
        }

        if (mana < 15) {
            throw new RecursoInsuficienteException("mana", mana);
        }

        mana -= 15;
        System.out.println(this.nombre + " ataca con un hechizo para drenar vida.");
    }

    public void lanzarHechizo() {
        System.out.println(this.nombre + " lanza un hechizo de oscuridad.");
    }
}