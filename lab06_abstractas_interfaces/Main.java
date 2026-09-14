package Java.lab06;

public class Main {
    public static void main(String[] args) {
        // Cannot instantiate the type Personaje
        // Personaje p = new Personaje("A", 10, 10);

        Personaje myDruida = new Druida("Elysia", 5, 125, 50, 35, 15);
        Personaje myNigromante = new Nigromante("Lazarus", 5, 100, 80, 60);
        Personaje myBardo = new Bardo("William", 5, 125, 55, 35);

        Personaje[] equipo = {myDruida, myNigromante, myBardo};
        for (Personaje p : equipo) {
            p.atacar();
            System.out.println("Daño: " + p.calcularDamage());
        }

        for (Personaje p : equipo) {
            if (p instanceof Hechicero h) {
                h.lanzarHechizo();
            }
            if (p instanceof Sanador s) {
                s.curarAliado(myNigromante);
            }
        }

        myNigromante.recibirDamage(50);
        ((Bardo) myBardo).curarAliado(myNigromante);
    }
}