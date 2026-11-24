
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Cardapio cardapio = new Cardapio();
        Videos videos = new Videos();
        Filmes filmes = new Filmes();
        Cadastro cadastro = new Cadastro();
        Login login = new Login();
        Favoritos favoritos = new Favoritos();

        GerenciadorReceitas gerenciador = new GerenciadorReceitas();
        CadastroAdministrador cadastroAdmin = new CadastroAdministrador();
        LoginAdministrador loginAdmin = new LoginAdministrador();
        PainelAdministrador painelAdmin = new PainelAdministrador();

        // Carrega o usuario salvo
        Usuario usuario = cadastro.carregarUsuario();

        // Carrega o administrador salvo
        Administrador administrador =
                cadastroAdmin.carregarAdministrador();

        boolean logado = false;
        boolean adminLogado = false;

        int opcao;

        do {
            System.out.println("\n===== DEVBRODERS =====");
            System.out.println("LIVRO DE RECEITAS");
            System.out.println("1 - Cardapios regionais");
            System.out.println("2 - Videos de culinaria");
            System.out.println("3 - Filmes para inspirar");
            System.out.println("4 - Cadastro de usuario");
            System.out.println("5 - Login de usuario");
            System.out.println("6 - Meus favoritos");
            System.out.println("7 - Enviar receita");
            System.out.println("8 - Cadastro de administrador");
            System.out.println("9 - Login de administrador");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");

            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {

                case 1:
                    cardapio.mostrarMenu(teclado, favoritos, logado, gerenciador);
                    break;

                case 2:
                    videos.mostrarVideos(teclado);
                    break;

                case 3:
                    filmes.mostrarFilmes(teclado);
                    break;

                case 4:
                    if (usuario == null) {
                        usuario = cadastro.realizarCadastro(teclado);
                    } else {
                        System.out.println("Voce ja possui uma conta!");
                    }
                    break;

                case 5:
                    logado = login.realizarLogin(teclado, usuario);
                    break;

                case 6:
                    if (logado) {
                        System.out.println("\n===== MEUS FAVORITOS =====");
                        System.out.println("1 - Visualizar favoritos");
                        System.out.println("2 - Remover favorito");
                        System.out.println("0 - Voltar");
                        System.out.print("Escolha uma opcao: ");

                        int opcaoFavoritos = teclado.nextInt();
                        teclado.nextLine();

                        if (opcaoFavoritos == 1) {
                            favoritos.mostrarFavoritos();
                        } else if (opcaoFavoritos == 2) {
                            favoritos.removerFavorito(teclado);
                        } else if (opcaoFavoritos == 0) {
                            System.out.println("Voltando ao menu principal!");
                        } else {
                            System.out.println("Opcao invalida!");
                        }

                    } else {
                        System.out.println("Voce precisa fazer login para acessar os favoritos!");
                    }
                    break;

                case 7:
                    if (logado) {
                        gerenciador.enviarReceita(teclado, usuario);
                    } else {
                        System.out.println("Voce precisa fazer login para enviar uma receita!");
                    }
                    break;

                case 8:
                    if (administrador == null) {
                        administrador = cadastroAdmin.realizarCadastro(teclado);
                    } else {
                        System.out.println("Ja existe um administrador cadastrado!");
                    }
                    break;

                case 9:
                    adminLogado = loginAdmin.realizarLogin(teclado, administrador);

                    if (adminLogado) {
                        painelAdmin.mostrarPainel(teclado, gerenciador);
                    }
                    break;

                case 0:
                    System.out.println("Obrigado por visitar o DEVBRODERS!");
                    break;

                default:
                    System.out.println("Opcao invalida! Tente novamente.");
                    break;
            }

        } while (opcao != 0);

        teclado.close();
    }
}
