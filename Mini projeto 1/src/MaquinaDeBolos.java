// Cria os bolos apartir da receita (classe bolo)
public class MaquinaDeBolos {
    public Bolo fabricarBolo(String sabor, int tamanho, double preco) {
        System.out.println("Fabricanto um bolo de "+ sabor+" ...");
        return new Bolo(sabor, tamanho, preco);
    }
}
