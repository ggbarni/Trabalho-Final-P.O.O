import java.util.ArrayList;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        ArrayList<UsuarioPF> usersPF = new ArrayList<>();
        ArrayList<UsuarioPJ> usersPJ = new ArrayList<>();

        Scanner read = new Scanner(System.in);
        boolean existe = false;
        String nDigits = null;
        String password = null;

        Cadastro registro01 = new Cadastro();
        Usuario recebe = registro01.cadastro();
        if (recebe instanceof UsuarioPF) {
            usersPF.add((UsuarioPF) recebe);
        } else
            usersPJ.add((UsuarioPJ) recebe);

        System.out.println(usersPF.size());
        System.out.println(usersPJ.size());

        System.out.println("Entrar!");

        System.out.print("Login (CPF\\CNPJ): ");
        nDigits = read.next();

        System.out.print("Senha: ");
        password = read.next();

        if (nDigits.length() == 11) {
            for (int i = 0; i < usersPF.size(); i++) {
                if (usersPF.get(i).getLoginCPF().equals(nDigits) && usersPF.get(i).getSenha().equals(password)) {
                    existe = true;
                    System.out.println("EXISTE");
                }
            }
            if (existe == false) {
                System.out.println("false");
                registro01.cadastro();
            }
        } else if (nDigits.length() == 14) {
            for (int i = 0; i < usersPF.size(); i++) {
                if (usersPF.get(i).getLoginCPF().equals(nDigits) && usersPF.get(i).getSenha().equals(password)) {
                    existe = true;
                    System.out.println("EXISTE");
                }
            }
            if (existe == false) {
                System.out.println("false");
                registro01.cadastro();
            }
        }
        read.close();
    }
}