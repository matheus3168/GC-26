package Barbie.demo;

public class GuardaRoupaCorrigido {

    private double orcamento;

    public GuardaRoupaCorrigido(double orcamento) {
        if (!Double.isFinite(orcamento) || orcamento < 0) {
            throw new IllegalArgumentException("Orçamento inválido");
        }

        this.orcamento = orcamento;
    }

    public double precoComDesconto(double preco, double percentual) {

        validarPreco(preco);

        if (!Double.isFinite(percentual) ||
                percentual < 0 || percentual > 100) {
            throw new IllegalArgumentException("Desconto inválido");
        }

        return preco - (preco * percentual / 100);
    }

    public boolean cabeNoOrcamento(double preco) {
        validarPreco(preco);
        return preco <= orcamento;
    }

    public boolean ehDeGala(double preco) {
        validarPreco(preco);
        return preco >= 200.0;
    }

    public void registrarCompra(double preco) {

        validarPreco(preco);

        if (!cabeNoOrcamento(preco)) {
            throw new IllegalArgumentException("Orçamento insuficiente");
        }

        this.orcamento -= preco;
    }

    public double getOrcamento() {
        return orcamento;
    }

    private void validarPreco(double preco) {
        if (!Double.isFinite(preco) || preco < 0) {
            throw new IllegalArgumentException("Preço inválido");
        }
    }
}