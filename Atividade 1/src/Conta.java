public class Conta {
    
    private int idConta;
    private double saldo;
    private Usuario usuario;
    
    public Contaa(int idConta, double saldo, Usuario usuario) {
        this.idConta = idConta;
        this.usuario = usuario;
        this.saldo = saldo;
    }

    public String visualizarSaldo(){
        return String.format("R$%.2f", saldo);
    }

    public boolean depositar(double valor){
        if(valor < 0) 
            return false;
        this.saldo += valor;
        return true;
    }

    public String toString(){
        return "idConta:" + idConta
        +"\nNome:" + cliente.getNome() 
        +"\nSaldo:"  + visualizarSaldo();  
    }
}
