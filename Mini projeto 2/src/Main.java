public class Main {
    public static void main(String[] args) {
        // Criar os produtos

        Produto produto1 = new Produto("Notebook", 3500.00, "Eletronicos");
        Produto produto2 = new Produto("Smartphone", 2500.00, "Celulares");

     // Exibir os detalhes dos produtos
        System.out.println("Produtos cadastrados:");
        produto1.exibirDetalhes();
        produto2.exibirDetalhes();

        // Aplicar descontos

        System.out.println("Aplicando descontos:");
        System.out.println("Aplicando desconto do: "+produto1.nome);
        System.out.println("Aplicando desconto do: "+produto2.nome);
        produto1.aplicarDesconto(10);
        produto2.aplicarDesconto(20);
    }
}