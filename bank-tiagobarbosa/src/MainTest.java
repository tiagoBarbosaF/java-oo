import model.Conta;

public class MainTest {
    public static void main(String[] args) {
        Conta conta1 = new Conta();

        conta1.saldo = 200;
        conta1.deposita(300);
        System.out.println(conta1.saldo);

        conta1.saca(150);
        System.out.println(conta1.saldo);

        Conta conta2 = new Conta();
        conta2.saldo = 1000;

        boolean transfere = conta2.transfere(300, conta1);
        if (transfere) {
            System.out.println("Transferencia realizada com sucesso.");
        } else {
            System.out.println("Não havia dinheiro suficiente.");
        }
    }
}
