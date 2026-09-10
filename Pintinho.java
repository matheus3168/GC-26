public class Pintinho extends GalinhaMae {

    public Pintinho(int id, String nome, String raca, int idade) {
        super(id, nome, raca, idade);
    }

    @Override
    public String getStatus() {
        return "Filhote";
    }

    @Override
    public void emitirSom() {
        System.out.println("Piu-piu!");
    }

    @Override
    public void coletarProduto() {
        System.out.println(nome + " ainda nao produz ovos.");
    }
}