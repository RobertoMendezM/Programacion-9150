package miPaquete;

public class PruebaLlamada {

    public static void main(String... algo) {
        LLamaUnNumero callme = new LLamaUnNumero();
        System.out.println("La llamada al método da: " + callme.getNumero());
    }
}

