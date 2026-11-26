# DEVBRODERS – Livro de Receitas do Brasil

## Sobre o projeto

O Livro de Receitas devbroders é um projeto desenvolvido em Java para a disciplina de Algoritmos e Programação.

A ideia do projeto é reunir receitas de diferentes regiões do Brasil em um só lugar, facilitando a consulta e a busca por pratos da culinária brasileira.

## Integrantes

- João Vitor
- Alex
- Davi Nogueira
- Luis Felipe

## Funcionalidades

O sistema conta com as seguintes opções:

- Consultar receitas das cinco regiões do Brasil.
- Ver os ingredientes e o modo de preparo das receitas.
- Consultar receitas rápidas.
- Buscar receitas pelo nome.
- Filtrar receitas por categoria, usando oito opções padronizadas: Café da manhã, Almoço, Jantar, Lanche, Sobremesa, Bebidas, Acompanhamentos e Petiscos.
- Acessar vídeos e filmes.
- Criar uma conta e fazer login.
- Adicionar e remover receitas dos favoritos.
- Enviar receitas para avaliação, selecionando uma categoria e informando o tempo de preparo (por exemplo: "30 minutos" ou "1 hora e 20 minutos").
- Visualizar receitas pendentes, aprovar ou rejeitar envios, consultar receitas aprovadas, editar e excluir receitas.

## Perfis de acesso

O sistema possui três tipos de acesso:

**Visitante**
- Pode consultar receitas, vídeos e filmes.
- Pode pesquisar receitas e filtrar por categoria.
- Não pode utilizar os favoritos nem enviar receitas.

**Usuário**
- Pode acessar as funcionalidades do visitante.
- Pode adicionar e remover receitas dos favoritos.
- Pode enviar receitas para aprovação.

**Administrador**
- Pode visualizar receitas enviadas pelos usuários.
- Pode aprovar ou rejeitar receitas.
- Pode editar e excluir receitas enviadas pelos usuários.

## Regras do sistema

- Não é permitido realizar cadastro com campos vazios.
- O e-mail informado precisa ter um formato válido.
- O visitante pode consultar o conteúdo sem fazer login.
- Somente usuários logados podem utilizar os favoritos.
- Somente usuários logados podem enviar receitas.
- As receitas enviadas precisam ser aprovadas pelo administrador antes de aparecerem no catálogo.
- Apenas o administrador pode aprovar, rejeitar, editar e excluir receitas enviadas pelos usuários.

## Tecnologias utilizadas

- Java
- Visual Studio Code
- Git
- GitHub
- Arquivos de texto para salvar os dados.

## Como executar o projeto

**Requisitos:**
- Ter o Java JDK instalado.
- Ter o projeto baixado no computador.

Abra o terminal na pasta principal do projeto.

**1. Para compilar, execute:**

```bash
javac -encoding UTF-8 -d bin src\*.java
```

**2. Para iniciar o programa, execute:**

```bash
java -cp bin App
```

## Organização do projeto

O código foi dividido em classes para separar as funcionalidades.

- `App.java` – inicia o programa e apresenta o menu principal.
- `Receita.java` – contém os dados das receitas.
- `Regiao.java` – representa as regiões brasileiras.
- `Categoria.java` – representa as categorias.
- `Cardapio.java` – apresenta os cardápios, buscas e filtros.
- `Usuario.java` – contém os dados dos usuários.
- `Cadastro.java` – realiza o cadastro de usuários.
- `Login.java` – realiza o login dos usuários.
- `Favoritos.java` – controla as receitas favoritas.
- `GerenciadorReceitas.java` – gerencia as receitas enviadas.
- `Administrador.java` – contém os dados do administrador.
- `CadastroAdministrador.java` – realiza o cadastro administrativo.
- `LoginAdministrador.java` – realiza o login administrativo.
- `PainelAdministrador.java` – apresenta as opções do administrador.
- `ArquivoTexto.java` – realiza a leitura e gravação de arquivos.
- `Videos.java` – responsável pela parte de vídeos.
- `Filmes.java` – responsável pela parte de filmes.

## Arquivos de armazenamento

O projeto utiliza arquivos de texto para guardar os dados:

- `usuarios.txt`
- `administradores.txt`
- `receitas.txt`
- `favoritos.txt`

Dessa forma, as informações podem continuar disponíveis mesmo depois que o programa for fechado.

---

**Projeto A3 – Algoritmos e Programação – Java**

**Equipe DEVBRODERS – 2026.2**