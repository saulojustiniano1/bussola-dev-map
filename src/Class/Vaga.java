package Class;

public class Vaga {
    private int id_vaga;
    private String titulo;
    private String descricao;
    private String requisitos;
    private String faixa_salarial;
    private String empresa;

    public void Vaga(int id_vaga, String titulo, String descricao, String requisitos, String faixa_salarial, String empresa) {
        this.id_vaga = id_vaga;
        this.titulo = titulo;
        this.descricao = descricao;
        this.requisitos = requisitos;
        this.faixa_salarial = faixa_salarial;
        this.empresa = empresa;
    }

    public void fechar_vaga() {
        System.out.println("Vaga " + this.titulo + " fechada com sucesso!");
    }
}
