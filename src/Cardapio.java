import java.util.Scanner;

public class Cardapio {

    // Receitas originais da equipe

    private Receita[] receitasNorte = {

        new Receita("Banana frita", new Regiao("Norte"), new Categoria("Lanche"),
                "Popular na culinaria amazonica e em outras regioes brasileiras.",
                "Muito facil", "Aproximadamente 10 minutos",
                "- 2 bananas maduras, mas firmes\n- Oleo para fritar",
                "1. Descasque as bananas.\n2. Corte ao meio ou em fatias.\n3. Aqueca o oleo em uma frigideira.\n4. Frite ate dourar dos dois lados.\n5. Retire e coloque sobre papel-toalha.", ""),

        new Receita("Beiju de tapioca", new Regiao("Norte"), new Categoria("Café da manhã"),
                "Tradicao indigena muito presente na Regiao Norte.",
                "Muito facil", "Aproximadamente 10 minutos",
                "- 4 colheres de sopa de goma de tapioca hidratada\n- Uma pitada de sal, se desejar\n- Manteiga ou coco ralado, opcional",
                "1. Aqueca uma frigideira antiaderente.\n2. Espalhe a goma de tapioca, formando uma camada fina.\n3. Espere os graos se unirem.\n4. Vire, se necessario, e termine de cozinhar.\n5. Recheie ou sirva simples.", ""),

        new Receita("Mingau de tapioca", new Regiao("Norte"), new Categoria("Sobremesa"),
                "Presente na culinaria amazonica.",
                "Facil", "Aproximadamente 20 minutos",
                "- 500 ml de leite\n- 4 colheres de sopa de tapioca granulada\n- 2 colheres de sopa de acucar\n- Canela a gosto",
                "1. Aqueca o leite em uma panela.\n2. Acrescente a tapioca e o acucar.\n3. Mexa em fogo baixo ate engrossar, seguindo o tempo indicado na embalagem da tapioca.\n4. Desligue o fogo.\n5. Finalize com canela.", ""),

        new Receita("Bolo de macaxeira", new Regiao("Norte"), new Categoria("Sobremesa"),
                "Tradicional na Regiao Norte e em outras regioes do Brasil.",
                "Facil", "Aproximadamente 60 minutos",
                "- 500 g de macaxeira crua ralada\n- 2 ovos\n- 1 xicara de acucar\n- 200 ml de leite de coco\n- 2 colheres de sopa de manteiga",
                "1. Misture os ovos, o acucar e a manteiga.\n2. Acrescente a macaxeira ralada e o leite de coco.\n3. Misture ate obter uma massa uniforme.\n4. Despeje em uma forma untada.\n5. Asse em forno preaquecido a 180 graus por aproximadamente 40 a 50 minutos, ate dourar e ficar firme.", ""),

        new Receita("Macaxeira cozida", new Regiao("Norte"), new Categoria("Acompanhamentos"),
                "Muito consumida na Regiao Norte.",
                "Facil", "De 30 a 45 minutos, podendo variar",
                "- 500 g de macaxeira descascada\n- Agua suficiente para cozinhar\n- Sal a gosto\n- Manteiga, opcional",
                "1. Corte a macaxeira em pedacos.\n2. Coloque em uma panela com agua e sal.\n3. Cozinhe ate ficar macia.\n4. Escorra a agua.\n5. Sirva quente, com manteiga se desejar.\nOBS: utilize macaxeira propria para consumo e cozinhe completamente antes de comer.", ""),

        new Receita("Farofa de farinha de mandioca", new Regiao("Norte"), new Categoria("Acompanhamentos"),
                "Acompanhamento comum na culinaria amazonica e brasileira.",
                "Facil", "Aproximadamente 10 minutos",
                "- 2 xicaras de farinha de mandioca\n- 2 colheres de sopa de manteiga\n- 1/2 cebola picada\n- Sal a gosto",
                "1. Derreta a manteiga em uma frigideira.\n2. Refogue a cebola ate ficar macia.\n3. Acrescente a farinha de mandioca.\n4. Mexa em fogo baixo por alguns minutos.\n5. Tempere com sal e sirva.", ""),

        new Receita("Acai na tigela", new Regiao("Norte"), new Categoria("Lanche"),
                "Tradicional do Para e muito associado a cultura amazonica.",
                "Muito facil", "Aproximadamente 5 minutos",
                "- 200 g de polpa de acai congelada \n - 1 banana\n- Granola a gosto \n - Mel ou acucar, opcional",
                "1. Deixe a polpa amolecer ligeiramente.\n2. Bata no liquidificador com a banana ate ficar cremoso. Se necessario, acrescente um pouco de agua.\n3. Coloque em uma tigela.\n4. Acrescente a granola e, se desejar, mel.",
                "No Para, o acai tradicionalmente pode ser consumido junto com peixe frito e farinha de mandioca, sem acucar ou granola."),

        new Receita("Peixe frito", new Regiao("Norte"), new Categoria("Almoço"),
                "Muito presente na alimentacao de comunidades amazonicas e ribeirinhas.",
                "Facil", "Aproximadamente 25 minutos",
                "- 500 g de file de peixe\n- 2 dentes de alho amassados\n- Suco de 1/2 limao\n- Sal a gosto\n- Farinha de trigo ou fuba para empanar, opcional\n- Oleo para fritar",
                "1. Tempere o peixe com alho, limao e sal.\n2. Deixe descansar por aproximadamente 10 minutos na geladeira.\n3. Se desejar, passe os files na farinha.\n4. Aqueca o oleo e frite ate dourar e cozinhar completamente por dentro.\n5. Retire e deixe escorrer o excesso de oleo.", "")
    };

