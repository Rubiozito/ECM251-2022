public class Sistema {
    
    public static void run(){
        Usuario usuario1 = new Usuario("usuario1");
        Usuario usuario2 = new Usuario("usuario2");
        Veiculo carro = new Carro("Carro", 5);
        Veiculo moto = new Moto("Moto", 3);
        Veiculo bicicleta = new Bicicleta("Bicicleta", 2);
        Veiculo patinete = new Patinete("Patinete", 1);

        carro.testar(carro.ID, carro.custoPorHora);
        moto.testar(moto.ID, moto.custoPorHora);
        bicicleta.testar(bicicleta.ID, bicicleta.custoPorHora);
        patinete.testar(patinete.ID, carro.custoPorHora);
    }

    public static void alugar(Usuario usuario, String veiculoDesejado){
        if(usuario.getVeiculoAtual() == "Sem Veiculo"){
            usuario.setVeiculoAtual(veiculoDesejado);
        }
    }

    public static void trocar(Usuario usuarioT1, Usuario usuarioT2){
        String vaga;
        vaga = usuarioT1.getVeiculoAtual();
        usuarioT1.setVeiculoAtual(usuarioT2.getVeiculoAtual());
        usuarioT2.setVeiculoAtual(vaga);
    }
}
