import model.Conta;

public class Main {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);
        primeiraConta.saldo += 300;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 100;
        System.out.printf("Primeira conta %s \n", primeiraConta.saldo);
        System.out.printf("Segunda conta %s", segundaConta.saldo);
    }
}