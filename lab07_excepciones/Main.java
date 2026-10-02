package lab;

public class Main {
    public static void main(String[] args) {
        Personaje druida = new Druida("Elysia", 5, 125, 50, 35, 15);
        Personaje nigromante = new Nigromante("Lazarus", 5, 100, 80, 60);

        MotorCombate motor = new MotorCombate();
        motor.ejecutarTurno(druida, nigromante);

        druida.recibirDamage(9999);   // primero derrota al druida
        motor.ejecutarTurno(druida, nigromante);  // captura PersonajeDerrotadoException

        Arquero sinFlechas = new Arquero("Legolas", 6, 150, "Arco Largo", 0, 95);
        motor.ejecutarTurno(sinFlechas, nigromante);  // captura RecursoInsuficienteException

        Personaje druida2 = new Druida("Ellai", 5, 125, 50, 35, 15);
        try {
            druida2.curarAliado(druida);
        } catch (RpgException e) {
            System.out.println("No se pudo curar: " + e.getMessage());
        }

        try {
            nigromante.recibirDamage(-50);
        } catch (AccionInvalidaException e) {
            System.out.println("Capturado: " + e.getMessage());
        } finally {
            System.out.println("El bloque finally siempre se ejecuta.");
        }

        motor.mostrarBitacora();
    }
}