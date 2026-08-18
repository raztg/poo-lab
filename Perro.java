package Java.lab02;

public class Perro extends Animal {
    private String raza;
    private boolean vacunado;

    public Perro(String i_nombre, int i_edad, double i_peso, String i_raza, boolean i_vacunado) {
        super(i_nombre, i_edad, i_peso);
        this.raza = i_raza;
        this.vacunado = i_vacunado;
    }

    public void ladrar() {
        System.out.println(getNombre() + " dice: ¡Guau guau!");
    }

    public void buscarPelota() {
        System.out.println(getNombre() + " está buscando la pelota...");
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " | Edad: " + getEdad() + " años | Peso: " + getPeso() + " kg | Raza: " + this.raza + " | Vacunado: " + this.vacunado;
    }
}