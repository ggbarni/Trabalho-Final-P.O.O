public class UsuarioPJ extends Usuario {

    private String loginCNPJ;

    public UsuarioPJ(String senha, String nome, String email, String telefone, String loginCNPJ) {
        super(senha, nome, email, telefone);
        this.loginCNPJ = loginCNPJ;
    }

    public String getLoginCNPJ() {
        return loginCNPJ;
    }

    public void setLoginCNPJ(String login) {
        this.loginCNPJ = login;
    }

    public String toString() {
        return "ID: " + getID() + "\nNome: " + getNome() + "\nEmail: " + getEmail() + "\nTelefone: " + getTelefone()
                + "\nSenha: " + loginCNPJ + "\nLogin: " + getSenha();
    }
}