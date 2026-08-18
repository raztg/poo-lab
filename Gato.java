package Java.lab02;

public class Gato extends Animal {
    private String color;
    private boolean interior;

    public Gato(String i_nombre, int i_edad, double i_peso, String i_color, boolean i_interior) {
        super(i_nombre, i_edad, i_peso);
        this.color = i_color;
        this.interior = i_interior;
    }

    public void maullar() {
        System.out.println(getNombre() + " dice: ¡Miau miau!");
    }

    public void ronronear() {
        System.out.println(getNombre() + " está ronroneando...");
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " | Edad: " + getEdad() + " años | Peso: " + getPeso() + " kg | Color: " + this.color + " | Interior: " + this.interior;
    }
}