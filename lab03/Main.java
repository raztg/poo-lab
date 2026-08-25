package Java.lab03;

public class Main {
    public static void main(String[] args) {
        Automovil myAutomovil = new Automovil("Toyota", "Corolla", 2022, 180.0, 4, false);
        Avion myAvion = new Avion("Boeing", "737", 2019, 850.0, 100, 11000.0);
        Barco myBarco = new Barco("Ferretti", "550", 2020, 45.0, 2, 35.0);
        System.out.println(myAutomovil.toString());
        System.out.println(myAvion.toString());
        System.out.println(myBarco.toString());
        myAutomovil.setNumPuertas(12);
        myAvion.setNumPasajeros(-1);
        myBarco.setNumTripulantes(-1);
        myAutomovil.setNumPuertas(2);
        myAvion.setNumPasajeros(120);
        myBarco.setNumTripulantes(4);
        System.out.println(myAutomovil.toString());
        System.out.println(myAvion.toString());
        System.out.println(myBarco.toString());
    }
}