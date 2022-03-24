public class Sistema {
    public void run(){
        Cliente cliente = new Cliente ("Endevour", "123456789", "putzsousegundo@gmail.com");
        Conta conta = new Conta(9865, cliente);
        System.out.println(conta);
    }
}
