public abstract class Usuario {

    private String senha;
    private String nome;
    private String email;
    private String telefone;

    private int id = 0;

    public Usuario(String senha, String nome, String email, String telefone) {
        this.senha = senha;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.id += 1;
    }

    public Usuario() {

    }

    public String getSenha() {
        return this.senha;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public int getID() {
        return this.id;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public abstract String toString(); /*
                                        * {
                                        * return "ID: " + id + "\nNome: " + nome + "\nEmail: " + email + "\nTelefone: "
                                        * + telefone + "\nSenha: " + senha;
                                        * }
                                        */

}