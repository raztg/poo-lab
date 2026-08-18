package Java.lab02;

public class Main {
    public static void main(String[] args) {
        Perro myPerro = new Perro("Max", 3, 12.5, "Labrador", true);
        Gato myGato = new Gato("Misi", 2, 3.8, "Gris", true);
        Canario myCanario = new Canario("Pico", 1, 0.03, "Amarillo", true);
        System.out.println("=== Clínica Veterinaria ===");
        System.out.println("--- Perro ---");
        System.out.println(myPerro.toString());
        myPerro.comer();
        myPerro.ladrar();
        myPerro.buscarPelota();
        System.out.println("--- Gato ---");
        System.out.println(myGato.toString());
        myGato.dormir();
        myGato.maullar();
        myGato.ronronear();
        System.out.println("--- Canario ---");
        System.out.println(myCanario.toString());
        myCanario.comer();
        myCanario.volar();
        myCanario.picar();
    }
}

/*
1. ¿Por qué declaramos los atributos como private y no como public?
    -- Asegura que la información de la mascota no pueda ser editada por otros objetos sin relación alguna.
2. ¿Qué pasaría si quitaras el super() del constructor de Perro?
    -- Sería necesario inicializar los atributos de otra manera, ya que super() permite acceder fácilmente a Animal.
3. ¿Qué ventaja tiene sobreescribir toString() en lugar de crear un método con otro nombre?
    -- Hace más fácil agregar código nuevo y similar sin cambiar mucho lo que ya existe.
*/