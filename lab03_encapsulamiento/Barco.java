package Java.lab03;

public class Barco extends Vehiculo {
    private int numTripulantes;
    private double tonelajeMax;

    public Barco(String marca, String modelo, int year, double velocidadMax, int numTripulantes, double tonelajeMax) {
        super(marca, modelo, year, velocidadMax);
        this.numTripulantes = numTripulantes;
        this.tonelajeMax = tonelajeMax;
    }

    public int getNumTripulantes() {
        return this.numTripulantes;
    }

    public double getTonelajeMax() {
        return this.tonelajeMax;
    }

    public void setNumTripulantes(int numTripulantes) {
        if (numTripulantes > 0) {
            this.numTripulantes = numTripulantes;
        }
        else {
            System.out.println("Error: El número de tripulantes no es válido.");
        }
    }

    public void setTonelajeMax(double tonelajeMax) {
        if (tonelajeMax > 0) {
            this.tonelajeMax = tonelajeMax;
        }
        else {
            System.out.println("Error: El tonelaje máximo no es válido.");
        }
    }

    @Override
    public String toString() {
        return "Marca: " + getMarca() + " | Modelo: " + getModelo() + " | Año: " + getYear() + " | Velocidad máxima: " + getVelocidadMax() + " km/h | Número de tripulantes: " + getNumTripulantes() + " | Tonelaje máximo: " + getTonelajeMax() + " ton";
    }
}