    private Receita[] receitasNordeste = {

        new Receita("Cuscuz nordestino", new Regiao("Nordeste"), new Categoria("Café da manhã"),
                "Muito tradicional na culinaria nordestina.",
                "Facil", "Aproximadamente 15 minutos",
                "- Flocos de milho\n- Agua\n- Sal",
                "1. Misture os flocos de milho com agua e sal.\n2. Deixe descansar alguns minutos.\n3. Coloque na cuscuzeira.\n4. Cozinhe ate ficar macio.",
                "Pode ser servido com manteiga, queijo ou ovos."),

        new Receita("Baiao de dois", new Regiao("Nordeste"), new Categoria("Almoço"),
                "Prato muito conhecido no Ceara e em outros estados do Nordeste.",
                "Media", "Aproximadamente 40 minutos",
                "- Arroz\n- Feijao cozido\n- Cebola e alho\n- Queijo coalho",
                "1. Refogue a cebola e o alho.\n2. Acrescente o arroz e o feijao cozido.\n3. Misture e cozinhe ate os sabores se unirem.\n4. Finalize com queijo coalho.",
                "A receita possui varias versoes regionais."),

        new Receita("Tapioca", new Regiao("Nordeste"), new Categoria("Lanche"),
                "Muito popular em diferentes estados do Nordeste.",
                "Muito facil", "Aproximadamente 10 minutos",
                "- Goma de tapioca\n- Recheio a gosto",
                "1. Aqueça uma frigideira.\n2. Espalhe a goma.\n3. Espere unir.\n4. Acrescente o recheio e dobre.",
                "Pode receber recheios doces ou salgados.")
    };

    private Receita[] receitasSudeste = {

        new Receita("Pao de queijo", new Regiao("Sudeste"), new Categoria("Lanche"),
                "Tradicional de Minas Gerais.",
                "Facil", "Aproximadamente 30 minutos",
                "- Polvilho\n- Queijo ralado\n- Ovos\n- Leite e oleo",
                "1. Misture os ingredientes.\n2. Modele pequenas bolinhas.\n3. Coloque em uma forma.\n4. Asse ate crescer e dourar.",
                "E um dos alimentos mais conhecidos de Minas Gerais."),

        new Receita("Feijoada", new Regiao("Sudeste"), new Categoria("Almoço"),
                "Muito associada a culinaria do Rio de Janeiro.",
                "Media", "Aproximadamente 2 horas",
                "- Feijao preto\n- Carnes salgadas e defumadas\n- Alho e cebola\n- Louro",
                "1. Dessalgue as carnes conforme necessario.\n2. Cozinhe o feijao.\n3. Acrescente as carnes.\n4. Tempere com alho, cebola e louro.\n5. Cozinhe ate ficar macio.",
                "Costuma ser servida com arroz, couve e farofa."),

        new Receita("Moqueca capixaba", new Regiao("Sudeste"), new Categoria("Almoço"),
                "Prato tradicional do Espirito Santo.",
                "Media", "Aproximadamente 40 minutos",
                "- Peixe em postas\n- Tomate\n- Cebola\n- Coentro\n- Azeite e urucum",
                "1. Tempere o peixe.\n2. Monte camadas de tomate e cebola na panela.\n3. Acrescente o peixe e os temperos.\n4. Cozinhe ate o peixe ficar pronto.",
                "A versao capixaba tradicional nao leva leite de coco.")
    };

