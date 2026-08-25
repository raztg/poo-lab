package Java.lab03;

public class Avion extends Vehiculo {
    private int numPasajeros;
    private double altitudMax;

    public Avion(String marca, String modelo, int year, double velocidadMax, int numPasajeros, double altitudMax) {
        super(marca, modelo, year, velocidadMax);
        this.numPasajeros = numPasajeros;
        this.altitudMax = altitudMax;
    }

    public int getNumPasajeros() {
        return this.numPasajeros;
    }

    public double getAltitudMax() {
        return this.altitudMax;
    }

    public void setNumPasajeros(int numPasajeros) {
        if (numPasajeros > 0) {
            this.numPasajeros = numPasajeros;
        }
        else {
            System.out.println("Error: El número de pasajeros no es válido.");
        }
    }

    public void setAltitudMax(double altitudMax) {
        if (altitudMax > 0) {
            this.altitudMax = altitudMax;
        }
        else {
            System.out.println("Error: La altitud máxima no es válida.");
        }
    }

    @Override
    public String toString() {
        return "Marca: " + getMarca() + " | Modelo: " + getModelo() + " | Año: " + getYear() + " | Velocidad máxima: " + getVelocidadMax() + " km/h | Número de pasajeros: " + getNumPasajeros() + " | Altitud máxima: " + getAltitudMax() + " m";
    }
}