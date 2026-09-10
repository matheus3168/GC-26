public class Main {

    public static void main(String[] args) {

        System.out.println("=== BANCADA AUTOMÁTICA DO VELHO STEVE ===");

        Picareta[] ferro =
                FabricaPicaretas.fabricar("ferro", 30);

        Picareta[] ouro =
                FabricaPicaretas.fabricar("ouro", 15);

        Picareta[] pedra =
                FabricaPicaretas.fabricar("pedra", 5);

        Picareta[] madeira =
                FabricaPicaretas.fabricar("madeira", 1);

        System.out.println("\n=== PICARETAS FABRICADAS ===");

        System.out.println("Ferro: " + ferro.length);
        System.out.println("Ouro: " + ouro.length);
        System.out.println("Pedra: " + pedra.length);
        System.out.println("Madeira: " + madeira.length);

        int total = ferro.length + ouro.length + pedra.length + madeira.length;

        System.out.println("\nTotal de picaretas fabricadas: " + total);
    }
}