    private Receita[] receitasSul = {

        new Receita("Barreado", new Regiao("Sul"), new Categoria("Almoço"),
                "Prato tradicional do litoral do Parana.",
                "Media", "Varias horas",
                "- Carne bovina\n- Cebola e alho\n- Cominho\n- Louro\n- Farinha de mandioca",
                "1. Tempere a carne.\n2. Coloque em uma panela com os temperos.\n3. Cozinhe lentamente ate a carne desmanchar.\n4. Sirva com farinha e acompanhamentos.",
                "O preparo tradicional e conhecido pelo cozimento longo."),

        new Receita("Churrasco", new Regiao("Sul"), new Categoria("Almoço"),
                "Muito associado a cultura gaucha.",
                "Facil", "Varia conforme a carne",
                "- Carne de sua preferencia\n- Sal grosso",
                "1. Prepare a churrasqueira.\n2. Tempere a carne com sal grosso.\n3. Coloque na grelha.\n4. Asse ate atingir o ponto desejado.",
                "O churrasco e uma tradicao importante no Rio Grande do Sul."),

        new Receita("Cuca", new Regiao("Sul"), new Categoria("Sobremesa"),
                "Receita de influencia alema muito presente no Sul.",
                "Media", "Aproximadamente 1 hora",
                "- Farinha de trigo\n- Acucar\n- Ovos\n- Leite\n- Fermento\n- Farofa doce",
                "1. Prepare uma massa com os ingredientes.\n2. Coloque em uma forma.\n3. Acrescente a farofa doce por cima.\n4. Asse ate dourar.",
                "Pode receber cobertura de frutas, como banana.")
    };

    private Receita[] receitasCentroOeste = {

        new Receita("Arroz com pequi", new Regiao("Centro-Oeste"), new Categoria("Almoço"),
                "Muito conhecido na culinaria goiana.",
                "Facil", "Aproximadamente 40 minutos",
                "- Arroz\n- Pequi\n- Alho e cebola\n- Oleo e sal",
                "1. Refogue alho e cebola.\n2. Acrescente o pequi.\n3. Adicione o arroz e a agua.\n4. Cozinhe ate o arroz ficar macio.\n5. Tenha cuidado com o caroço do pequi.",
                "O caroço do pequi nao deve ser mordido por causa dos espinhos."),

        new Receita("Galinhada", new Regiao("Centro-Oeste"), new Categoria("Almoço"),
                "Prato presente em diferentes estados do Centro-Oeste.",
                "Media", "Aproximadamente 50 minutos",
                "- Frango em pedacos\n- Arroz\n- Alho e cebola\n- Tomate\n- Cheiro-verde",
                "1. Tempere o frango.\n2. Doure os pedacos em uma panela.\n3. Acrescente alho, cebola e tomate.\n4. Coloque o arroz e agua.\n5. Cozinhe ate ficar pronto.",
                "E uma refeicao preparada em uma unica panela."),

        new Receita("Empadao goiano", new Regiao("Centro-Oeste"), new Categoria("Almoço"),
                "Prato tradicional do estado de Goias.",
                "Media", "Aproximadamente 1 hora",
                "- Massa de empadao\n- Frango desfiado\n- Queijo\n- Guariroba, opcional\n- Molho de tomate",
                "1. Prepare a massa.\n2. Misture os ingredientes do recheio.\n3. Forre uma forma com parte da massa.\n4. Coloque o recheio e cubra.\n5. Asse ate dourar.",
                "O recheio pode variar de acordo com a cidade e a familia.")
    };

    // Menu principal do cardapio

