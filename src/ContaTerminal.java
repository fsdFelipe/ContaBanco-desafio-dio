public class ContaTerminal {

    private int numeroConta;
    private String agencia;
    private String nomeCliente = "MARIO ANDRADE";
    private Double saldo =237.48;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public Double getSaldo() {
        return saldo;
    }
}
