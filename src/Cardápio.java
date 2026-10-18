
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
                    System.out.println("Origem: popular na culinária amazônica e em outras regiões brasileiras.");
                    System.out.println("Dificuldade: Muito fácil");
                    System.out.println("Tempo: aproximadamente 10 minutos.");

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
                                        1. Descasque as bananas;
                                        2. Corte-as ao meio ou em fatias;
                                        3. Aqueça o óleo em uma frigideira;
                                        4. Frite até dourarem dos dois lados;
                                        5. Retire e coloque sobre papel-toalha.
                                            """);
                    break;

                case 2:
                    System.out.println("Você selecionou a receita de Beiju de tapioca.");
                    System.out.println("Origem: tradição indígena muito presente na Região Norte.");
                    System.out.println("Dificuldade: Muito fácil");
                    System.out.println("Tempo: aproximadamente 10 minutos.");

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
                                        1. Aqueça uma frigideira antiaderente;
                                        2. Espalhe a goma de tapioca, formando uma camada fina;
                                        3. Espere os grãos se unirem;
                                        4. Vire, se necessário, e termine de cozinhar;
                                        5. Recheie ou sirva simples.
                                                """);                            
                    break;      


                case 3:
                    System.out.println("Você selecionou a receita de Mingau de tapioca.");
                    System.out.println("Origem: presente na culinária amazônica.");
                    System.out.println("Dificuldade: Fácil");
                    System.out.println("Tempo: aproximadamente 20 minutos.");

                    System.out.println("=============");
                    System.out.println("Ingredientes:");
                    System.out.println("============="); 


                    System.out.println("=========================================");
                    System.out.println("• 500 ml de leite");
                    System.out.println("• 4 colheres de sopa de tapioca granulada");
                    System.out.println("• 2 colheres de sopa de açúcar");
                    System.out.println("• Canela a gosto");
                    System.out.println("=========================================");

                    
                    System.out.println("================");
                    System.out.println("Modo de preparo:");
                    System.out.println("================");


                    System.out.println("""
                                        1. Aqueça o leite em uma panela.
                                        2. Acrescente a tapioca e o açúcar.
                                        3. Mexa em fogo baixo até engrossar, seguindo o tempo indicado na embalagem da tapioca.
                                        4. Desligue o fogo.
                                        5. Finalize com canela.
                                                """);                            
                    break;

                case 4:
                    System.out.println("Você selecionou a receita de Bolo de macaxeira.");
                    System.out.println("Origem: tradicional na Região Norte e em outras regiões do Brasil.");
                    System.out.println("Dificuldade: Fácil");
                    System.out.println("Tempo: aproximadamente 60 minutos.");
                    
                    


                    System.out.println("=============");
                    System.out.println("Ingredientes:");
                    System.out.println("=============");
                    
                    
                    System.out.println("==================================");
                    System.out.println("• 500 g de macaxeira crua ralada");
                    System.out.println("• 2 ovos");
                    System.out.println("• 1 xícara de açúcar");
                    System.out.println("• 200 ml de leite de coco");
                    System.out.println("• 2 colheres de sopa de manteiga");
                    System.out.println("==================================");


                    System.out.println("================");
                    System.out.println("Modo de preparo:");
                    System.out.println("================");

                    
                    System.out.println("""
                                        1. Misture os ovos, o açúcar e a manteiga.
                                        2. Acrescente a macaxeira ralada e o leite de coco.
                                        3. Misture até obter uma massa uniforme.
                                        4. Despeje em uma forma untada.
                                        5. Asse em forno preaquecido a 180 °C por aproximadamente 40 a 50 minutos, até dourar e ficar firme.
                                                """);
                    break;

                case 5:
                    System.out.println("Você selecionou a receita de Macaxeira cozida.");
                    System.out.println("Origem: muito consumida na Região Norte.");
                    System.out.println("Dificuldade: fácil.");
                    System.out.println("Tempo: aproximadamente 30 a 45 minutos, podendo variar.");


                    System.out.println("=============");
                    System.out.println("Ingredientes:");
                    System.out.println("=============");


                    System.out.println("==========================================");
                    System.out.println("• 500 g de macaxeira (mandioca) descascada");
                    System.out.println("• Água suficiente para cozinhar");
                    System.out.println("• Sal a gosto");
                    System.out.println("• Manteiga, opcional");   
                    System.out.println("==========================================");


                    System.out.println("================");
                    System.out.println("Modo de preparo:");
                    System.out.println("================");

                    System.out.println("""
                                        1. Corte a macaxeira em pedaços.
                                        2. Coloque em uma panela com água e sal.
                                        3. Cozinhe até ficar macia.
                                        4. Escorra a água.
                                        5. Sirva quente, com manteiga se desejar.
                                                """);

                    System.out.println("OBS: utilize macaxeira própria para consumo e cozinhe completamente antes de comer.");
                    break;

                case 6:
                    System.out.println("Você selecionou a receita de Farofa de farinha de mandioca.");
                    System.out.println("Origem: acompanhamento comum na culinária amazônica e brasileira.");
                    System.out.println("Dificuldade: fácil");
                    System.out.println("Tempo: aproximadamente 10 minutos.");


                    
                    System.out.println("=============");
                    System.out.println("Ingredientes:");
                    System.out.println("=============");


                    System.out.println("===================================");
                    System.out.println("• 2 xícaras de farinha de mandioca");
                    System.out.println("• 2 colheres de sopa de manteiga");
                    System.out.println("• 1/2 cebola picada");
                    System.out.println("• Sal a gosto");
                    System.out.println("===================================");
                

                    System.out.println("================");
                    System.out.println("Modo de preparo:");
                    System.out.println("================");

                    System.out.println("""
                                        1. Derreta a manteiga em uma frigideira.
                                        2. Refogue a cebola até ficar macia.
                                        3. Acrescente a farinha de mandioca.
                                        4. Mexa em fogo baixo por alguns minutos.
                                        5. Tempere com sal e sirva.
                                                """);


                    break;

                case 7:
                    System.out.println("Você selecionou a receita de Açaí na tigela.");
                    System.out.println("Origem: tradicional do Pará e muito associado à cultura amazônica.");
                    System.out.println("Dificuldade: muito fácil.");
                    System.out.println("Tempo: aproximadamente 5 minutos.");


                                   
                    System.out.println("=============");
                    System.out.println("Ingredientes:");
                    System.out.println("=============");


                    System.out.println("===================================");
                    System.out.println("• 200 g de polpa de açaí congelada");
                    System.out.println("• 1 banana");
                    System.out.println("• Granola a gosto");
                    System.out.println("• Mel ou açúcar, opcional");
                    System.out.println("===================================");


                    System.out.println("================");
                    System.out.println("Modo de preparo:");
                    System.out.println("================");

                    System.out.println("""
                                        1. Deixe a polpa amolecer ligeiramente.
                                        2. Bata no liquidificador com a banana até ficar cremoso. Se necessário, acrescente um pouquinho de água.
                                        3. Coloque em uma tigela.
                                        4. Acrescente a granola e, se desejar, mel.                                        
                                                """);


                    System.out.println("================");
                    System.out.println("Curiosiedade: ");

                    System.out.println("no Pará, o açaí tradicionalmente pode ser consumido junto\n com peixe frito e farinha de mandioca, sem açúcar ou granola.");
                    
                    System.out.println("================");
                    break;

                    case 8:
                    System.out.println("Você selecionou a receita de Peixe frito.");
                    System.out.println("Origem: muito presente na alimentação de comunidades amazônicas e ribeirinhas.");
                    System.out.println("Dificuldade: fácil");
                    System.out.println("Tempo: aproximadamente 25 minutos");
                    

                    System.out.println("=============");
                    System.out.println("Ingredientes:");
                    System.out.println("=============");

                    System.out.println("• 500 g de filé de peixe");
                    System.out.println("• 2 dentes de alho amassados");
                    System.out.println("• Suco de 1/2 limão");
                    System.out.println("• Sal a gosto");
                    System.out.println("• Farinha de trigo ou fubá para empanar, opcional");
                    System.out.println("• Óleo para fritar");
                    
                    
                    System.out.println("================");
                    System.out.println("Modo de preparo:");
                    System.out.println("================");

                    System.out.println("""
                                        1. Tempere o peixe com alho, limão e sal.
                                        2. Deixe descansar por aproximadamente 10 minutos na geladeira.
                                        3. Se desejar, passe os filés na farinha.
                                        4. Aqueça o óleo e frite até dourar e cozinhar completamente por dentro.
                                        5. Retire e deixe escorrer o excesso de óleo.
                                                """);


                    
                    break;

                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;

                    default:
                    System.out.println("Opção inválida!");
                    break;
                    }
                    

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
                    System.out.println("Obrigado por visitar o web livro de receitas DEVBRODERS, até a próxima!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

        } while (opcao != 0);

        teclado.close();
    }
}