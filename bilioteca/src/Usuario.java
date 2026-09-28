import java.util.ArrayList;

public class Usuario {
    private String nome;
    private ArrayList<Livro> livrosAlugados;

    public Usuario(String nome) {
        this.nome = nome;
        this.livrosAlugados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Livro> getLivrosAlugados() {
        return livrosAlugados;
    }

    public void adicionarLivro(Livro livro) {
        livrosAlugados.add(livro);
    }

    public void removerLivro(Livro livro) {
        livrosAlugados.remove(livro);
    }

    public void exibir() {
        System.out.println(nome + " (livros alugados: " + livrosAlugados.size() + ")");
    }
}
