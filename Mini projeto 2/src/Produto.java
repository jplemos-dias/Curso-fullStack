public class Produto {
    String nome;
    double preco;
    String categoria;

// Construtor para inicializar os futuros projetos
    public Produto(String nome, double preco, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    // Metodo para exibir detalhes
    public void exibirDetalhes() {
        System.out.println("Produto: "+nome + " -- Preço: "+ preco +" -- Categoria"+categoria );
    }

    //Metodo para aplicar desconto ao produto
    public void aplicarDesconto(double percentual) {
        preco -= preco * (percentual / 100);
        System.out.println("Novo preço com "+ percentual+ "% de desconto: R$"+ preco);
    }
}
