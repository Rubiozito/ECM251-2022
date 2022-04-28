public class Usuario{
   
    private String nome;
    private String veiculoAtual;
    
    public Usuario(String nome) {
        this.nome = nome;
        veiculoAtual = "Sem Veiculo";
    }

    public String getNome() {
        return nome;
    }

    public String getVeiculoAtual() {
        return veiculoAtual;
    }

    public void setVeiculoAtual(String veiculoAtual) {
        this.veiculoAtual = veiculoAtual;
    }
   
    
}