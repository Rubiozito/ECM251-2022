public class Literartura extends Produto {
    private final String editora;
    private final String autor;
    private final int paginas;
    private final EnumGeneroLiteratura genero;
    
    public Literartura(double preco, int quantidade, String descricao, String nome, String editora, String autor,
            int paginas, EnumGeneroLiteratura genero) {
        super(preco, quantidade, descricao, nome);
        this.editora = editora;
        this.autor = autor;
        this.paginas = paginas;
        this.genero = genero;
    }

    public String getEditora() {
        return editora;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public EnumGeneroLiteratura getGenero() {
        return genero;
    }

    @Override
    public double gerarDesconto() {
        return getPreco();
    }
}
