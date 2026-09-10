public class Bezerro extends VacaMae {

    public Bezerro(int id, String nome, String raca, int idade) {
        super(id, nome, raca, idade);
    }

    @Override
    public String getStatus() {
        return "Filhote";
    }

    @Override
    public void emitirSom() {
        System.out.println("Muuu!");
    }

    @Override
    public void coletarProduto() {
        System.out.println(nome + " ainda nao produz leite.");
    }
}