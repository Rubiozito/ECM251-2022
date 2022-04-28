public class Moto extends Veiculo{

    public Moto(String tipo, double custoPorHora) {
        super(tipo, custoPorHora);
    }
    
    @Override
    public String testar(int ID, double custo){
        return String.format("O Veiculo %i tem o custo de %2f", ID, custo);
    }
}
