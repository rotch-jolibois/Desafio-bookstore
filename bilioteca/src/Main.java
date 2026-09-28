public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Usuario joao = biblioteca.cadastrarUsuario("João");
        Usuario maria = biblioteca.cadastrarUsuario("Maria");


        Livro rotchild= biblioteca.cadastrarLivro("sei la");
        Livro kauan = biblioteca.cadastrarLivro("sei la 2");

        biblioteca.listarUsuarios();
        biblioteca.listarLivros();

        System.out.println();
        biblioteca.alugarLivro(joao, rotchild);
        biblioteca.alugarLivro(maria, rotchild);

        biblioteca.alugarLivro(maria, kauan);

        System.out.println();
        biblioteca.consultarDisponibilidade(kauan);
        biblioteca.consultarDisponibilidade(rotchild);

        System.out.println();
        biblioteca.listarLivrosDoUsuario(joao);
        biblioteca.listarLivrosDoUsuario(maria);

        System.out.println();
        biblioteca.devolverLivro(joao, rotchild);
        biblioteca.alugarLivro(maria, rotchild);

        System.out.println();
        biblioteca.listarLivros();
        biblioteca.listarLivrosDoUsuario(maria);
    }
}
