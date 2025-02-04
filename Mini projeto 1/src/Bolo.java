public class Bolo {
    // Caracteristicas dos bolos
    String sabor;
    int tamanho;
    double preco;

    // Construtor para definir os atributos ao criar um NOVO (new) objeto
    public Bolo(String sabor, int tamanho, double preco) {
        // Oque vem dentro do new, assume o valor do this.
        this.sabor = sabor;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    // Acao metodo para exibir os detalhes do bolo
    public void exibirDetalhes() {
        System.out.println("bolo de: "+ sabor +" -- Tamanho "+ tamanho+" -- Preço: "+ preco );
    }
}
