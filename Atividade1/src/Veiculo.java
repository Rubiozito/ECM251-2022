import java.util.concurrent.ThreadLocalRandom;

public class Veiculo {
    
    protected int ID;
    protected String tipo;
    protected double custoPorHora;
    
    public Veiculo(String tipo, double custoPorHora) {
        ID = ThreadLocalRandom.current().nextInt(10000, 99999);
        this.tipo = tipo;
        this.custoPorHora = custoPorHora;
    }

    public String testar(int ID, double custo){
        return String.format("O Veiculo %i tem o custo de %2f", ID, custo);
    }

    public int getID() {
        return ID;
    }

    public String getTipo() {
        return tipo;
    }

    public double getCustoPorHora() {
        return custoPorHora;
    }

    public void setCustoPorHora(double custoPorHora) {
        this.custoPorHora = custoPorHora;
    }
}