    public void mostrarMenu(Scanner teclado, Favoritos favoritos,
                           Usuario usuarioLogado, GerenciadorReceitas gerenciador) {

        int opcao;

        do {
            System.out.println("\n===== CARDAPIOS REGIONAIS =====");
            System.out.println("1 - Norte");
            System.out.println("2 - Nordeste");
            System.out.println("3 - Sudeste");
            System.out.println("4 - Sul");
            System.out.println("5 - Centro-Oeste");
            System.out.println("6 - Receitas rapidas");
            System.out.println("7 - Buscar receita pelo nome");
            System.out.println("8 - Filtrar receitas por categoria");
            System.out.println("0 - Voltar ao menu principal");
            System.out.print("Escolha uma regiao: ");

            opcao = Entrada.lerInteiro(teclado);

            // Busca as receitas aprovadas pelo administrador
            Receita[] aprovadas = gerenciador.getReceitasAprovadas();

            switch (opcao) {

                case 1:
                    mostrarReceitas(teclado,
                            combinarReceitas(receitasNorte, aprovadas, "Norte"),
                            "Norte", favoritos, usuarioLogado);
                    break;

                case 2:
                    mostrarReceitas(teclado,
                            combinarReceitas(receitasNordeste, aprovadas, "Nordeste"),
                            "Nordeste", favoritos, usuarioLogado);
                    break;

                case 3:
                    mostrarReceitas(teclado,
                            combinarReceitas(receitasSudeste, aprovadas, "Sudeste"),
                            "Sudeste", favoritos, usuarioLogado);
                    break;

                case 4:
                    mostrarReceitas(teclado,
                            combinarReceitas(receitasSul, aprovadas, "Sul"),
                            "Sul", favoritos, usuarioLogado);
                    break;

                case 5:
                    mostrarReceitas(teclado,
                            combinarReceitas(receitasCentroOeste, aprovadas, "Centro-Oeste"),
                            "Centro-Oeste", favoritos, usuarioLogado);
                    break;

                case 6:
                    mostrarReceitasRapidas(teclado, favoritos, usuarioLogado);
                    break;

                case 7:
                    buscarReceita(teclado, favoritos, usuarioLogado, aprovadas);
                    break;

                case 8:
                    filtrarPorCategoria(teclado, favoritos, usuarioLogado, aprovadas);
                    break;

                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;

                default:
                    System.out.println("Regiao invalida!");
                    break;
            }

        } while (opcao != 0);
    }

    // Junta as receitas originais com as receitas aprovadas da regiao escolhida

    private Receita[] combinarReceitas(Receita[] originais,
                                       Receita[] aprovadas, String nomeRegiao) {

        int quantidadeAprovadas = 0;

        for (int i = 0; i < aprovadas.length; i++) {
            if (aprovadas[i].getRegiao().getNome().equalsIgnoreCase(nomeRegiao)) {
                quantidadeAprovadas++;
            }
        }

        Receita[] receitasCombinadas =
                new Receita[originais.length + quantidadeAprovadas];

        int posicao = 0;

        for (int i = 0; i < originais.length; i++) {
            receitasCombinadas[posicao] = originais[i];
            posicao++;
        }

        for (int i = 0; i < aprovadas.length; i++) {
            if (aprovadas[i].getRegiao().getNome().equalsIgnoreCase(nomeRegiao)) {
                receitasCombinadas[posicao] = aprovadas[i];
                posicao++;
            }
        }

        return receitasCombinadas;
    }

    // Exibe as receitas de uma regiao

    private void mostrarReceitas(Scanner teclado, Receita[] receitas,
                                 String nomeRegiao, Favoritos favoritos,
                                 Usuario usuarioLogado) {

        int opcao;

        do {
            System.out.println("\n===== RECEITAS DA REGIAO " + nomeRegiao.toUpperCase() + " =====");

            for (int i = 0; i < receitas.length; i++) {
                System.out.println((i + 1) + " - " + receitas[i].getNome());
            }

            System.out.println("0 - Voltar");
            System.out.print("Escolha uma receita: ");

            opcao = Entrada.lerInteiro(teclado);

            if (opcao >= 1 && opcao <= receitas.length) {

                receitas[opcao - 1].mostrarReceita();

                if (usuarioLogado != null) {

                    System.out.println("\n1 - Adicionar aos favoritos");
                    System.out.println("0 - Continuar");
                    System.out.print("Escolha uma opcao: ");

                    int escolha = Entrada.lerInteiro(teclado);

                    if (escolha == 1) {
                        favoritos.adicionarFavorito(
                                receitas[opcao - 1], usuarioLogado.getEmail());
                    }
                }

                int continuar;

                do {
                    System.out.println("\nDeseja visualizar outra receita?");
                    System.out.println("1 - Sim");
                    System.out.println("0 - Voltar ao menu anterior");
                    System.out.print("Escolha uma opcao: ");

                    continuar = Entrada.lerInteiro(teclado);

                    if (continuar != 1 && continuar != 0) {
                        System.out.println("Opcao invalida! Digite 1 ou 0.");
                    }

                } while (continuar != 1 && continuar != 0);

                if (continuar == 0) {
                    opcao = 0;
                }

            } else if (opcao == 0) {
                System.out.println("Voltando ao menu de regioes...");

            } else {
                System.out.println("Receita invalida!");
            }

        } while (opcao != 0);
    }

