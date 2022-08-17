public class Comida extends Produto {
    private final double peso;
    private final String origem;
    private final EnumAlergicos alergicos;
    private final EnumTipoComida tipo;
    
    public Comida(double preco, int quantidade, String descricao, String nome, double peso, String origem,
            EnumAlergicos alergicos, EnumTipoComida tipo) {
        super(preco, quantidade, descricao, nome);
        this.peso = peso;
        this.origem = origem;
        this.alergicos = alergicos;
        this.tipo = tipo;
    }
    public double getPeso() {
        return peso;
    }
    public String getOrigem() {
        return origem;
    }
    public EnumAlergicos getAlergicos() {
        return alergicos;
    }
    public EnumTipoComida getTipo() {
        return tipo;
    }
    @Override
    public double gerarDesconto() {
        return getPreco() * 0.95;
    }
}
