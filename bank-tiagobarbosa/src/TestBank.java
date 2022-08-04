import model.Cliente;
import model.Conta;

public class TestBank {
    public static void main(String[] args) {
        Cliente tiago = new Cliente();
        tiago.nome = "Tiago Barbosa";
        tiago.cpf = "111.111.111-11";
        tiago.profissao = "programador";

        Conta conta1 = new Conta();
        conta1.deposita(1000);

        conta1.titular = tiago;

        System.out.printf("Titular: %s\nCpf: %s\nProfissão: %s\nSaldo: %s", conta1.titular.nome,
                conta1.titular.cpf, conta1.titular.profissao, conta1.saldo);
    }
}
