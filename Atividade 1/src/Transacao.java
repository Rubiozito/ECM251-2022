import java.util.concurrent.ThreadLocalRandom;

public class Transacao {
    public static String gerarQRcode(int idConta, String usuario, double valor){
        int numeroAleatorio = ThreadLocalRandom.current().nextInt(1000, 10000);
        return String.format("%d;%s;%2f;%d", idConta, usuario, valor, numeroAleatorio);
    }
}
