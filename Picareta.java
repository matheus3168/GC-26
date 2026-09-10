public class Picareta {

    private String material;
    private int durabilidade;
    private int forca;
    private int durabilidadeMaxima;

    public Picareta(String material, int durabilidade, int forca) {
        this.material = material;
        this.durabilidade = durabilidade;
        this.forca = forca;
        this.durabilidadeMaxima = durabilidade;
    }

    public void minerar(int blocos) {

        if (durabilidade <= 0) {
            System.out.println("Picareta quebrada!");
            return;
        }

        int minerados = 0;

        for (int i = 0; i < blocos; i++) {

            if (durabilidade <= 0) {
                break;
            }

            durabilidade--;
            minerados++;
        }

        System.out.println(
            "Picareta de " + material +
            " minerou " + minerados + " blocos."
        );

        System.out.println(
            "Durabilidade restante: " + durabilidade
        );
    }

    public void reparar(int quantidade) {

        durabilidade += quantidade;

        if (durabilidade > durabilidadeMaxima) {
            durabilidade = durabilidadeMaxima;
        }

        System.out.println(
            "Picareta de " + material +
            " reparada. Durabilidade: " +
            durabilidade
        );
    }

    public void mostrarStatus() {

        System.out.println(
            "Picareta de " + material +
            " | Durabilidade: " +
            durabilidade + "/" +
            durabilidadeMaxima +
            " | Força: " + forca
        );
    }
}