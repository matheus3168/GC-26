public class VacaMae implements Animal {

    protected int id;
    protected String nome;
    protected String raca;
    protected int idade;

    public VacaMae(int id, String nome, String raca, int idade) {
        this.id = id;
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getRaca() {
        return raca;
    }

    @Override
    public int getIdade() {
        return idade;
    }

    @Override
    public String getStatus() {
        return "Sem filhotes";
    }

    @Override
    public void emitirSom() {
        System.out.println("Muuu!");
    }

    @Override
    public void coletarProduto() {
        System.out.println(nome + " produziu leite!");
    }
}