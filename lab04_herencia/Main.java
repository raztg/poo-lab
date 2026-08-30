package Java.lab04;

public class Main {
    public static void main(String[] args) {
        Guerrero myGuerrero = new Guerrero("Tarkus", 20, 440, 20, "cota de malla");
        Mago myMago = new Mago("Dorian", 12, 260, 20, 2);
        Arquero myArquero = new Arquero("Random", 18, 280, 100, 13);
        myGuerrero.atacar();
        myGuerrero.defender();
        myMago.atacar();
        myMago.defender();
        myArquero.atacar();
        myArquero.defender();

        myGuerrero.damage(300);
        myMago.damage(300);

        System.out.println(myGuerrero.toString());
        System.out.println(myMago.toString());
        System.out.println(myArquero.toString());
    }
}