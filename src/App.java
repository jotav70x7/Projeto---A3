import java.util.ArrayList;
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

        ArrayList<Usuario> usuarios = cadastro.carregarUsuarios();
        Usuario usuarioLogado = null;
        Administrador administrador = cadastroAdmin.carregarAdministrador();
        boolean adminLogado = false;

        int opcao = -1;

        do {
            if (usuarioLogado != null) {
                // MENU DO USUARIO
                System.out.println("\n===== DEVBRODERS - LIVRO DE RECEITAS =====");
                System.out.println("Acesso atual: USUARIO");
                System.out.println("Conta: " + usuarioLogado.getEmail());
                System.out.println("1 - Cardapios regionais");
                System.out.println("2 - Videos de culinaria");
                System.out.println("3 - Filmes para inspirar");
                System.out.println("4 - Meus favoritos");
                System.out.println("5 - Enviar receita");
                System.out.println("6 - Sair da conta");
                System.out.println("0 - Sair do programa");

            } else if (adminLogado) {
                // MENU DO ADMINISTRADOR
                System.out.println("\n===== DEVBRODERS - LIVRO DE RECEITAS =====");
                System.out.println("Acesso atual: ADMINISTRADOR");
                System.out.println("Conta: " + administrador.getEmail());
                System.out.println("1 - Painel administrativo");
                System.out.println("2 - Cardapios regionais");
                System.out.println("3 - Videos de culinaria");
                System.out.println("4 - Filmes para inspirar");
                System.out.println("5 - Sair da conta");
                System.out.println("0 - Sair do programa");

            } else {
                // MENU DO VISITANTE
                System.out.println("\n===== DEVBRODERS - LIVRO DE RECEITAS =====");
                System.out.println("Acesso atual: VISITANTE (sem login)");
                System.out.println("1 - Cardapios regionais");
                System.out.println("2 - Videos de culinaria");
                System.out.println("3 - Filmes para inspirar");
                System.out.println("4 - Cadastro de usuario");
                System.out.println("5 - Login de usuario");
                System.out.println("6 - Cadastro de administrador");
                System.out.println("7 - Login de administrador");
                System.out.println("0 - Sair do programa");
            }

            System.out.print("Escolha uma opcao: ");
            opcao = Entrada.lerInteiro(teclado);

            if (usuarioLogado != null) {
                switch (opcao) {
                    case 1:
                        cardapio.mostrarMenu(teclado, favoritos, usuarioLogado, gerenciador);
                        break;
                    case 2:
                        videos.mostrarVideos(teclado);
                        break;
                    case 3:
                        filmes.mostrarFilmes(teclado);
                        break;
                    case 4:
                        System.out.println("\n===== MEUS FAVORITOS =====");
                        System.out.println("1 - Visualizar favoritos");
                        System.out.println("2 - Remover favorito");
                        System.out.println("0 - Voltar");
                        System.out.print("Escolha uma opcao: ");
                        int opcaoFavoritos = Entrada.lerInteiro(teclado);

                        if (opcaoFavoritos == 1) {
                            favoritos.mostrarFavoritos(usuarioLogado.getEmail());
                        } else if (opcaoFavoritos == 2) {
                            favoritos.removerFavorito(teclado, usuarioLogado.getEmail());
                        } else if (opcaoFavoritos == 0) {
                            System.out.println("Voltando ao menu do usuario!");
                        } else {
                            System.out.println("Opcao invalida!");
                        }
                        break;
                    case 5:
                        gerenciador.enviarReceita(teclado, usuarioLogado);
                        break;
                    case 6:
                        System.out.println("Conta desconectada: " + usuarioLogado.getNome());
                        usuarioLogado = null;
                        break;
                    case 0:
                        System.out.println("Obrigado por visitar o DEVBRODERS!");
                        break;
                    default:
                        System.out.println("Opcao invalida!");
                        break;
                }

            } else if (adminLogado) {
                switch (opcao) {
                    case 1:
                        painelAdmin.mostrarPainel(teclado, gerenciador, favoritos);
                        break;
                    case 2:
                        cardapio.mostrarMenu(teclado, favoritos, null, gerenciador);
                        break;
                    case 3:
                        videos.mostrarVideos(teclado);
                        break;
                    case 4:
                        filmes.mostrarFilmes(teclado);
                        break;
                    case 5:
                        System.out.println("Conta de administrador desconectada.");
                        adminLogado = false;
                        break;
                    case 0:
                        System.out.println("Obrigado por visitar o DEVBRODERS!");
                        break;
                    default:
                        System.out.println("Opcao invalida!");
                        break;
                }

            } else {
                switch (opcao) {
                    case 1:
                        cardapio.mostrarMenu(teclado, favoritos, null, gerenciador);
                        break;
                    case 2:
                        videos.mostrarVideos(teclado);
                        break;
                    case 3:
                        filmes.mostrarFilmes(teclado);
                        break;
                    case 4:
                        Usuario novoUsuario = cadastro.realizarCadastro(teclado);
                        if (novoUsuario != null) {
                            usuarios = cadastro.carregarUsuarios();
                        }
                        break;
                    case 5:
                        Usuario usuarioEncontrado = login.realizarLogin(teclado, usuarios);
                        if (usuarioEncontrado != null) {
                            usuarioLogado = usuarioEncontrado;
                        }
                        break;
                    case 6:
                        if (administrador == null) {
                            administrador = cadastroAdmin.realizarCadastro(teclado);
                        } else {
                            System.out.println("Ja existe um administrador cadastrado!");
                        }
                        break;
                    case 7:
                        if (loginAdmin.realizarLogin(teclado, administrador)) {
                            adminLogado = true;
                        }
                        break;
                    case 0:
                        System.out.println("Obrigado por visitar o DEVBRODERS!");
                        break;
                    default:
                        System.out.println("Opcao invalida!");
                        break;
                }
            }

        } while (opcao != 0);

        teclado.close();
    }
}
