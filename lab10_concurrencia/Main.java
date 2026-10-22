public class Main {
    public static void main(String[] args) {

        // 1

        TablaResultados tabla = new TablaResultados();

        Personaje s1 = new Druida("Elysia", 5, 125, 50, 35, 15);
        Personaje m1 = new Nigromante("Malachar", 10, 120, 150, 60);
        Personaje l1 = new Arquero("Random", 18, 280, 100, 13);
        Personaje t1 = new Guerrero("Tarkus", 20, 440, 20, "cota de malla");
        Personaje b1 = new Druida("Brego", 10, 185, 90, 95, 5);
        Personaje k1 = new Nigromante("Lazarus", 5, 100, 80, 60);

        // Crear los Runnable
        CombateConcurrente c1 = new CombateConcurrente("Campo-1", s1, m1, tabla);
        CombateConcurrente c2 = new CombateConcurrente("Campo-2", l1, t1, tabla);
        CombateConcurrente c3 = new CombateConcurrente("Campo-3", b1, k1, tabla);

        // Envolver en Thread e iniciar
        Thread h1 = new Thread(c1);
        Thread h2 = new Thread(c2);
        Thread h3 = new Thread(c3);

        h1.start();
        h2.start();
        h3.start();

        // 2

        MonitorTorneo monitor = new MonitorTorneo("Torneo Principal", 3);
        monitor.start();

        // 3

        try {
            h1.join();   // espera a que Campo-1 termine
            h2.join();   // espera a que Campo-2 termine
            h3.join();   // espera a que Campo-3 termine
            monitor.join();
        } catch (InterruptedException e) {
            System.out.println("Espera interrumpida.");
        }

        System.out.println("\nTodos los combates han terminado.");
        tabla.mostrarResultados();

        // 4

        ContadorCompartido contador = new ContadorCompartido();

        try {
            // Sin synchronized — resultado incorrecto
            Thread[] hilos = new Thread[5];
            for (int i = 0; i < 5; i++) {
                hilos[i] = new Thread(() -> {
                    for (int j = 0; j < 1000; j++) contador.incrementar();
                });
                hilos[i].start();
            }
            for (Thread t : hilos) t.join();
            System.out.println("Sin sync  — esperado: 5000 | real: " +
                            contador.getContador());

            // Con synchronized — resultado correcto
            contador.resetear();
            for (int i = 0; i < 5; i++) {
                hilos[i] = new Thread(() -> {
                    for (int j = 0; j < 1000; j++) contador.incrementarSeguro();
                });
                hilos[i].start();
            }
            for (Thread t : hilos) t.join();
            System.out.println("Con sync  — esperado: 5000 | real: " +
                            contador.getContador());
        }
        catch (InterruptedException e) {
            System.out.println("");
        }
    }
}