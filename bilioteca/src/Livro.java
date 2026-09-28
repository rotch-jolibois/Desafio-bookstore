public class Livro {
    private String titulo;
    private boolean disponivel;
    private Usuario alugadoPara;

    public Livro(String titulo) {
        this.titulo = titulo;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public Usuario getAlugadoPara() {
        return alugadoPara;
    }

    public void alugar(Usuario usuario) {
        this.disponivel = false;
        this.alugadoPara = usuario;
    }

    public void devolver() {
        this.disponivel = true;
    }

    public void exibir() {
        if (disponivel) {
            System.out.println(titulo + " - Disponível");
        } else {
            System.out.println(titulo + " - Alugado para " + alugadoPara.getNome());
        }
    }
}
