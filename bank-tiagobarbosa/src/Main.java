import model.Conta;

public class Main {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.deposita(200);
        System.out.println(primeiraConta.getSaldo());
        primeiraConta.deposita(300);
        System.out.println(primeiraConta.getSaldo());

        Conta segundaConta = new Conta();
        segundaConta.deposita(100);
        System.out.printf("Primeira conta %s \n", primeiraConta.getSaldo());
        System.out.printf("Segunda conta %s", segundaConta.getSaldo());
    }
}