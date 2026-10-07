import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // 1

            PersistenciaGremio persistencia = new PersistenciaGremio();

            ArrayList<Personaje> roster = new ArrayList<>();
            roster.add(new Druida("Elysia", 5, 125, 50, 35, 15));
            roster.add(new Arquero("Random", 18, 280, 100, 13));
            roster.add(new Guerrero("Tarkus", 20, 440, 20, "cota de malla"));

            persistencia.guardarRoster(roster);

            // 2

            ArrayList<String> lineasRoster = persistencia.cargarRoster();
            System.out.println("\n=== Roster cargado desde archivo ===");
            for (String linea : lineasRoster) {
                String[] partes = linea.split(",");
                System.out.println("Nombre: " + partes[0] +
                                " | Nivel: " + partes[1] +
                                " | Vida: " + partes[2]);
            }

            // 3

            HashMap<String, Integer> inventario = new HashMap<>();
            inventario.put("Poción de vida", 8);
            inventario.put("Flecha élfica", 30);
            inventario.put("Pergamino de fuego", 3);

            persistencia.guardarInventario(inventario);

            HashMap<String, Integer> inventarioCargado =
                persistencia.cargarInventario();

            System.out.println("\n=== Inventario cargado desde archivo ===");
            for (Map.Entry<String, Integer> e : inventarioCargado.entrySet()) {
                System.out.println(e.getKey() + " → " + e.getValue());
            }

            // 4

            persistencia.agregarEntradaBitacora("Elysia atacó a Malachar (daño: 240)");
            persistencia.agregarEntradaBitacora("Random sin flechas — no pudo atacar");
            persistencia.agregarEntradaBitacora("Tarkus venció a Dragón de Hielo");

            persistencia.mostrarBitacora();

            // 5

            File carpeta = new File("datos_gremio");
            System.out.println("\n=== Archivos en datos_gremio/ ===");
            for (File f : carpeta.listFiles()) {
                System.out.println(f.getName() +
                                " (" + f.length() + " bytes)");
            }
        } catch (IOException e) {
            System.out.println("Error de archivo: " + e.getMessage());
        }
    }
}