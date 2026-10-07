

public class Main {
    public static void main(String[] args) {
        GestionGremio gremio = new GestionGremio();
        gremio.agregarMiembro(new Druida("Elysia", 5, 125, 50, 35, 15));
        gremio.agregarMiembro(new Nigromante("Lazarus", 5, 100, 80, 60));
        gremio.agregarMiembro(new Arquero("Random", 18, 280, 100, 13));
        gremio.agregarMiembro(new Guerrero("Tarkus", 20, 440, 20, "cota de malla"));
        gremio.mostrarRoster();

        gremio.eliminarMiembro("Lazarus");
        gremio.mostrarRoster();

        Personaje encontrado = gremio.buscarPorNombre("Tarkus");
        if (encontrado != null)
            System.out.println("Encontrado: " + encontrado.getNombre());

        gremio.encolarSolicitante("Gandalf");
        gremio.encolarSolicitante("Aragorn");
        gremio.encolarSolicitante("Gimli");
        gremio.mostrarCola();

        gremio.atenderSiguiente();   // atiende a Gandalf (FIFO)
        gremio.mostrarCola();

        gremio.agregarItem("Poción de vida", 5);
        gremio.agregarItem("Flecha élfica", 30);
        gremio.agregarItem("Poción de vida", 3);  // suma → 8

        gremio.mostrarInventario();

        gremio.usarItem("Poción de vida");
        gremio.usarItem("Pergamino de fuego");    // no existe
        gremio.mostrarInventario();

        gremio.registrarHabilidad("Curación");
        gremio.registrarHabilidad("Magia oscura");
        gremio.registrarHabilidad("Curación");    // duplicado — no se agrega

        gremio.mostrarHabilidades();

        System.out.println("¿Tiene flecha? " + gremio.tieneHabilidad("Tiro con arco"));
        System.out.println("¿Tiene curación? " + gremio.tieneHabilidad("Curación"));

        gremio.mostrarRoster();
        gremio.mostrarCola();
        gremio.mostrarInventario();
        gremio.mostrarHabilidades();
    }
}