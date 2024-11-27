package Class;

public class Mensagem {
    private int id_mensagem;
    private int id_remetente;
    private int id_destinatario;
    private String conteudo;
    private String data_hora;

    public Mensagem(int id_mensagem, int id_remetente, int id_destinatario, String conteudo, String data_hora) {
        this.id_mensagem = id_mensagem;
        this.id_remetente = id_remetente;
        this.id_destinatario = id_destinatario;
        this.conteudo = conteudo;
        this.data_hora = data_hora;
    }

    public void enviar_mensagem(String conteudo, String data_hora) {
        this.conteudo = conteudo;
        this.data_hora = data_hora;
    }

    public void excluir_mensagem() {
        this.conteudo = "";
    }
}
