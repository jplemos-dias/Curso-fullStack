public class NotificacaoEmail implements Notificacao{
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando Email: "+mensagem);
    }
}
