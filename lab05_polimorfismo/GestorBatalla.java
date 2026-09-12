package Java.lab05;

import java.util.ArrayList;

public class GestorBatalla {
    private ArrayList<String> historial = new ArrayList<String>();

    // Versión 1: un solo atacante
    public void ejecutarAtaque(Personaje atacante) {
        int damage = atacante.calcularDamage();
        atacante.atacar();
        historial.add(atacante.getNombre() + " atacó solo (daño: " + damage + ")");
    }

    // Versión 2: atacante vs defensor
    public void ejecutarAtaque(Personaje atacante, Personaje defensor) {
        int damage = atacante.calcularDamage();
        atacante.atacar();
        defensor.damage(damage);
        defensor.defender();
        historial.add(atacante.getNombre() + " atacó a " + defensor.getNombre() + " (daño: " + damage + ")");
    }

    // Versión 3: todo un equipo ataca
    public void ejecutarAtaque(Personaje[] equipo) {
        String out = "Ataque en equipo: ";
        int damageSum = 0;
        for (int i = 0; i < equipo.length; i++) {
            int damage = equipo[i].calcularDamage();
            equipo[i].atacar();
            out = out + equipo[i].getNombre() + " ";
            damageSum = damageSum + damage;
        }
        out = out + "(daño acumulado: " + damageSum + ")";
        historial.add(out);
    }

    public void mostrarHistorial() {
        for (int i = 0; i < historial.size(); i++) {
            System.out.println((i + 1) + ". " + historial.get(i));
        }
    }

    public void eliminarHistorial() {
        historial.clear();
    }
}
