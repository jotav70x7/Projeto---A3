
import java.util.Scanner;

public class Cardápio {

    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        int opcao;

        // Cabeçalho do cardápio
        do {
            System.out.println("==== Bem vindo ao livro de receitas DEVBRODERS ====");
            System.out.println("Que tipo de receita regional deseja ver?");
            System.out.println("1 - Norte");
            System.out.println("2 - Nordeste");
            System.out.println("3 - Sudeste");
            System.out.println("4 - Sul");
            System.out.println("5 - Receitas rápidas");
            System.out.println("0 - Sair");
            System.out.println("Por favor, selecione uma das opções acima.");

            opcao = teclado.nextInt();

            // Estrutura de decisão para selecionar a região
            switch (opcao) {

                case 1:
                    System.out.println("Você selecionou a região Norte, aqui estão algumas receitas típicas:");
                    System.out.println("1 - Banana frita");
                    System.out.println("2 - Beiju de tapioca");
                    System.out.println("3 - Mingau de tapioca");
                    System.out.println("4 - Bolo de macaxeira");
                    System.out.println("5 - Macaxeira cozida");
                    System.out.println("6 - Farofa de farinha de mandioca");
                    System.out.println("7 - Açaí na tigela");
                    System.out.println("8 - Peixe frito");
                    System.out.println("0 - Voltar");

                    int pratosdonorte = teclado.nextInt();

                    switch (pratosdonorte) {

                        case 1:
                            System.out.println("Você selecionou a receita de Banana frita.");

                            System.out.println("=============");
                            System.out.println("Ingredientes:");
                            System.out.println("=============");
                           

                            System.out.println("===============================");
                            System.out.println("• 2 bananas maduras, mas firmes");
                            System.out.println("• Óleo para fritar");
                            System.out.println("===============================");
                            

                            System.out.println("================");
                            System.out.println("Modo de preparo:");
                            System.out.println("================");
                           

                            System.out.println("""
                                                 Descasque as bananas;
                                                 Corte-as ao meio ou em fatias;
                                                 Aqueça o óleo em uma frigideira;
                                                 Frite até dourarem dos dois lados;
                                                 Retire e coloque sobre papel-toalha.
                                                 """);
                            break;

                        case 2:
                            System.out.println("Você selecionou a receita de Beiju de tapioca.");

                            System.out.println("=============");
                            System.out.println("Ingredientes:");
                            System.out.println("=============");                        


                            System.out.println("==================================================");
                            System.out.println("• 4 colheres de sopa de goma de tapioca hidratada.");
                            System.out.println("• Uma pitada de sal, se desejar.");
                            System.out.println("• Manteiga ou coco ralado, opcional.");
                            System.out.println("==================================================");
                            

                            System.out.println("================");
                            System.out.println("Modo de preparo:");
                            System.out.println("================");


                            System.out.println("""
                                                Aqueça uma frigideira antiaderente;
                                                Espalhe a goma de tapioca, formando uma camada fina;
                                                Espere os grãos se unirem;
                                                Vire, se necessário, e termine de cozinhar;
                                                Recheie ou sirva simples.
                                                """);
                            
                            break;

                        case 3:
                            System.out.println("Você selecionou a receita de Mingau de tapioca.");
                            break;

                        case 4:
                            System.out.println("Você selecionou a receita de Bolo de macaxeira.");
                            break;

                        case 5:
                            System.out.println("Você selecionou a receita de Macaxeira cozida.");
                            break;

                        case 6:
                            System.out.println("Você selecionou a receita de Farofa de farinha de mandioca.");
                            break;

                        case 7:
                            System.out.println("Você selecionou a receita de Açaí na tigela.");
                            break;

                        case 8:
                            System.out.println("Você selecionou a receita de Peixe frito.");
                            break;

                        case 0:
                            System.out.println("Voltando ao menu principal...");
                            break;

                        default:
                            System.out.println("Opção inválida!");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("Você selecionou a região Nordeste.");
                    break;

                case 3:
                    System.out.println("Você selecionou a região Sudeste.");
                    break;

                case 4:
                    System.out.println("Você selecionou a região Sul.");
                    break;

                case 5:
                    System.out.println("Você selecionou Receitas rápidas.");
                    break;

                case 0:
                    System.out.println("Obrigado por utilizar o livro de receitas DEVBRODERS, até a próxima!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

        } while (opcao != 0);

        teclado.close();
    }
}