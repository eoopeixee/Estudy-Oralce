package calculadoraAninha;

import java.util.Scanner;

public class calculadora {

	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Solicitar informações
	        System.out.print("Qual é o salário de Ana no mês? R$ ");
	        double salario = scanner.nextDouble();

	        System.out.print("Quanto Ana tem que pagar em dívidas? R$ ");
	        double dividas = scanner.nextDouble();

	        // Calcular o saldo final
	        double saldoFinal = salario - dividas;

	        // Verificar se Ana está com saldo negativo
	        if (saldoFinal < 0) {
	            double faltaPagar = Math.abs(saldoFinal);
	            System.out.printf("E agora Ana? Ainda faltam R$ %.2f\n", faltaPagar);
	        } else {
	            System.out.printf("No final do mês, Ana terá R$ %.2f sobrando.\n", saldoFinal);
	        }

	        // Fechar o scanner
	        scanner.close();
	    }
}
