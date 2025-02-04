import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in)

        // Exibir o tipo de notificacao a ser escolhida
        System.out.println("Escoha o tipo de notificação");
        System.out.println("1 - Email");
        System.out.println("2 - SMS");
        System.out.println("3 - Whatsapp");

        int escolha = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a mensagem a ser enviada");
        String mensagem = scanner.nextLine();

        Notificacao notificacao = null;

        switch (escolha) {
            case 1:
                notificacao = NotificacaoSMS
        }
    }
}