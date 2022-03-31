public class Atividade1 {
    public void run(){
        Usuario usuario1 = new Usuario("user1", "1234", "user1@email.com");
        Usuario usuario2 = new Usuario("user2", "567", "user2@email.com");
        Usuario usuario3 = new Usuario("user3", "8910", "user3@email.com");
        Conta conta1 = new Contas(001, 1000, usuario1);
        Conta conta1 = new Contas(002, 250, usuario2);
        Conta conta1 = new Contas(003, 3000, usuario3);
    }
}
