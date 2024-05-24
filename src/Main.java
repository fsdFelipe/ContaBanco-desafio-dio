import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaTerminal conta = new ContaTerminal();
        
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();
        conta.setAgencia(agencia);

        if(agencia.equalsIgnoreCase("067-8")){
            System.out.println("Por favor, digite o número da Conta:");
            int numeroConta = scanner.nextInt();
            conta.setNumeroConta(numeroConta);

            if(numeroConta == 1021){
        System.out.println("Olá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + conta.getAgencia() + ", conta " + conta.getNumeroConta() + " e seu saldo "
                + conta.getSaldo() + " já está disponível para saque.");

        scanner.close();
            } else {
                System.out.println("Conta incorreta");
            }
        } else {
            System.out.println("Agencia incorreta ");
        }
    }
}