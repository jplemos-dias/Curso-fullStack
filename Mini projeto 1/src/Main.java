public class Main {
    public static void main(String[] args) {
        // Criando uma maquina de bolos
        MaquinaDeBolos maquina = new MaquinaDeBolos();

        // Com essa maquina instanciada eu posso fabricar os bolos
        Bolo boloChocolate = maquina.fabricarBolo("chocolate", 20, 29.99);
        Bolo boloBauninha = maquina.fabricarBolo("baunilha", 15, 24.99);
        Bolo boloMorango = maquina.fabricarBolo("morango", 25, 34.99);

        // Exibir os bolos criados
        System.out.println("Bolos disponiveis:");
        boloChocolate.exibirDetalhes();
        boloBauninha.exibirDetalhes();
        boloMorango.exibirDetalhes();
    }
}