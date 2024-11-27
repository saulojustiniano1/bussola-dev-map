package Class;

public class Grupo {
    private int id_grupo;
    private String nome;
    private String topico;
    private String membros;

    public Grupo(int id_grupo, String nome, String topico, String membros) {
        this.id_grupo = id_grupo;
        this.nome = nome;
        this.topico = topico;
        this.membros = membros;
    }

    public void adicionar_membro(String membro) {
        this.membros += ", " + membro;
    }

    public void criar_discussao(String topico) {
        this.topico = topico;
    }
}
