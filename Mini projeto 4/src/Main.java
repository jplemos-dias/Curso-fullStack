import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Criar lista de tarefas
        List<Tarefa> tarefas = new ArrayList<>();

        // Adicionar tarefas a lista
        tarefas.add(new Tarefa("Estudar java", false));
        tarefas.add(new Tarefa("Estudar Spring", false));
        tarefas.add(new Tarefa("Estudar React", true));
        tarefas.add(new Tarefa("Indicar colegas para a turma 4", true));

        // Exibindo todas as tarefas usando foreach:
        System.out.println("Lista de tarefas");
        for (tarefa:tarefas)
    }
}