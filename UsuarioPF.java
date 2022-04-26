public class UsuarioPF extends Usuario {

    private String loginCPF;

    public UsuarioPF(String senha, String nome, String email, String telefone, String loginCPF) {
        super(senha, nome, email, telefone);
        this.loginCPF = loginCPF;
    }

    public String getLoginCPF() {
        return loginCPF;
    }

    public void setLoginCPF(String login) {
        this.loginCPF = login;
    }

    public String toString() {
        return "ID: " + getID() + "\nNome: " + getNome() + "\nEmail: " + getEmail() + "\nTelefone: " + getTelefone()
                + "\nSenha: " + loginCPF + "\nLogin: " + getSenha();
    }
}