    // Reune as receitas originais e as receitas aprovadas pelo administrador

    private Receita[] obterTodasReceitas(Receita[] aprovadas) {

        int total = receitasNorte.length + receitasNordeste.length
                + receitasSudeste.length + receitasSul.length
                + receitasCentroOeste.length + aprovadas.length;

        Receita[] todas = new Receita[total];
        int posicao = 0;

        for (int i = 0; i < receitasNorte.length; i++) {
            todas[posicao] = receitasNorte[i];
            posicao++;
        }

        for (int i = 0; i < receitasNordeste.length; i++) {
            todas[posicao] = receitasNordeste[i];
            posicao++;
        }

        for (int i = 0; i < receitasSudeste.length; i++) {
            todas[posicao] = receitasSudeste[i];
            posicao++;
        }

        for (int i = 0; i < receitasSul.length; i++) {
            todas[posicao] = receitasSul[i];
            posicao++;
        }

        for (int i = 0; i < receitasCentroOeste.length; i++) {
            todas[posicao] = receitasCentroOeste[i];
            posicao++;
        }

        for (int i = 0; i < aprovadas.length; i++) {
            todas[posicao] = aprovadas[i];
            posicao++;
        }

        return todas;
    }

    // Busca receitas pelo nome, aceitando parte do nome

    private void buscarReceita(Scanner teclado, Favoritos favoritos,
                               Usuario usuarioLogado, Receita[] aprovadas) {

        System.out.print("Digite o nome ou parte do nome da receita: ");
        String nomeBusca = teclado.nextLine().trim();

        if (nomeBusca.equals("")) {
            System.out.println("Digite um nome para realizar a busca!");
            return;
        }

        Receita[] todas = obterTodasReceitas(aprovadas);
        Receita[] encontradas = new Receita[todas.length];
        int quantidade = 0;

        for (int i = 0; i < todas.length; i++) {
            if (todas[i].getNome().toLowerCase().contains(nomeBusca.toLowerCase())) {
                encontradas[quantidade] = todas[i];
                quantidade++;
            }
        }

        if (quantidade == 0) {
            System.out.println("Nenhuma receita encontrada com esse nome.");
        } else {
            Receita[] resultado = new Receita[quantidade];

            for (int i = 0; i < quantidade; i++) {
                resultado[i] = encontradas[i];
            }

            mostrarReceitas(teclado, resultado, "Resultado da busca",
                    favoritos, usuarioLogado);
        }
    }

    // Filtra receitas usando o nome da categoria

    private void filtrarPorCategoria(Scanner teclado, Favoritos favoritos,
                                     Usuario usuarioLogado, Receita[] aprovadas) {

        Categoria categoriaSelecionada = Categoria.selecionarCategoria(teclado);
        String categoriaBusca = categoriaSelecionada.getNome();

        Receita[] todas = obterTodasReceitas(aprovadas);
        Receita[] encontradas = new Receita[todas.length];
        int quantidade = 0;

        for (int i = 0; i < todas.length; i++) {
            if (todas[i].getCategoria().getNome().equalsIgnoreCase(categoriaBusca)) {
                encontradas[quantidade] = todas[i];
                quantidade++;
            }
        }

        if (quantidade == 0) {
            System.out.println("Nenhuma receita encontrada nessa categoria.");
        } else {
            Receita[] resultado = new Receita[quantidade];

            for (int i = 0; i < quantidade; i++) {
                resultado[i] = encontradas[i];
            }

            mostrarReceitas(teclado, resultado, "Categoria: " + categoriaBusca,
                    favoritos, usuarioLogado);
        }
    }

    // Receitas rapidas originais

    private void mostrarReceitasRapidas(Scanner teclado,
                                        Favoritos favoritos, Usuario usuarioLogado) {

        Receita[] receitasRapidas = {
            receitasNorte[0],
            receitasNorte[1],
            receitasNorte[6]
        };

        mostrarReceitas(teclado, receitasRapidas,
                "Receitas rapidas", favoritos, usuarioLogado);
    }
}