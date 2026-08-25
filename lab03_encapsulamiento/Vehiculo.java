package Java.lab03;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int year;
    protected double velocidadMax;

    public Vehiculo(String marca, String modelo, int year, double velocidadMax) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.velocidadMax = velocidadMax;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getYear() {
        return year;
    }

    public double getVelocidadMax() {
        return velocidadMax;
    }

    public void setYear(int year) {
        if (year >= 1885 && year <= 2100) {
            this.year = year;
        }
        else {
            System.out.println("Error: El año no es válido.");
        }
    }

    public void setVelocidadMax(double velocidadMax) {
        if (velocidadMax > 0) {
            this.velocidadMax = velocidadMax;
        }
        else {
            System.out.println("Error: La velocidad no es válida.");
        }
    }

    public void describir() {
        System.out.println("Marca: " + this.marca + " | Modelo: " + this.modelo + " | Año: " + this.year + " | Velocidad máxima: " + this.velocidadMax + " km/h");
    }

    @Override
    public String toString() {
        return "Marca: " + getMarca() + " | Modelo: " + getModelo() + " | Año: " + getYear() + " | Velocidad máxima: " + getVelocidadMax() + " km/h";
    }
}