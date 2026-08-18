package Java.lab02;

public class Animal {
    private String nombre;
    private int edad;
    private double peso;

    public Animal(String i_nombre, int i_edad, double i_peso) {
        this.nombre = i_nombre;
        this.edad = i_edad;
        this.peso = i_peso;
    }

    public void comer() {
        System.out.println(this.nombre + " está comiendo.");
    }

    public void dormir() {
        System.out.println(this.nombre + " está durmiendo.");
    }

    public String toString() {
        return "Nombre: " + this.nombre + " | Edad: " + this.edad + " años | Peso: " + this.peso + " kg";
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public double getPeso() {
        return this.peso;
    }
}