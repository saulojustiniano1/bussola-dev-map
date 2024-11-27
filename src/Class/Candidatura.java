package Class;

public class Candidatura {
    private int id_candidatura;
    private int id_desenvolvedor;
    private int id_vaga;
    private String status;

    public Candidatura(int id_candidatura, int id_desenvolvedor, int id_vaga, String status) {
        this.id_candidatura = id_candidatura;
        this.id_desenvolvedor = id_desenvolvedor;
        this.id_vaga = id_vaga;
        this.status = status;
    }

    public void atualizar_status(String status) {
        this.status = status;
    }
}
