
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alexm
 */
public class ContaTerminal {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o seu nome");
        String nomeCliente = scan.nextLine();
        
        System.out.println("Digite o número da sua agencia");
        String agencia = scan.nextLine();
        
        System.out.println("Digite o número da sua conta");
        int numeroConta = scan.nextInt();
        
        System.out.println("Digite o seu saldo");
        double saldo = scan.nextDouble();
        
        System.out.println("Olá "+ nomeCliente+ ", obrigado por criar uma conta"
                + " em nosso banco, sua agência é "+ agencia +", conta "+ numeroConta +
                " e seu saldo "+ saldo+ " já está disponível para saque");
    }
    
}
