import java.util.Scanner; 

    public class Cadastro{
        private String senha;
        private String nome;
        private String email;
        private String telefone;
        private String login;
        private Usuario userPF;
        private Usuario userPJ;
        
    public Usuario cadastro(){

        Scanner input = new Scanner(System.in);
        int op = 0;

        System.out.println("Pessoa Fisica (1) | Pessoa Juridica (2)");

        do{ //Tratando opção de cadastro
            try{
                System.out.print("Entre com a opção: ");
                op = Integer.parseInt(input.next());
                //Tratar exceção caso a entrada for diferente de 1 ou 2 
            }catch(NumberFormatException exception){
   
               System.out.println("Valor inválido!");
            }
        }while(op != 1 & op != 2);


        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao cadastro!");

        /*NOME/RAZÃO SOCIAL*/
        do {
            if(op == 1){
                System.out.print("Nome: ");
                nome = scanner.nextLine();
            }
            else{
                System.out.print("Razão Social: ");
                nome = scanner.nextLine();
            }
        } while (nome.length() < 4 || nome.length() > 30 );

        /*EMAIL*/
        do {
            System.out.print("Email: ");
            email = scanner.next();
        } while (email.length() <= 0);

        /*TELEFONE*/
        do {
            System.out.print("Telefone: ");
            telefone = scanner.next();
        } while (telefone.length() <= 0 || telefone.length() > 11);

        /*LOGIN*/
        if(op == 1){
            do {
                System.out.print("Login (CPF): ");
                login = scanner.next();
            } while (login.length() != 11);
        }
         else
            do {
                System.out.print("Login (CNPJ): ");
                login = scanner.next();
            } while (login.length() != 14);
        }
!=
        /*SENHA*/
        do {
            System.out.print("Senha: ");
            senha = scanner.next();
        } while (senha.length() <= 0 || senha.length() > 4);

        scanner.close();  input.close();
        System.err.println("CADASTRADO");

        if(op == 1){
            userPF = new UsuarioPF(senha, nome, email, telefone, login);
            return  userPF;
            //System.out.println(userPF.toString());
        }
        else {
            userPJ = new UsuarioPJ(senha, nome, email, telefone, login);
            return userPJ;
            //System.out.println(userPJ.toString());
        }

    }

}
}