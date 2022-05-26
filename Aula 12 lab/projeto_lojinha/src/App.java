public class App {
    public static void main(String[] args) throws Exception {
      Produto manga = new Literartura(29.9, 10, "Descricao do Livro", "Gantz", "JDBC", "Alguem", 100, EnumGeneroLiteratura.G1);
      Produto coca = new Bebida(6, 8, "Refri de cola", "CocaCola", 350, EnumTemperaturas.FRIO, EnumAlergicos.GLUTEM, EnumTiposBebida.REFRIGERANTE);
      Produto tepokki = new Comida(24.5, 10, "Nhoque de arroz", "tepokki", 0.5, "coreia", EnumAlergicos.GLUTEM, EnumTipoComida.APIMENTADA);
    }

    public static String getPrecoComDesconto(IGerarDesconto produto){
        return "R$ " + produto.gerarDesconto();
    }
}
