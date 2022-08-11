public class App {
    public static void main(String[] args) throws Exception {
      Produto manga = new Literartura(29.9, 10, "Descricao do Livro", "Gantz", "JDBC", "Alguem", 100, EnumGeneroLiteratura.G1);
      Produto coca = new Bebida(6, 8, "Refri de cola", "CocaCola", 350, EnumTemperaturas.FRIO, EnumAlergicos.GLUTEM, EnumTiposBebida.REFRIGERANTE);
      Produto tepokki = new Comida(24.5, 10, "Nhoque de arroz", "tepokki", 0.5, "coreia", EnumAlergicos.GLUTEM, EnumTipoComida.APIMENTADA);

      System.out.println("Preços Regulares:");
      System.out.println(manga.getNome() + ":R$" + manga.getPreco());
      System.out.println(coca.getNome()+":R$"+coca.getPreco());
      System.out.println(tepokki.getNome()+ ":R$" + tepokki.getPreco());

      System.out.println("Preços com Desconto:");
      System.out.println(manga.getNome() + getPrecoComDesconto(manga));
      System.out.println(coca.getNome() + getPrecoComDesconto(coca));
      System.out.println(tepokki.getNome() + getPrecoComDesconto(tepokki));
      Teste teste = new Teste();
      System.out.println("Teste" + getPrecoComDesconto(teste));
    }

    public static String getPrecoComDesconto(IGerarDesconto produto){
        return "R$ " + produto.gerarDesconto();
    }
}
