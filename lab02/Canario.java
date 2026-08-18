package Java.lab02;

public class Canario extends Animal {
    private String color;
    private boolean canta;

    public Canario(String i_nombre, int i_edad, double i_peso, String i_color, boolean i_canta) {
        super(i_nombre, i_edad, i_peso);
        this.color = i_color;
        this.canta = i_canta;
    }

    public void volar() {
        System.out.println(getNombre() + " va a volar...");
    }

    public void picar() {
        System.out.println(getNombre() + " va a picar...");
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " | Edad: " + getEdad() + " años | Peso: " + getPeso() + " kg | Color: " + this.color + " | Canta: " + this.canta;
    }
}
