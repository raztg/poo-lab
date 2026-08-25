package Java.lab03;

public class Automovil extends Vehiculo {
    private int numPuertas;
    private boolean esElectrico;

    public Automovil(String marca, String modelo, int year, double velocidadMax, int numPuertas, boolean esElectrico) {
        super(marca, modelo, year, velocidadMax);
        this.numPuertas = numPuertas;
        this.esElectrico = esElectrico;
    }

    public int getNumPuertas() {
        return this.numPuertas;
    }

    public boolean getElectrico() {
        return this.esElectrico;
    }

    public void setNumPuertas(int numPuertas) {
        if (numPuertas >= 2 && numPuertas <= 6) {
            this.numPuertas = numPuertas;
        }
        else {
            System.out.println("Error: El número de puertas no es válido.");
        }
    }

    @Override
    public String toString() {
        return "Marca: " + getMarca() + " | Modelo: " + getModelo() + " | Año: " + getYear() + " | Velocidad máxima: " + getVelocidadMax() + " km/h | Número de puertas: " + getNumPuertas() + " | Es eléctrico: " + getElectrico();
    }
}