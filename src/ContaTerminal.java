import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int numero;
    String agencia;
    String cliente;
    float saldo;

    System.out.println("Por favor, digite o número da Conta!");
    numero = sc.nextInt();
    System.out.println("Por favor, digite o número da Agência!");
    agencia = sc.next();
    System.out.println("Por favor, digite o nome do cliente!");
    cliente = sc.next();
    System.out.println("Por favor, digite o saldo !");
    saldo = sc.nextFloat();

    System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

    sc.close();
  }
}