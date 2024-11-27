package Class;

public class Recomendacao {
    private int id_recomendacao;
    private String tecnologias;
    private String ferramentas;
    private String linguagens;
    private String frameworks;

    public Recomendacao(int id_recomendacao, String tecnologias, String ferramentas, String linguagens, String frameworks) {
        this.id_recomendacao = id_recomendacao;
        this.tecnologias = tecnologias;
        this.ferramentas = ferramentas;
        this.linguagens = linguagens;
        this.frameworks = frameworks;
    }

    public void gerar_recomendacao(String tecnologias, String ferramentas, String linguagens, String frameworks) {
        this.tecnologias = tecnologias;
        this.ferramentas = ferramentas;
        this.linguagens = linguagens;
        this.frameworks = frameworks;
    }
}
