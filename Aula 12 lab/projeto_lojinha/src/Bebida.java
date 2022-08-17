public class Bebida extends Produto{
    private final int volume;
    private final EnumTemperaturas temperatura;
    private final EnumAlergicos alergicos;
    private final EnumTiposBebida tipo;

    public Bebida(double preco, int quantidade, String descricao, String nome, int volume, EnumTemperaturas temperatura,
            EnumAlergicos alergicos, EnumTiposBebida tipo) {
        super(preco, quantidade, descricao, nome);
        this.volume = volume;
        this.temperatura = temperatura;
        this.alergicos = alergicos;
        this.tipo = tipo;
    }

    public int getVolume() {
        return volume;
    }

    public EnumTemperaturas getTemperatura() {
        return temperatura;
    }

    public EnumAlergicos getAlergicos() {
        return alergicos;
    }

    public EnumTiposBebida getTipo() {
        return tipo;
    }

    @Override
    public double gerarDesconto() {
        return getPreco() * 0.9;
    }

}
