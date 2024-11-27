package Class;

public class Usuario {
    private int id_usuario;
    private String nome;
    private String email;
    private String senha;
    private String tipo_perfil;

    public Usuario(int id_usuario, String nome, String email, String senha, String tipo_perfil) {
        this.id_usuario = id_usuario;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.tipo_perfil = tipo_perfil;
    }

    public void registrar(String nome, String email, String senha, String tipo_perfil) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.tipo_perfil = tipo_perfil;
    }

    public void entrar(String email, String senha) {
        if (this.email.equals(email) && this.senha.equals(senha)) {
            System.out.println("Bem-vindo, " + this.nome + "!");
        } else {
            System.out.println("E-mail ou senha incorretos.");
        }
    }

    public void sair() {
        System.out.println("Até logo, " + this.nome + "!");
    }

}
