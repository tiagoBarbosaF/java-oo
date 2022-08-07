import model.Cliente;
import model.Conta;

public class TestBank {
    public static void main(String[] args) {
        Cliente tiago = new Cliente();
        tiago.setNome("Tiago Barbosa");
        tiago.setCpf("111.111.111-11");
        tiago.setProfissao("programador");

        Conta conta1 = new Conta();
        conta1.deposita(1000);
        conta1.setTitular(tiago);

        System.out.printf("Titular: %s\nCpf: %s\nProfissão: %s\nSaldo: %s", conta1.getTitular().getNome(),
                conta1.getTitular().getCpf(), conta1.getTitular().getProfissao(), conta1.getSaldo());
    }
}
