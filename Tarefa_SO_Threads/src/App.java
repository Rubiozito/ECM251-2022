public class App {
    public static void main(String[] args) throws Exception {
        Account account = new Account(2000);
        Client clients[] = {
            new Client(account, "Cliente 1"),
            new Client(account, "Cliente 2"),
            new Client(account, "Cliente 3"),
            new Client(account, "Cliente 4"),
        };
        
        for (Client client : clients) {
            client.start();
        }
    }
}