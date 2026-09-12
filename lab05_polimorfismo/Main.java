package Java.lab05;

public class Main {
    public static void main(String[] args) {
        Personaje p1 = new Guerrero("Tarkus", 20, 440, 20, "cota de malla");
        Personaje p2 = new Mago("Dorian", 12, 260, 20, 2);
        Personaje p3 = new Arquero("Random", 18, 280, 100, 13);

        System.out.println(p1.calcularDamage()); // ejecuta el de Guerrero
        System.out.println(p2.calcularDamage()); // ejecuta el de Mago
        System.out.println(p3.calcularDamage()); // ejecuta el de Arquero

        Personaje[] equipo = { p1, p2, p3 };
        for (Personaje p : equipo) {
            System.out.println(p.getNombre() + " daño: " + p.calcularDamage());
        }

        GestorBatalla gestor = new GestorBatalla();

        gestor.ejecutarAtaque(p1);            // versión 1 persona
        gestor.ejecutarAtaque(p2, p3);        // versión atacante vs defensor
        gestor.ejecutarAtaque(equipo);        // versión equipo completo

        gestor.mostrarHistorial();

        for (Personaje p : equipo) {
            if (p instanceof Guerrero) {
                System.out.println(p.getNombre() + " es un Guerrero.");
            } else if (p instanceof Mago) {
                System.out.println(p.getNombre() + " es un Mago.");
            } else if (p instanceof Arquero) {
                System.out.println(p.getNombre() + " es un Arquero.");
            }
        }

        ((Guerrero) p1).entrenar();
        ((Guerrero) p1).entrenar(2);
        ((Guerrero) p1).entrenar(2, true);
    }
}