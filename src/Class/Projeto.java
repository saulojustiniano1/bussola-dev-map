package Class;

public class Projeto {
    private int id_projeto;
    private String titulo;
    private String descricao;
    private String tecnologias_usadas;
    private String link_repositorio;

    public Projeto(int id_projeto, String titulo, String descricao, String tecnologias_usadas, String link_repositorio) {
        this.id_projeto = id_projeto;
        this.titulo = titulo;
        this.descricao = descricao;
        this.tecnologias_usadas = tecnologias_usadas;
        this.link_repositorio = link_repositorio;
    }

    public void atualizar_projeto(String titulo, String descricao, String tecnologias_usadas, String link_repositorio) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.tecnologias_usadas = tecnologias_usadas;
        this.link_repositorio = link_repositorio;
    }

    public void excluir_projeto() {
        System.out.println("Projeto " + this.titulo + " excluído com sucesso!");
    }
}
