public class FabricaPicaretas {

    public static Picareta fabricar(String material) {

        switch (material.toLowerCase()) {

            case "madeira":
                return new Picareta("madeira", 50, 5);

            case "pedra":
                return new Picareta("pedra", 70, 8);

            case "ferro":
                return new Picareta("ferro", 100, 12);

            case "ouro":
                return new Picareta("ouro", 30, 15);

            default:
                System.out.println("Material inválido!");
                return null;
        }
    }

    public static Picareta[] fabricar(String material, int quantidade) {

        Picareta[] picaretas = new Picareta[quantidade];

        for (int i = 0; i < quantidade; i++) {
            picaretas[i] = fabricar(material);
        }

        return picaretas;
    }
}