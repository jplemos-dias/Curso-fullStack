public class Tarefa {
    private String descricao;
    private boolean concluida;

    public Tarefa(boolean concluida, String descricao) {
        this.concluida = concluida;
        this.descricao = descricao;
    }

    public void exibirTarefas() {
        String status = concluida ? "Concluida" : "pendente":
        System.out.println(descricao + " - " + status);
    }

    public boolean inConcluida() {
        return concluida;
    }
}
