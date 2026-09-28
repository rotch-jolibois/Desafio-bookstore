import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Usuario> usuarios;
    private ArrayList<Livro> livros;

    public Biblioteca() {
        usuarios = new ArrayList<>();
        livros = new ArrayList<>();
    }

    public Usuario cadastrarUsuario(String nome) {
        Usuario usuario = new Usuario(nome);
        usuarios.add(usuario);
        return usuario;
    }

    public Livro cadastrarLivro(String titulo) {
        Livro livro = new Livro(titulo);
        livros.add(livro);
        return livro;
    }

    public void listarUsuarios() {
        System.out.println("--- Usuários ---");
        for (Usuario u : usuarios) {
            u.exibir();
        }
    }

    public void listarLivros() {
        System.out.println("--- Livros ---");
        for (Livro l : livros) {
            l.exibir();
        }
    }
    public void alugarLivro(Usuario usuario, Livro livro) {
        if (livro.isDisponivel()) {
            livro.alugar(usuario);
            usuario.adicionarLivro(livro);
            System.out.println(usuario.getNome() + " alugou \"" + livro.getTitulo() + "\".");
        } else {
            System.out.println("O livro \"" + livro.getTitulo() + "\" não está disponível. "
                    + "Já está alugado para " + livro.getAlugadoPara().getNome() + ".");
        }
    }

    public void devolverLivro(Usuario usuario, Livro livro) {
        if (usuario.getLivrosAlugados().contains(livro)) {
            livro.devolver();
            usuario.removerLivro(livro);
            System.out.println(usuario.getNome() + " devolveu \"" + livro.getTitulo() + "\".");
        } else {
            System.out.println(usuario.getNome() + " não está com o livro \"" + livro.getTitulo() + "\".");
        }
    }

    public void consultarDisponibilidade(Livro livro) {
        if (livro.isDisponivel()) {
            System.out.println("\"" + livro.getTitulo() + "\" está disponível.");
        } else {
            System.out.println("\"" + livro.getTitulo() + "\" NÃO está disponível.");
        }
    }

    public void listarLivrosDoUsuario(Usuario usuario) {
        System.out.println("--- Livros alugados por " + usuario.getNome() + " ---");
        if (usuario.getLivrosAlugados().size() == 0) {
            System.out.println("Nenhum livro alugado.");
        } else {
            for (Livro l : usuario.getLivrosAlugados()) {
                System.out.println(l.getTitulo());
            }
        }
    }
}
